/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChuongTrinhTracNghiem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class addCauHoi {
    
    private void getQuestion(String receiveMessage, ArrayList<CauHoiTracNghiem> list){
        String[] listQuestions = receiveMessage.split("@");
        System.out.print(listQuestions.length);
        System.out.println();
        for (int i = 0;i < listQuestions.length;i++){
            String[] str = listQuestions[i].split("_");
            CauHoiTracNghiem question = new CauHoiTracNghiem();
            int index =  Integer.parseInt(str[0]);
            question.setId(index);
            question.setCauHoi(str[1]);
            question.setCauA(str[2]);
            question.setCauB(str[3]);
            question.setCauC(str[4]);
            question.setCauD(str[5]);
            question.setDA(str[6]);
            list.add(question);
        }
    }
    
//    public static void main(String[] args) {
//        ArrayList<CauHoiTracNghiem> list = new ArrayList<>();
//    
////        CauHoiTracNghiem chtn = new CauHoiTracNghiem();
////        chtn.id = 1;
////        chtn.cauHoi = "Khái niệm \"đường bộ\" được hiểu như thế nào là đúng? Đường bộ gồm:";
////        chtn.cauA = "1- Đường bộ, cầu đường bộ.";
////        chtn.cauB = "2- Hầm đường bộ, bến phà đường bộ.";
////        chtn.cauC = "3- Đường, cầu đường bộ, hầm đường bộ, bến phà đường bộ và các công trình phụ trợ khác.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 2;
////        chtn.cauHoi = "Phương tiện giao thông \"đường bộ\" gồm những loại nào?";
////        chtn.cauA = "1- Phương tiện giao thông cơ giới đường bộ, phương tiện giao thông thô sơ đường bộ.";
////        chtn.cauB = "2- Phương tiện giao thông thô sơ đường bộ, phương tiện giao thông cơ giới đường bộ và xe máy chuyên dùng.";
////        chtn.cauC = "3- Cả hai ý nêu trên.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 3;
////        chtn.cauHoi = "Người điều khiển xe ô tô, xe máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn vượt quá bao nhiêu thì bị cấm?";
////        chtn.cauA = "1- Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu có nồng độ cồn vượt quá 50 miligam/100 mililit máu hoặc 0,25 miligam/1 lít khí thở.";
////        chtn.cauB = "2- Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn.";
////        chtn.cauC = "3- Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu có nồng độ cồn vượt quá 80 miligam/100 mililít máu hoặc 40 miligam/1 lít khí thở.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 4;
////        chtn.cauHoi = "Khi xảy ra tai nạn giao thông, những hành vi nào ghi ở dưới đây bị nghiêm cấm?";
////        chtn.cauA = "1- Xâm phạm tính mạng, sức khỏe, tài sản của người bị tai nạn giao thông; xâm phạm tính mạng, sức khỏe, tài sản của người gây tai nạn giao thông.";
////        chtn.cauB = "2- Lợi dụng việc xảy ra tai nạn giao thông để hành hung, đe dọa, xúi giục, gây sức ép, làm mất trật tự, cản trở việc xử lý tai nạn giao thông.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 5;
////        chtn.cauHoi = "Trên đường có nhiều làn đường cho xe đi cùng chiều được phân biệt bằng vạch kẻ phân làn đường, người điều khiển phương tiện phải cho xe đi như thế nào?";
////        chtn.cauA = "1- Xe thô sơ phải đi trên làn đường bên trái trong cùng; xe cơ giới, xe máy chuyên dùng đi trên làn đường bên phải.";
////        chtn.cauB = "2- Xe thô sơ phải đi trên làn đường bên phải trong cùng; xe cơ giới, xe máy chuyên dùng đi trên làn đường bên trái.";
////        chtn.cauC = "3- Xe thô sơ đi trên làn đường phù hợp không ây cản trở giao thông; xe cơ giới, xe máy chuyên dùng đi trên làn đường bên phải.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 6;
////        chtn.cauHoi = "Tại nơi đường giao nhau có báo hiệu đi theo vòng xuyến người điều khiển phương tiện phải nhường đường như thế nào?";
////        chtn.cauA = "1- Phải nhường đường cho xe đi bên phải.";
////        chtn.cauB = "2- Xe báo hiệu xin đường trước xe đo được đi trước.";
////        chtn.cauC = "3- Phải nhường đường cho xe đi bên trái.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 7;
////        chtn.cauHoi = "Người điều khiển phương tiện tham gia giao thông trong hầm đường bộ ngoài việc phải tuân thủ các quy tắc giao thông còn phải thực hiện những quy định nào ghi ở dưới đây?";
////        chtn.cauA = "1- Xe cơ giới, xe máy chuyên dùng phải bật đèn; xe thô sơ phải bật đèn hoặc có vật phát sáng báo hiệu; chỉ được dừng xe, đỗ xe ở nơi quy định.";
////        chtn.cauB = "2- Xe cơ giới phải bật đèn ngay cả khi đường hầm sáng; phải cho xe trên một làn đường và chỉ chuyển làn ở nơi được phép; được quay đầu xe, lùi xe khi cần thiết.";
////        chtn.cauC = "3- Xe máy chuyên dùng phải bật đèn ngay cả khi đường hầm sáng; phải cho xe chạy trên một làn đường và chỉ chuyển làn ở nơi được phép; được quay đầu xe, lùi xe khi cần thiết.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 8;
////        chtn.cauHoi = "Khi điều khiển xe chạy trên đường, người lái xe phải mang theo các loại giấy tờ gì?";
////        chtn.cauA = "1- Giấy phép lái xe, đăng ký xe, giấy phép lưu hành xe.";
////        chtn.cauB = "2- Lệnh vận chuyển, đăng ký xe, giấy phép lưu hành xe.";
////        chtn.cauC = "3- Giấy phép lái xe phù hợp với loại xe đó, đăng ký xe, giấy chứng nhận kiểm định kỹ thuật và bảo vệ môi trường, giấy chứng nhận bảo hiểm trách nhiệm dân sự của chủ xe cơ giới và giấy phép vận chuyển (nếu loại xe đó cần phải có).";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 9;
////        chtn.cauHoi = "Trên đường bộ trong khu vực đông dân cư, xe mô tô hai bánh, xe gắn máy tham gia giao thông với tốc độ tối đa cho phép là bao nhiêu?";
////        chtn.cauA = "1- 60km/h.";
////        chtn.cauB = "2- 50km/h.";
////        chtn.cauC = "3- 40km/h.";
////        chtn.cauD = "4- 30km/h.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 10;
////        chtn.cauHoi = "\"Vạch kẻ đường\" được hiểu như thế nào là đúng??";
////        chtn.cauA = "1- Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại.";
////        chtn.cauB = "2- Vạch kẻ đường là vạch chỉ sự phân biệt trí dừng, đỗ trên đường.";
////        chtn.cauC = "3- Tất cả các ý nêu trên.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 11;
////        chtn.cauHoi = "Khái niệm \"phương tiện giao thông cơ giới đường bộ\" được hiểu như thế nào là đúng?";
////        chtn.cauA = "1- Gồm xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, xe cơ giới dành cho người khuyết tật và xe máy chuyên dùng.";
////        chtn.cauB = "2- Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.";      
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 12;
////        chtn.cauHoi = "Người điều khiển xe mô tô, xe gắn máy trên đường mà trong máu có nồng độ cồn vượt quá bao nhiêu thì bị cấm?";
////        chtn.cauA = "1- Nồng độ cồn vượt quá 50 miligam/100 mililit máu.";
////        chtn.cauB = "2- Nồng độ cồn vượt quá 40 miligam/100 mililit máu.";
////        chtn.cauC = "3- Nồng độ cồn vượt quá 30 miligam/100 mililit máu.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 13;
////        chtn.cauHoi = "Việc sản xuất, mua bán, sử dụng biển xe cơ giới, xe máy chuyên dùng được quy định như thế nào trong Luật giao thông đường bộ?";
////        chtn.cauA = "1- Nghiêm cấm sản xuất, được phép sử dụng.";
////        chtn.cauB = "2- Nghiêm cấm mua bán, cho phép sử dụng.";
////        chtn.cauC = "3- Nghiêm cấm sản xuất, mua bán, sử dụng trái phép.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 14;
////        chtn.cauHoi = "Biển báo hiệu đường bộ gồm những nhóm nào, ý nghĩa của từng nhóm?";
////        chtn.cauA = "1- Nhóm biển báo cấm để biểu thị các điều cấm; nhóm biển báo hiệu nguy hiểm để cảnh báo các tình huống nguy hiểm có thể xảy ra, nhóm biển hiệu lệnh để báo hiệu các hiệu lệnh phải thi hành.";
////        chtn.cauB = "2- Nhóm biển chỉ dẫn để chỉ dẫn hướng đi hoặc các điều biết; nhóm biển phụ để thuyết minh bổ sung các loại biển báo cấm, biển báo nguy hiểm, biển hiệu lệnh và biển chỉ dẫn.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 15;
////        chtn.cauHoi = "Trên đường có nhiều làn đường, người điều khiển phương tiện tham gia giao thông sử dụng làn đường như thế nào là đúng?";
////        chtn.cauA = "1- Trên đường có nhiều làn đường cho xe đi cùng chiều được phân biêt bằng vạch kẻ phân làn đường, người điều khiển phương tiện phải cho xe đi trong một làn đường và chỉ được chuyển làn đường ở những nơi cho phép; khi chuyển làn đường phải có tín hiệu báo trước và đảm bảo an toàn.";
////        chtn.cauB = "2- Phương tiện tham gia giao thông đường bộ di chuyển tốc độ thấp hơn đi về bên trái.";
////        chtn.cauC = "3- Trên đường một chiều có vạch kẻ phân làn đường, xe thô sơ phải đi trên làn đường bên phải trong cùng xe cơ giới, xe máy chuyên dùng đi trên làn đường bên trái, phương tiện tham gia giao thông đường bộ di chuyển tốc độ thấp hơn đi về bên phải.";
////        chtn.DA = "AC";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 16;
////        chtn.cauHoi = "Tại nơi đường giao nhau, người lái xe đang đi trên đường không ưu tiên phải nhường đường như thế nào?";
////        chtn.cauA = "1- Nhường đường cho xe đi ở bên phải mình tới.";
////        chtn.cauB = "2- Nhường đường cho xe đi ở bên trái mình tới.";
////        chtn.cauC = "3- Nhường đường cho xe đi trên đường ưu tiên hoặc đường chính đi từ bất kì hướng nào tới.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 17;
////        chtn.cauHoi = "Người ngồi trên xe mô tô 2 bánh, xe mô tô 3 bánh, xe gắn máy phải đội mũ bảo hiểm có cài quay đúng quy cách khi nào?";
////        chtn.cauA = "1- Khi tham gia giao thông đường bộ.";
////        chtn.cauB = "2- Chỉ khi đi trên đường cao tốc.";    
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 18;
////        chtn.cauHoi = "Người đủ bao nhiêu tuổi trở lên thì được điều khiển xe mô tô 2 bánh, xe mô tô 3 bánh có dung tích xilanh từ 50 cm3 trở lên và các loại xe có kết cấu tương tự, xe ô tô tải, máy kéo có trọng tải dưới 3,5 tấn; xe ô tô chở người dưới 9 chỗ ngồi?";
////        chtn.cauA = "1- 16 tuổi.";
////        chtn.cauB = "2- 18 tuổi.";
////        chtn.cauC = "3- 17 tuổi.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 19;
////        chtn.cauHoi = "Trên đường bộ trong khu vực đông dân cư, loại xe nào tham gia giao thông với tốc độ tối đa cho phép là 40 km/h?";
////        chtn.cauA = "1- Ô tô chở người trên 30 chỗ ngồi, ô tô tải có trọng tải từ 3500kg trở lên, ô tô sơ mi rơ mooc, ô tô kéo rơ moóc, ô tô kéo xe khác, ô tô chuyên dùng, xe mô tô, xe gắn máy.";
////        chtn.cauB = "2- Ô tô chở người đến 30 chỗ ngồi, ô tô tải có trọng tải dưới 3500 kg.";
////        chtn.cauC = "3- Xe máy kéo, xe công nông, xe lam, xe lôi máy xe xích lô máy, xe ba gác máy, xe máy chuyên dùng và các loại xe tương tự (loại đang được phép hoạt động).";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 20;
////        chtn.cauHoi = "Khái niệm “phần đường xe chạy” được hiểu như thế nào là đúng?";
////        chtn.cauA = "1- Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.";
////        chtn.cauB = "2- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, dải đất dọc hai bên đường để đảm bảo an toàn giao thông.";
////        chtn.cauC = "3- Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, các công trình, thiết bị phụ trợ khác và dải đất dọc hai bên đường để đảm bảo an toàn giao thông.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 21;
////        chtn.cauHoi = "\"Phương tiện tham gia giao thông đường bộ\" gồm những loại nào?";
////        chtn.cauA = "1- Phương tiện giao thông cơ giới đường bộ.";
////        chtn.cauB = "2- Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 22;
////        chtn.cauHoi = "Người điều khiển xe mô tô, xe gắn máy trên đường mà trong khí thở có nồng độ cồn vượt quá bao nhiêu thì bị cấm ?";
////        chtn.cauA = "1- Nồng độ cồn vượt quá 0.25 miligam/1 lit khí thở.";
////        chtn.cauB = "2- Nồng độ cồn vượt quá 0.20 miligam/1 lit khí thở.";
////        chtn.cauC = "3- Nồng độ cồn vượt quá 0.15 miligam/1 lit khí thở.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 23;
////        chtn.cauHoi = "Người lái xe không được vượt xe khác khi gặp trường hợp nào ghi ở dưới đây?";
////        chtn.cauA = "1- Trên cầu hẹp có một làn xe, nơi đường giao nhau, đường bộ giao nhau cùng mức với đường sắt.";
////        chtn.cauB = "2- Điều kiện thời tiết hoặc đường không đảm bảo an toàn cho việc vượt, xe ưu tiên đang phát tín hiệu ưu tiên làm nhiệm vụ.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 24;
////        chtn.cauHoi = "Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh bằng hai tay hoặc một tay giang ngang để báo hiệu thì người tham gia giao thông phải đi như thế nào là đúng quy tắc giao thông?";
////        chtn.cauA = "1- Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại; người tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.";
////        chtn.cauB = "2- Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông được đi thẳng; người tham gia giao thông ở phía bên phải và bên trái người điều khiển giao thông được đi thẳng và rẽ phải.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 25;
////        chtn.cauHoi = "Xe sau có thể vượt lên bên phải xe khác đang chạy phía trước trong trường hợp nào?";
////        chtn.cauA = "1- Khi xe phía trước có tín hiệu rẽ trái hoặc đang rẽ trái, khi xe điện đang chạy giữa đường.";
////        chtn.cauB = "2- Khi có đủ khoảng trống để vượt xe.";
////        chtn.cauC = "3- Khi xe chuyên dùng đang làm việc trên đường mà không thể vượt bên trái được.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 26;
////        chtn.cauHoi = "Tại nơi đường giao nhau không có báo hiệu đi theo vòng xuyến, người điều khiển phương tiện phải nhường đường như thế nào là đúng quy tắc giao thông?";
////        chtn.cauA = "1- Phải nhường đường cho xe đi từ bên phải.";
////        chtn.cauB = "2- Xe báo hiệu xin đường trước xe đó được đi trước.";
////        chtn.cauC = "3- Phải nhường đường cho xe đi từ bên trái.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 27;
////        chtn.cauHoi = "Khi điều khiển xe mô tô 2 bánh, xe gắn máy được phép chở tối đa 2 người trong những trường hợp nào?";
////        chtn.cauA = "1- Chở người bệnh đi cấp cứu, trẻ em dưới 14 tuổi.";
////        chtn.cauB = "2- Áp giải người có hành vi vi phạm pháp luật.";
////        chtn.DA = "A";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 28;
////        chtn.cauHoi = "Tại ngã ba hoặc ngã tư không có đảo an toàn, người lái xe phải nhường đường như thế nào là đúng trong các trường hợp dưới đây?";
////        chtn.cauA = "1- Nhường đường cho xe đi trên đường nhánh từ bất kỳ hướng nào tới.";
////        chtn.cauB = "2- Nhường đường cho xe đi trên đường ưu tiên, đường chính đi từ bất kì hướng nào tới, nhường đường cho xe ưu tiên, nhường đường cho xe đi từ bên phải đến.";
////        chtn.cauC = "3- Nhường đường cho người đi bộ đang đi trên phần đường dành cho người đi bộ sang đường.";
////        chtn.DA = "AB";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 29;
////        chtn.cauHoi = "Trên đường bộ ngoài khu đông dân cư, loại xe nào tham gia giao thông với tốc độ tối đa cho phép là 50 km/h?";
////        chtn.cauA = "1- Ô tô chở người đến 30 chỗ ngồi (trừ ô tô buýt), ô tô tải có tải trọng dưới 3500 kg.";
////        chtn.cauB = "2- Ô tô chở người trên 30 chỗ ngồi (trừ ô tô buýt), ô tô tải có trọng tải dưới 3500 kg.";
////        chtn.cauC = "3- Ô tô kéo rơ moóc, ô tô kéo xe khác, xe gắn máy.";
////        chtn.cauD = "4- Ô tô buýt, ô tô sơ mi rơ moóc, ô tô chuyên dùng, xe mô tô.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 30;
////        chtn.cauHoi = "Khái niệm “Làn đường” được hiểu như thế nào là đúng?";
////        chtn.cauA = "1- Là một phần của đường được chia theo chiều ngang của đường, có bề rộng đủ cho xe đỗ an toàn.";
////        chtn.cauB = "2- Là một phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.";
////        chtn.cauC = "3- Cả 02 ý trên.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 31;
////        chtn.cauHoi = "“Người tham gia giao thông đường bộ” gồm những đối tượng nào?";
////        chtn.cauA = "1- Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ.";
////        chtn.cauB = "2- Người điều khiển, dẫn dắt súc vật, người đi bộ trên đường bộ.";
////        chtn.DA = "AB";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 32;
////        chtn.cauHoi = "Hành vi giao xe cơ giới, xe máy chuyên dùng cho người không đủ điều kiện để điều khiển xe tham gia giao thông có bị nghiêm cấm hay không?";
////        chtn.cauA = "1- Không bị nghiêm cấm.";
////        chtn.cauB = "2- Bị nghiêm cấm.";
////        chtn.cauC = "3- Nghiêm cấm tùy từng trường hợp.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 33;
////        chtn.cauHoi = "Người điều khiển xe mô tô hai bánh, ba bánh, xe gắn máy có được phép sử dụng xe để kéo, đẩy các xe khác, vật khác khi tham gia giao thông không?";
////        chtn.cauA = "1- Được phép.";
////        chtn.cauB = "2- Tùy trường hợp.";
////        chtn.cauC = "3- Không được phép.";
////        chtn.DA = "C";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 34;
////        chtn.cauHoi = "Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh tay giơ thẳng đứng để báo hiệu thì người tham gia giao thông phải đi như thế nào?";
////        chtn.cauA = "1- Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại; người tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.";
////        chtn.cauB = "2- Người tham gia giao thông ở các hướng phải dừng lại.";
////        chtn.cauC = "3- Tất cả các trường hợp trên.";
////        chtn.DA = "B";
////        list.add(chtn);
////        chtn = new CauHoiTracNghiem();
////        chtn.id = 35;
////        chtn.cauHoi = "Người lái xe phải làm gì khi quay đầu xe trên cầu, gầm cầu vượt, đường ngầm hay khu vực đường bộ giao nhau cùng mức với đường sắt?";
////        chtn.cauA = "1- Không được quay đầu xe.";
////        chtn.cauB = "2- Lợi dụng chỗ trống và phải có người làm tín hiệu sau xe để đảm bảo an toàn.";
////        chtn.cauC = "3- Lợi dụng chỗ trống có thể quay đầu được để quay đầu x echo an toàn.";
////        chtn.DA = "A";
////       
////        list.add(chtn);
////        
//        XFile.writeObject("test.txt", list);
//        System.out.println("OK");
//
//    }
//}