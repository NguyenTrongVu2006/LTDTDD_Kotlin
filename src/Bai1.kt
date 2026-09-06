fun main() {
    val maSV = "2415053122150"
    val fullName = "Nguyen Trong Vu"
    val math = 8.5
    val programming = 9.0
    val database = 7.5

    val tongDiem = math + programming + database
    val gpa = tongDiem / 3.0
    val diemCaoNhat = maxOf(math, programming, database)
    val pass = gpa >= 5.0

    println("================ KẾT QUẢ HỌC TẬP ================")
    println("Mã sinh viên     : $maSV")
    println("Họ và tên        : $fullName")
    println("Điểm chi tiết    : Math: $math | Programming: $programming | Database: $database")
    println(" Tổng điểm       : ${String.format("%.2f", tongDiem)}")
    println(" Điểm trung bình : ${String.format("%.2f", gpa)}")
    println(" Điểm cao nhất   : $diemCaoNhat")
    println("Kết quả đánh giá : ${if (pass) "ĐẠT" else "KHÔNG ĐẠT"}")
}