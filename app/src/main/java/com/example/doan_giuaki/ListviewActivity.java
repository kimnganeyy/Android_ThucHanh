package com.example.doan_giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.doan_giuaki.databinding.ActivityListviewBinding;
import com.example.doan_giuaki.databinding.ActivityAppBinding;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    ActivityListviewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.hoikysongdoi,R.drawable.hoikysongdoip2,R.drawable.hoikysongdoip5};
        String[] name = {"Hồi ký song đôi Phần 1","Hồi ký song đôi Phần 2","Hồi ký song đôi Phần 5"};
        String[] lastMessage = {"27/07/2015","27/07/2015","27/07/2015"};
        String[] sosao = {"5 sao","5 sao", "5 sao"};
        String[] phoneNo = {"Thơ - Tản văn","Thơ - Tản văn","Thơ - Tản văn"};
        String[] country = {"Tất cả chúng tôi lặng im đi một phút, một phần vì sợ Bác mắng do câu hỏi đường đột của đồng chí chúng tôi, một phần vì thấy nét mặt của Bác cũng dường như trầm ngâm trước câu hỏi đó. Người ta ai cũng muốn có gia đình (giọng Bác nói thong thả và dường như có hạ cung bậc). Bác cũng là người như các chú, Bác cũng muốn có đời sống gia đình đầm ấm. Nhưng các chú xem, hoàn cảnh của đời Bác không cho phép Bác lập được gia đình, đó là điều thiệt thòi cho Bác, mà Bác đâu có muốn thế! Rồi Bác cười: Bây giờ thì muộn quá rồi! Bây giờ, gia đình Bác là tất cả các cô các chú, là tất cả bà con, đồng bào. Không có gia đình riêng, thì Bác lấy gia đình chung làm cái vui của Bác, làm cái ấm áp của Bác.",
                "Anh nói xong, hai chúng tôi cùng cười xòa với nhau. Hôm 5-12-1985, anh Diệu tiễn tôi đi họp ở Sênêgan, tiễn tôi đến chân máy bay (đó là lần đầu tiên và cũng là lần cuối tiễn nhau đến tận máy bay như vậy), và anh còn dặn tôi: Cận nhớ mua kẹo ngon cho Diệu, thứ kẹo đặc biệt ở Paris ấy, có đắt một chút cũng chịu khó mua, biết còn sống được bao nhiêu năm nữa mà cứ phải nhịn thèm thì phí quá! Với lại Cận cũng phải thưởng cho bài giới thiệu tuyển tập viết cả một năm trời chứ. Lúc ghé qua Paris, trên đường đi Sênêgan, tôi đã mua một gói kẹo ngon cho bạn, có ngờ đâu lúc đem kẹo về Hà Nội là để cúng bạn...\n" +
                        "\n" +
                        "Còn quá nhiều điều bí mật trong Tình bạn đặc biệt Xuân - Huy, một cặp đôi tài danh trong làng thơ Việt Nam.\n" +
                        "\n" +
                        "Còn biết bao câu chuyện về làng văn, làng báo Việt Nam từ những năm 30 đến năm 1945. Và còn đó, lịch sử, con người của vùng đất Bắc và Bắc Trung bộ những nửa đầu thế kỷ 20 nữa. Tất cả được thể hiện chân thực tỉ mỉ mà đẹp như giai thoại...",
                "Tất cả chúng tôi lặng im đi một phút, một phần vì sợ Bác mắng do câu hỏi đường đột của đồng chí chúng tôi, một phần vì thấy nét mặt của Bác cũng dường như trầm ngâm trước câu hỏi đó. Người ta ai cũng muốn có gia đình (giọng Bác nói thong thả và dường như có hạ cung bậc). Bác cũng là người như các chú, Bác cũng muốn có đời sống gia đình đầm ấm. Nhưng các chú xem, hoàn cảnh của đời Bác không cho phép Bác lập được gia đình, đó là điều thiệt thòi cho Bác, mà Bác đâu có muốn thế! Rồi Bác cười: Bây giờ thì muộn quá rồi! Bây giờ, gia đình Bác là tất cả các cô các chú, là tất cả bà con, đồng bào. Không có gia đình riêng, thì Bác lấy gia đình chung làm cái vui của Bác, làm cái ấm áp của Bác."};

        ArrayList<App> appArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            App app = new App(name[i],lastMessage[i],sosao[i],phoneNo[i],country[i],imageId[i]);
            appArrayList.add(app);

        }



        ListAdapter listAdapter = new ListAdapter(ListviewActivity.this, appArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(ListviewActivity.this,AppActivity.class);
                i.putExtra("name",name[position]);
                i.putExtra("phone",phoneNo[position]);
                i.putExtra("country",country[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });
    }
    }
