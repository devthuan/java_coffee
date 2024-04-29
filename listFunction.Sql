INSERT INTO chucnang (id, ten_cn, mo_ta, is_active) VALUES 
(1,"ADMIN", "full chức năng", 1),

(2,"READ_USER", "xem danh sách tất cả người dùng", 1),
(3,"CREATE_USER", "tạo người dùng mới", 1),
(4,"UPDATE_USER", "chỉnh sửa người dùng", 1),
(5,"DELETE_USER", "khoá tài khoản người dùng", 1),
(6,"IMPORT_USER", "tạo người dùng bằng import file excel", 1),
(7,"EXPORT_USER", "xuất danh sách tất cả người dùng", 1),

(8,"READ_PRODUCT", "xem danh sách tất cả sản phẩm", 1),
(9,"CREATE_PRODUCT", "tạo sản phẩm mới", 1),
(10,"UPDATE_PRODUCT", "chỉnh sửa sản phẩm", 1),
(11,"DELETE_PRODUCT", "khoá tài khoản sản phẩm", 1),
(12,"IMPORT_PRODUCT", "tạo sản phẩm bằng import file excel", 1),
(13,"EXPORT_PRODUCT", "xuất danh sách tất cả sản phẩm", 1),

(14,"READ_BILL", "xem danh sách tất cả đơn hàng", 1),
(15,"CREATE_BILL", "tạo đơn hàng mới", 1),
(16,"UPDATE_BILL", "chỉnh sửa đơn hàng", 1),
(17,"DELETE_BILL", "khoá tài khoản đơn hàng", 1),
(18,"IMPORT_BILL", "tạo đơn hàng bằng import file excel", 1),
(19,"EXPORT_BILL", "xuất danh sách tất cả đơn hàng", 1),

(20,"READ_WAREHOUSE", "xem danh sách tất cả kho nguyên liệu", 1),
(21,"CREATE_WAREHOUSE", "tạo kho nguyên liệu mới", 1),
(22,"UPDATE_WAREHOUSE", "nhập kho nguyên liệu", 1),
(23,"DELETE_WAREHOUSE", "khoá tài khoản kho nguyên liệu", 1),
(24,"IMPORT_WAREHOUSE", "tạo kho nguyên liệu bằng import file excel", 1),
(25,"EXPORT_WAREHOUSE", "xuất danh sách tất cả kho nguyên liệu", 1),


(26,"READ_EMPLOYEE", "xem danh sách tất cả nhân viên", 1),
(27,"CREATE_EMPLOYEE", "tạo nhân viên mới", 1),
(28,"UPDATE_EMPLOYEE", "chỉnh sửa nhân viên", 1),
(29,"DELETE_EMPLOYEE", "xoá tài khoản nhân viên", 1),
(30,"IMPORT_EMPLOYEE", "tạo nhân viên bằng import file excel", 1),
(31,"EXPORT_EMPLOYEE", "xuất danh sách tất cả nhân viên", 1),

(32,"READ_WAREHOUSE_RECEIPT", "xem danh sách tất cả phiếu nhập", 1),
(33,"CREATE_WAREHOUSE_RECEIPT", "tạo phiếu nhập mới", 1),
(34,"UPDATE_WAREHOUSE_RECEIPT", "chỉnh sửa phiếu nhập", 1),
(35,"DELETE_WAREHOUSE_RECEIPT", "xoá tài khoản phiếu nhập", 1),
(36,"IMPORT_WAREHOUSE_RECEIPT", "tạo phiếu nhập bằng import file excel", 1),
(37,"EXPORT_WAREHOUSE_RECEIPT", "xuất danh sách tất cả phiếu nhập", 1),

(38,"READ_WAREHOUSE_DISPATCH_NOTE", "xem danh sách tất cả phiếu xuất", 1),
(39,"CREATE_WAREHOUSE_DISPATCH_NOTE", "tạo phiếu xuất mới", 1),
(40,"UPDATE_WAREHOUSE_DISPATCH_NOTE", "chỉnh sửa phiếu xuất", 1),
(41,"DELETE_WAREHOUSE_DISPATCH_NOTE", "xoá tài khoản phiếu xuất", 1),
(42,"IMPORT_WAREHOUSE_DISPATCH_NOTE", "tạo phiếu xuất bằng import file excel", 1),
(43,"EXPORT_WAREHOUSE_DISPATCH_NOTE", "xuất danh sách tất cả phiếu xuất", 1),

(44,"READ_SUPPLIER", "xem danh sách tất cả nhà cung cấp", 1),
(45,"CREATE_SUPPLIER", "tạo nhà cung cấp mới", 1),
(46,"UPDATE_SUPPLIER", "chỉnh sửa nhà cung cấp", 1),
(47,"DELETE_SUPPLIER", "xoá tài khoản nhà cung cấp", 1),
(48,"IMPORT_SUPPLIER", "tạo nhà cung cấp bằng import file excel", 1),
(49,"EXPORT_SUPPLIER", "xuất danh sách tất cả nhà cung cấp", 1),


(50,"READ_STATISTICAL", "xem thống kê", 1),
(51,"EXPORT_STATISTICAL", "xuất file excel thống kê", 1);


INSERT INTO quyenchucnang (Quyen_id, ChucNang_id, is_active) VALUES 
-- admin
(1,1,1),

-- manager
-- group user
(2,2,1), -- 
(2,3,1),
(2,4,1),
-- (2,5,1), // xoá user
(2,6,1),
(2,7,1),
-- group product
(2,8,1),
(2,9,1),
(2,10,1),
-- (2,11,1),
(2,12,1),
(2,13,1),
-- group bill
(2,14,1),
(2,15,1),
-- (2,16,1),
-- (2,17,1), 
(2,18,1),
(2,19,1),
-- group warehouse
(2,20,1),
(2,21,1),
-- (2,22,1),
-- (2,23,1),
(2,24,1),
(2,25,1),
-- group statistical
(2,26,1),
(2,27,1),


-- Staff

-- group user
-- (3,2,1),
-- (3,3,1),
-- (3,4,1),
-- (3,5,1), // xoá user
-- (3,6,1),
-- (3,7,1),
-- group product
(3,8,1),
-- (3,9,1),
-- (3,10,1),
-- (3,11,1),
(3,12,1),
(3,13,1),
-- group bill
(3,14,1),
(3,15,1),
-- (3,16,1),
-- (3,17,1), 
-- (3,18,1),
-- (3,19,1),
-- group warehouse
(3,20,1),
-- (3,21,1),
-- (3,22,1),
-- (3,23,1),
-- (3,24,1),
(3,25,1);
-- group statistical
-- (3,26,1),
-- (3,27,1),

