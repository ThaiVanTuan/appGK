package com.example.appgk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class FragmentTrangChu extends Fragment {
        private ListView listView;
        private Nhac_Adapter adapter;
        private ArrayList<Nhac> nhacList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView= view.findViewById(R.id.listview_nhac);
        nhacList = new ArrayList<>();
        nhacList.add(new Nhac("Vì Anh Đâu Có Biết",R.drawable.vianhdaucobiet,"","Madihu ft. Vũ.","[Chorus]\n" +
                "Vì anh đâu có biết trái tim ngổn ngang\n" +
                "Vì anh đâu có biết đúng sai ngỡ ngàng\n" +
                "Vì anh luôn hối tiếc chiếc ôm dở dang\n" +
                "Chìm trong đôi mắt biếc anh không thể mang\n" +
                "Vì anh đâu có biết giấu đi thời gian\n" +
                "Vì anh đâu có biết nắng mai đang tàn\n" +
                "Vì anh luôn hối tiếc anh không thể mang\n" +
                "Mùi hương trên mái tóc giữ theo câu chuyện đánh rơi\n" +
                "\n" +
                "[Verse 1]\n" +
                "Loay hoay lạc trong từng cơn mưa ngu ngơ bước theo nơi đôi bờ mi đón đưa\n" +
                "Bâng khuâng chìm trong làn mây thưa, em ơi có rơi vào nhạt nhòa hay chưa?\n" +
                "Hay khi ngày em vô tình rơi, chơi vơi cuốn theo con tim này đi khắp nơi\n" +
                "Ngân nga lời ca còn buông lơi mang theo đắm say ngày nào còn trên môi\n" +
                "\n" +
                "[Pre chorus 1]\n" +
                "Bởi vì anh bởi vì anh\n" +
                "Bởi vì anh bởi vì anh ú u ù\n" +
                "\n" +
                "[Verse 2]\n" +
                "Em là mây trôi trong gió\n" +
                "Anh là cây nhiều đắn đo\n" +
                "Cành lá không còn xanh như giấc mơ của anh\n" +
                "Rơi xuống, xuống đi tìm kiếm câu trả lời anh đánh rơi\n" +
                "Vươn dài đôi tay ôm theo mây anh không có\n" +
                "Khi ngày hôm nay còn lại gì ngoài lí do\n" +
                "Nhìn áng mây mỏng manh, bay lướt qua thật nhanh\n" +
                "Anh ngỡ ra rằng chính câu trả lời anh đánh rơi là\n" +
                "\n" +
                "[Outro]\n" +
                "Vì anh đâu có biết giấu đi thời gian\n" +
                "Vì anh đâu có biết bởi vì anh đâu có hay\n" +
                "Rằng chính anh chẳng có em"));
        nhacList.add(new Nhac("Waiting For You",R.drawable.watingforyou,"","MONO,Onionn","Hoàng hôn dần buông, hạt mưa rơi xuống không gian lắng yên\n" +
                "Suy tư vấn vương ngồi mộng mơ đơn phương nhớ đến một nàng thơ\n" +
                "Gió đông ùa về mang những ê chề (woa)\n" +
                "Ngỡ là trái tim khô cằn héo úa sẽ thôi buồn đau\n" +
                "Nhưng thật cay đắng khi biết là ú òa\n" +
                "Mình chỉ là một người đến sau\n" +
                "(HEY)\n" +
                "\n" +
                "Biết em đã có người ở gần bên\n" +
                "Nhưng anh sẽ vẫn đứng ngay đây và chờ em\n" +
                "Mưa giông bão tố chẳng quan tâm đến ngày đêm\n" +
                "Kẻ si tình này chọn ở phía sau thầm nhớ mong em bae bae\n" +
                "\n" +
                "Vì say mê ánh mắt, yêu luôn cả bờ môi\n" +
                "Muốn nói với cả thế giới chỉ thương em mà thôi\n" +
                "Đắm đuối, uh cháy lên ngọn lửa tình yêu\n" +
                "Bùng lên mạnh mẽ và thiêu đốt baby that's what I feel\n" +
                "My girl, I'm waiting for you\n" +
                "\n" +
                "U u u u u u u u u (ye he)\n" +
                "Uno no nono, nono, nono, nono oh uh oh o o\n" +
                "Uh oh uh oh uh oh o o (ya ya ya)\n" +
                "Uh oh uh oh uh oh o o o (uho o)\n" +
                "Hey ih ye he eh ih ye e e e\n" +
                "Hey ih ye he eh eh\n" +
                "\n" +
                "Một bông hồng xinh tươi thắm hú trông em kiêu sa\n" +
                "Đôi chân thướt tha mặn mà\n" +
                "(UH)\n" +
                "Hương thơm miên man dịu dàng\n" +
                "(UH)\n" +
                "Dáng duyên nụ cười, say đắm yêu người\n" +
                "\n" +
                "I'm waiting for you (oh oh)\n" +
                "I'm waiting for you (oh oh)\n" +
                "Chờ em về đây với anh\n" +
                "Mình cùng đan bàn tay\n" +
                "Ấm áp bao đêm ngày (yeyeye)\n" +
                "\n" +
                "Chờ em chờ em, ừ thì chờ em\n" +
                "Chờ em chờ em, chờ đến bao giờ\n" +
                "Biển khô cạn, trời không còn đầy sao\n" +
                "Thì anh vẫn nơi đây và chờ em\n" +
                "\n" +
                "Uh oh uh oh uh oh o o (ya ya ya)\n" +
                "Uh oh uh oh uh oh o o o (uho o)\n" +
                "Hey ih ye he eh ih ye e e e e\n" +
                "Hey ih ye he eh eh"));
        nhacList.add(new Nhac("Bên Trên Tầng Lầu",R.drawable.bentrentanglau,"","Tăng Duy Tân","Verse 1:\n" +
                "Em ơi đừng khóc bóng tối trước mắt sẽ bắt em đi\n" +
                "Em ơi đừng lo em ơi đừng cho tương lai vụt tắt.\n" +
                "Sâu trong màu mắt có chút tiếc nuối phút cuối chỉ vì\n" +
                "Em đâu hề sai em đâu thể mãi để trái tim đau\n" +
                "\n" +
                "Pre:\n" +
                "Không còn tương lai, em cũng chẳng còn thương ai.\n" +
                "Sau bao niêm đau em mong rằng con tim em dừng lại.\n" +
                "Nỗi nhớ này lâu phai, nhốt em trong 1 lâu đài,\n" +
                "Lâu đài của những cơn đau bất tận\n" +
                "\n" +
                "Chorus:\n" +
                "Vì sao em phải khóc?\n" +
                "Có đáng để buồn đâu, tình yêu như cơn lốc thoáng phút chốc lướt qua thật mau.\n" +
                "Vì sao em phải khóc?\n" +
                "Có đáng để buồn đâu, rượu kề môi em nốc, thoáng phút chốc đã vơi u sầu\n" +
                "\n" +
                "Verse 2:\n" +
                "Buông bàn tay để chấm hết,\n" +
                "tất cả thứ làm em buồn,\n" +
                "bao gồm cả cuộc đời của em.\n" +
                "Em à cho dù có khóc,\n" +
                "cũng sẽ đến ngày phải quên,\n" +
                "thiên đường vẫn chờ ngày em đến\n" +
                "Pre:\n" +
                "Không còn tương lai, em cũng chẳng còn thương ai.\n" +
                "Sau bao niêm đau em mong rằng con tim em dừng lại.\n" +
                "Nỗi nhớ này lâu phai, nhốt em trong 1 lâu đài,\n" +
                "Lâu đài của những cơn đau bất tận\n" +
                "\n" +
                "Chorus:\n" +
                "Vì sao em phải khóc?\n" +
                "Có đáng để buồn đâu, tình yêu như cơn lốc thoáng phút chốc lướt qua thật mau.\n" +
                "Vì sao em phải khóc?\n" +
                "Có đáng để buồn đâu, rượu kề môi em nốc, thoáng phút chốc đã vơi u sầu"));
        nhacList.add(new Nhac("ThichThich",R.drawable.thichthich,"","Phương Ly","Em không được xinh đẹp, không hay cười duyên\n" +
                "Chẳng biết làm sao cho trông thật ngoan hiền như bao cô ngoài kia\n" +
                "Em đây nhìn cứ ngốc ngốc nghếch nghếch\n" +
                "Lắm lúc đứng ngắm mình trong gương, cứ thấy choáng váng\n" +
                "Nhưng mà anh ơi\n" +
                "Em rất là vâng lời, không la cà ham chơi\n" +
                "Em hồn nhiên, vô tư và yêu đời\n" +
                "Nên anh này, mong anh không cười chê\n" +
                "Nếu có thấy chán, em sẽ đến hát đàn anh nghe\n" +
                "Dẫu sáng, dẫu tối, em sẽ đến bên cạnh anh thôi\n" +
                "Anh sẽ thấy ngoài kia đấy bao cô gái như em\n" +
                "Cũng cần tình yêu, cần được hiểu, cần một chút nuông chiều\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Vì cuộc đời chẳng có gì ý nghĩa khi mà không có anh\n" +
                "Anh sẽ biết điều cần thiết là nắm lấy tay em\n" +
                "Vì lúc này đây, em chỉ muốn gần bên anh mỗi ngày\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Và thật lòng em chỉ cần anh biết một điều duy nhất là\n" +
                "Em thích anh\n" +
                "Thích, thích, thích, thích, ooh-woah-oh\n" +
                "Thích, thích, thích, thích, ooh-woah-oh\n" +
                "Thích, thích, thích, thích, ooh-woah-hoo\n" +
                "(Và thật lòng em chỉ cần anh biết một điều duy nhất là)\n" +
                "Sau bao ngày mong chờ\n" +
                "Mong anh lại bên em ta cùng vui, xin anh đừng hững hờ\n" +
                "Xa anh một giây thôi, trong lòng em đã thấy nhớ nhớ\n" +
                "Chỉ muốn nhấc máy gọi cho anh, nhưng em chẳng dám\n" +
                "Vì biết anh có nhớ đến em?\n" +
                "(Just close your eyes)\n" +
                "Anh sẽ thấy ngoài kia đấy bao cô gái như em\n" +
                "Cũng cần tình yêu, cần được hiểu, cần một chút nuông chiều\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Vì cuộc đời chẳng có gì ý nghĩa khi mà không có anh\n" +
                "Anh sẽ biết điều cần thiết là nắm lấy tay em\n" +
                "Vì lúc này đây, em chỉ muốn gần bên anh mỗi ngày\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Và thật lòng em chỉ cần anh biết một điều duy nhất là\n" +
                "Em thích anh\n" +
                "Có biết trái tim em đang rung rinh lên chỉ vì anh?\n" +
                "Nhưng đâu dám nói, chỉ biết hát khúc ca này tặng anh\n" +
                "Liệu anh có thích em không? (Hoh-oh, hoh-uh-oh-hoh)\n" +
                "Anh sẽ thấy ngoài kia đấy bao cô gái như em\n" +
                "Cũng cần tình yêu, cần được hiểu, cần một chút nuông chiều\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Vì cuộc đời chẳng có gì ý nghĩa khi mà không có anh\n" +
                "Anh sẽ biết điều cần thiết là nắm lấy tay em\n" +
                "Vì lúc này đây, em chỉ muốn gần bên anh mỗi ngày\n" +
                "I don't wanna let you go, 'cause I know I love you so\n" +
                "Và thật lòng em chỉ cần anh biết một điều duy nhất là\n" +
                "Em thích anh\n" +
                "Thích, thích, thích, thích, ooh-woah-oh\n" +
                "Thích, thích, thích, thích, ooh-woah-oh\n" +
                "Thích, thích, thích, thích, ooh-woah-hoo\n" +
                "(Và thật lòng em chỉ cần anh biết một điều duy nhất là...)"));
        nhacList.add(new Nhac("Chậm Lại",R.drawable.chamlai,"","Vũ.","Trời sắp sáng rồi, bao giấc mơ nay còn chưa tới\n" +
                "Trời sắp tối rồi, em nhớ nhung ai bên mình\n" +
                "\n" +
                "Cuối con đường là những vết thương\n" +
                "Kỉ niệm giấu đi còn không hết vấn vương\n" +
                "Em ngồi giữa hi vọng và những câu chuyện trong đầu\n" +
                "\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Để em thấy trong tim mình là ánh dương xuyên màn đêm\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Kìa đôi mắt em quay cuồng vì những lời yêu đầu\n" +
                "\n" +
                "Cuối con đường là những vết thương\n" +
                "Kỉ niệm giấu đi còn không hết vấn vương\n" +
                "Em ngồi giữa câu chuyện và những hi vọng trong đầu\n" +
                "\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Để em thấy trong tim mình là ánh dương xuyên màn đêm\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Kìa đôi mắt em quay cuồng vì những lời yêu đầu\n" +
                "\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Để em thấy trong tim mình là ánh dương xuyên màn đêm\n" +
                "Chậm lại 1 phút thôi Chậm lại 1 giây thôi\n" +
                "Kìa đôi mắt em quay cuồng\n" +
                "(Kìa đôi mắt em quay cuồng)"));
        nhacList.add(new Nhac("đứa nào làm em buồn?",R.drawable.duanaolamembuon,"","Phúc Du ft. Hoàng Dũng","[Phúc Du]\n" +
                "Anh biết tay em còn bắt máy, tai em còn muốn nghe, đôi ta còn hi vọng\n" +
                "Ném anh trăm lời quát mắng, vứt một lời chia tay, đừng tặng anh im lặng\n" +
                "Anh không giỏi nhìn người yêu anh buồn, anh chỉ giỏi làm người yêu anh buồn thôi\n" +
                "Bằng những lời anh cắn chặt mà môi hôn đắm nhất chẳng thể làm buột môi\n" +
                "Mỗi khi em hỏi mai sau của chúng ta, xin lỗi anh luôn lờ đi thật vô tình\n" +
                "Cứ coi nó như làn mi, treo ngay trước mắt nhưng vô hình\n" +
                "Dù anh biết hạnh phúc của em muốn là hàng ngày tan ca ở nhà chờ đón anh\n" +
                "Nhưng hạnh phúc của anh là thấy em hạnh phúc dù lúc đó là em chẳng có anh\n" +
                "Xin em đừng nghĩ là anh không yêu em khi anh chẳng hứa tương lai mình tới đâu\n" +
                "Thương em thì anh mới làm vậy bởi lời hứa và dối trá nó có họ với nhau\n" +
                "Và em ơi dù ở trong tình yêu, anh không phải là kẻ tử tế nhất\n" +
                "Nhưng anh chẳng đủ tệ để lấy cả thanh xuân của em mà không có thế chấp\n" +
                "Em đang có đủ tất cả để thành hôn trừ một gã người yêu đủ gọi là thành đạt\n" +
                "Lỡ em anh lỡ cả kho báu, lỡ anh em chỉ lỡ một canh bạc\n" +
                "Nên anh chẳng hiểu nổi được lí do em còn ở đây sau bao ngày dài hao\n" +
                "Anh chắc chắn là em còn yêu anh nhưng thứ anh không chắc duy nhất là tại sao?\n" +
                "\n" +
                "[Hoàng Dũng]\n" +
                "Đứa nào làm em buồn thế, nó yêu em nhưng nó tệ\n" +
                "Không một lời nào hẹn hứa sau này sẽ đến đâu\n" +
                "Không một nửa câu chắc chắn cho nhau\n" +
                "Đứa mà làm em buồn ấy, sao mà em thích nó đến vậy\n" +
                "Sao toàn làm em rơi nước mắt\n" +
                "Vậy mà em vẫn còn ở đây?\n" +
                "\n" +
                "[Phúc Du]\n" +
                "Anh đâu muốn lạc mất em chỉ vì lạc quan là thứ chưa thể giỏi\n" +
                "Nhưng anh sợ tình ta như tay đua, về sau chẳng có gì ngoài mệt mỏi\n" +
                "Không *** đưa em về nơi anh sống vì ở đó chôn cất phiền ưu riêng\n" +
                "Anh sợ thăm nhà anh một lát, em biết mình sẽ mãi chẳng đứng đầu ưu tiên\n" +
                "Em sẽ biết anh cất đâu lời hứa mà bước vào tình chẳng đem nổi nửa câu\n" +
                "*** ba cái “sau này con lớn” với “sau này cháu lớn” nên anh còn nữa đâu\n" +
                "Chứ ai muốn làm người yêu mình buồn, anh cũng muốn hứa em một ngày mai sáng\n" +
                "Ta yêu gấp mấy lần người thường, không biết cưới bao nhiêu đám thì mới đáng\n" +
                "Nhưng sao *** khi mai này thế nào đâu biết được dù mình có biếng chăm\n" +
                "Chim gõ kiến có thể đói vỡ mồm kể cả nó chỉ có cắm mặt vào kiếm ăn\n" +
                "Thật quá đáng nếu anh bắt em thông cảm với giông bão chắc chắn sẽ tới sau\n" +
                "Cùng anh nếu được thì ăn cả còn ngã về nhà mình ăn ngủ với nhau\n" +
                "Nên em nói không anh cũng sẽ hiểu, rõ ràng đặt cược vào anh là quá liều\n" +
                "Vì kẻ như anh mà một người buồn thôi, thực sự con số đấy đã là quá nhiều\n" +
                "Người như em xứng được che bởi bóng râm, thay vì tăm tối của một bầu trời đen\n" +
                "Anh không muốn tất cả ưu phiền em có chỉ đến từ một nửa của đời em\n" +
                "\n" +
                "[Hoàng Dũng]\n" +
                "Đứa nào làm em buồn thế, nó yêu em nhưng nó tệ\n" +
                "Không một lời nào hẹn hứa sau này sẽ đến đâu\n" +
                "Không một nửa câu chắc chắn cho nhau\n" +
                "Đứa mà làm em buồn ấy, sao mà em thích nó đến vậy\n" +
                "Sao toàn làm em rơi nước mắt\n" +
                "Vậy mà em vẫn còn ở đây?\n" +
                "Sao em không thể xa anh mau\n" +
                "Tương lai anh không chắc như bờ vai anh đâu\n" +
                "Buông anh đi thì sao nào\n" +
                "Buông anh đi thì sao nào\n" +
                "Buông anh đi"));
        nhacList.add(new Nhac("Ngã Tư Không Đèn",R.drawable.ngatukhongden,"","TRANG, Khoa Vũ","Hẹn nhau lúc bốn giờ, cà phê góc phố *** khi nắng ươm vàng\n" +
                "Lòng em như một giấc chiêm bao vẫn đang dở dang\n" +
                "Hẹn nhau lúc bốn giờ và anh luôn sớm hơn em, không chút vội vàng\n" +
                "Em sẽ nói vì phố quá đông khiến em thở than\n" +
                "\n" +
                "Tình yêu ta cứ như ngã tư không đèn\n" +
                "Người lại qua chẳng thể biết ta nên dừng lại hay đi tiếp\n" +
                "Cứ như thói *** , ta thường nhìn nhau trong nghi vấn\n" +
                "Tình yêu sao cứ như ngã tư không đèn\n" +
                "\n" +
                "Chẳng ai hay thế nên chúng ta thôi đừng bàn chuyện tương lai\n" +
                "Cứ vui với nhau bây giờ cũng đâu có sai\n" +
                "Hẹn nhau lúc bốn giờ nhiều khi chẳng để nói nhau câu gì\n" +
                "\n" +
                "Cùng nhau ngắm nhìn những lung linh cuối nơi hoàng hôn\n" +
                "Và rồi tới chín giờ thì em cũng muốn anh đưa em tới nhà\n" +
                "Ngập ngừng nơi hè phố vắng tanh, anh có muốn\n"));
        nhacList.add(new Nhac("Một Ngàn Nổi Đau",R.drawable.motngannoidau,"","Văn Mai Hương, Hứa Kim Tuyền","Anh, những lúc say em hay thường nghĩ...\n" +
                "Nếu ngày xưa ấy, em đến sớm hơn thì sao?\n" +
                "Chắc có lẽ ta đang vui với nhau\n" +
                "Chắc có lẽ ta đang xây với nhau\n" +
                "Một tình yêu, một giấc mơ\n" +
                "Anh, đã mấy tháng trôi qua khi ta cách xa\n" +
                "Đôi đường đôi ngả, giờ ta cũng sắp xa lạ...\n" +
                "Mỗi đêm em nhớ về anh\n" +
                "Vào lúc 11 giờ 11 phút\n" +
                "Nhưng chắc anh chẳng nhớ em đâu\n" +
                "Vì em vẫn chỉ là người đến sau\n" +
                "Vẫn mang trong mình một ngàn nỗi đau\n" +
                "Và có lẽ chắc giờ này, anh đang hạnh phúc bên người... oh oh...\n" +
                "Vì em vẫn mãi là người đến sau\n" +
                "Mãi mang trong mình một ngàn nỗi đau\n" +
                "Mong anh sớm quên em - người anh đã từng yêu thương.\n" +
                "Trong tình yêu có lẽ ai yêu hơn sẽ là người tổn thương nhiều hơn\n" +
                "Sẽ lâu lành hơn cũng như mất nhiều năm hơn để quên đi.\n" +
                "Nhưng vì do quá yêu nên càng hạnh phúc lại càng thấy nâng niu.\n" +
                "Kỷ niệm em xin giữ, còn người hãy cứ đi đi...\n" +
                "Vì sao anh nỡ làm tim em nát tan\n" +
                "Đến đây vội vàng rồi lại dở dang\n" +
                "Tình yêu cứ ngỡ dịu dàng\n" +
                "Bỗng dưng lại hóa bẽ bàng\n" +
                "Vì em vẫn mãi là người đến sau\n" +
                "Mãi mang trong mình một ngàn nỗi đau\n" +
                "Mong anh sớm quên em - người anh đã từng yêu thương."));
        nhacList.add(new Nhac("Chìm Sâu",R.drawable.chimsau,"","RPT MCK ft. Trung Trần","Tại vì sao bao nhiêu lâu nay anh thì thầm thả gió cuốn bay đi\n" +
                "Chạm vào môi đan vào tay của em ta đi chung bước với thời gian\n" +
                "Một nụ hôn thay cho bao nụ hồng em có muốn ngay khi\n" +
                "Ta vừa gặp nhau?\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Baby, anh không muốn em phải buông lệ sầu hoen đôi chân mi\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Anh chỉ mong em hạnh phúc trên cuộc đời này kể cả khi ta phân li\n" +
                "My mind is a mess (my mind)\n" +
                "Em đẹp từng cm\n" +
                "Bae don't foolin' me (yeah)\n" +
                "Em chỉ cần sayin' yes\n" +
                "Bởi vì anh sẽ cố dẫn em vào tròng (sẽ dẫn em vào tròng)\n" +
                "Nói hết những câu thật lòng (yeah, nói hết thật lòng)\n" +
                "Smoke weed get high\n" +
                "Mặc kệ bad vibe của last night\n" +
                "Vì cho dù là còn thương\n" +
                "Hay cho dù là đã quên\n" +
                "Chỉ cần còn tình yêu là ta sẽ đến được thiên đường\n" +
                "Mình quấn quýt vào nhau (vào nhau)\n" +
                "Thật lâu (thật lâu)\n" +
                "Rồi sẽ phải đến lúc em gật đầu\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Baby, anh không muốn em phải buông lệ sầu hoen đôi chân mi\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Anh chỉ mong em hạnh phúc trên cuộc đời này kể cả khi ta phân li\n" +
                "Là bởi vì em quá xinh đẹp!\n" +
                "Quá đỗi yêu kiều?\n" +
                "Xung quanh bao nhiêu cậu trai\n" +
                "Muốn chiếm tim em\n" +
                "Nhưng chỉ có anh ở đây si mê em nhường này\n" +
                "Vậy đừng phí thêm thời gian hãy hôn anh đúng khi màn đêm\n" +
                "Buông trên phím đàn\n" +
                "Ta như mơ màng\n" +
                "Đôi chân miên man\n" +
                "Đam mê tiếng nhạc, hooh-hooh-hooh-huh\n" +
                "Và để rồi khi, bình minh vương trên môi êm\n" +
                "Anh nâng đôi tay, để nói với em\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Baby, anh không muốn em phải buông lệ sầu hoen đôi chân mi\n" +
                "You got me, got me chìm sâu (got me, got me chìm sâu)\n" +
                "But I'm all go\n" +
                "Anh chỉ mong em hạnh phúc trên cuộc đời này kể cả khi ta phân li"));
        nhacList.add(new Nhac("vaicaunoicokhiennguoithaydoi",R.drawable.vaicaunoi,"","GREY D x tlinh","Thức thâu đêm để nghĩ suy về em nhiều\n" +
                "Thật ra có những điều làm cho anh\n" +
                "Không yên được giấc\n" +
                "Bấy lâu ta không nói nhau một câu nào\n" +
                "Chờ dòng tin nhắn chào\n" +
                "Trở lại cảm giác như lúc trước\n" +
                "\n" +
                "Có phải vì anh vẫn thường vô ý\n" +
                "Chẳng suy nghĩ, vài lần khiến em u sầu\n" +
                "Có phải vì anh trót vài câu nói\n" +
                "Chạm vào nơi niềm đau\n" +
                "mà người luôn chôn giấu\n" +
                "\n" +
                "[Chorus]\n" +
                "Vài câu nói có khiến người thay đổi\n" +
                "Có khiến bờ môi ấm êm\n" +
                "Nay chỉ còn trong nỗi nhớ\n" +
                "Vài câu nói kéo đến màu u tối\n" +
                "Cuốn hết bình yên lúc xưa bên cạnh nhau\n" +
                "Mãi đi xa để mình ta trong căn phòng\n" +
                "cùng nước mắt trong lòng\n" +
                "\n" +
                "[Verse 2]\n" +
                "Chẳng còn giọt nước mắt nào cho em rơi\n" +
                "Cũng chẳng còn gì tha thiết để nói nên lời\n" +
                "Sẽ chỉ mang đến thêm u sầu\n" +
                "Làm dấu yêu phai màu\n" +
                "Chẳng biết ta phải đi về đâu\n" +
                "\n" +
                "Giờ thì lời xin lỗi còn kịp thời ?\n" +
                "Làm sao khi cảm xúc em nguội rồi\n" +
                "Bao nhiêu lần như thế rồi\n" +
                "Không còn cơ hội nào cho anh nữa đâu\n" +
                "Tổn thương nhau bấy nhiêu đây thôi\n" +
                "\n" +
                "Có phải vì anh (cũng tại vì anh)\n" +
                "Vẫn thường vô ý\n" +
                "Làm em rối trí\n" +
                "Ngày đêm tối nghĩ suy\n" +
                "Vậy mà người vô tâm nào biết gì đâu\n" +
                "Có phải vì anh\n" +
                "Trót vài câu nói\n" +
                "Chạm vào nơi niềm đau mà người luôn chôn giấu\n" +
                "\n" +
                "[Chorus]\n" +
                "Vài câu nói có khiến người thay đổi\n" +
                "Có khiến bờ môi ấm êm\n" +
                "Nay chỉ còn trong nỗi nhớ\n" +
                "Vài câu nói kéo đến màu u tối\n" +
                "Cuốn hết bình yên lúc xưa bên cạnh nhau\n" +
                "Mãi đi xa để mình ta trong căn phòng\n" +
                "cùng nước mắt trong lòng\n" +
                "\n" +
                "Bridge:\n" +
                "Vì dòng cảm xúc không thể trở về như lúc ta vừa bắt đầu\n" +
                "Và sẽ như thế nào nếu bỏ lại ngày tháng đã từng với nhau\n" +
                "\n" +
                "Một vài câu nói vô tình đẩy lùi mọi thứ về thì quá khứ\n" +
                "Baby i just wanna say im sorry"));

        adapter= new Nhac_Adapter(getContext(),R.layout.custom_itemnhac,nhacList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("key1",nhacList.get(i).getImg());
                intent.putExtra("key2",nhacList.get(i).getTenNhac());
                intent.putExtra("key3",nhacList.get(i).getTacGia());
                intent.putExtra("key4",nhacList.get(i).getTenCaSi());
                intent.putExtra("key5",nhacList.get(i).getMoTa());
                startActivity(intent);
            }
        });



        return view;
    }
}