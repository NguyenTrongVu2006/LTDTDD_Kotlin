fun main() {
    print("Nhập mã sinh viên: ")
    val maSV = readln().trim()
    print("Nhập họ và tên: ")
    val fullName = readln().trim()
    print("Nhập điểm Math: ")
    val math = readln().toDouble()
    print("Nhập điểm Programming: ")
    val programming = readln().toDouble()
    print("Nhập điểm Database: ")
    val database = readln().toDouble()

    val tongDiem = math + programming + database
    val gpa = tongDiem / 3.0
    val diemCaoNhat = maxOf(math, programming, database)
    val pass = gpa >= 5.0

    println("================ KẾT QUẢ HỌC TẬP ================")
    println("Mã sinh viên     : $maSV")
    println("Họ và tên        : $fullName")
    println("Điểm chi tiết    : Math: $math | Programming: $programming | Database: $database")
    println(" - Tổng điểm       : ${String.format("%.2f", tongDiem)}")
    println(" - Điểm trung bình : ${String.format("%.2f", gpa)}")
    println(" - Điểm cao nhất   : $diemCaoNhat")
    println("Kết quả đánh giá : ${if (pass) "ĐẠT" else "KHÔNG ĐẠT"}")
}