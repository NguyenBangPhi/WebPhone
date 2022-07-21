<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="/customer/libs/slick/slick.css" />
    <link rel="stylesheet" href="/customer/libs/slick/slick-theme.css" />
    <link rel="stylesheet" href="/customer/index.css">
</head>
<body>
	<header style="background-color: #e0052b;">
        <div class="py-3">
            <div class="container-fluid" style="max-width: 1300px;">
                <div class="d-flex " style="align-items: center;">
                    <a href="/index"><img src="/customer/images/logo.png" alt="" width="200px" style="height: 100%;"></a>
                    
                    <div class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle boxDownDrop" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                            aria-expanded="false">
                            <div class="box">
                                <div class="box-icon">
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 23.22 30.36" style="height: 15px;">
                                        <defs>
                                            <style>.cls-1{fill:none;stroke:#fff;stroke-linecap:round;stroke-linejoin:round;stroke-width:1.8px;}</style>
                                        </defs>
                                        <g id="Layer_2" data-name="Layer 2">
                                            <g id="Layer_1-2" data-name="Layer 1">
                                                <path class="cls-1" d="M11.61.9A10.77,10.77,0,0,0,.9,11.69C.9,20.14,10.6,28.87,11,29.23a.87.87,0,0,0,1.18,0c.42-.36,10.12-9.09,10.12-17.54A10.77,10.77,0,0,0,11.61.9Z"></path>
                                                <path class="cls-1" d="M11.61,16.35a4.74,4.74,0,1,1,4.74-4.74,4.75,4.75,0,0,1-4.74,4.74Z"></path>
                                            </g>
                                        </g>
                                    </svg>
                                </div>
                                <div class="box-content">
                                    <p class="title">Xem giá tại</p>
                                    <p><span>Miền Nam</span> <i class="fas fa-chevron-down"></i></p>
                                </div>
                            </div>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Miền Bắc</a>
                            <a class="dropdown-item" href="#">Miền Trung</a>
                            <a class="dropdown-item" href="#">Miền Nam</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Tất cả</a>
                        </div>
                    </div>
                    <div class="form-group position-relative mb-0">
                        <input type="text" class="form-control " placeholder="Tìm kiếm sản phẩm ..." style="padding-right:35px ;border-radius: 15px;">
                        <div class="position-absolute" style="right: 10px;top:15%;">
                            <i class="fa fa-search"></i>
                        </div>
                    </div>
                    <div class="box-about justify-content-around">
                        <a href="" class="item-about about-contact">
                            <div class="about__box-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 30.83 30.94" width="24" height="24">
                                    <defs>
                                        <style>.cls-1 {
                                                fill: none;
                                                stroke: #fff;
                                                stroke-linecap: round;
                                                stroke-linejoin: round;
                                                stroke-width: 1.8px;
                                            }</style>
                                    </defs>
                                    <g id="Layer_2" data-name="Layer 2">
                                        <g id="Layer_1-2" data-name="Layer 1">
                                            <path class="cls-1" d="M6.78,20.27a31,31,0,0,0,10.29,8.06A15.91,15.91,0,0,0,22.82,30h.41a4.77,4.77,0,0,0,3.7-1.59,0,0,0,0,0,0,0,14.62,14.62,0,0,1,1.17-1.2c.28-.28.57-.56.85-.85A2.91,2.91,0,0,0,29,22L25.33,18.4a2.94,2.94,0,0,0-2.13-1,3.07,3.07,0,0,0-2.15,1l-2.16,2.17c-.2-.12-.4-.22-.6-.32a6.74,6.74,0,0,1-.66-.36,22.82,22.82,0,0,1-5.47-5A13.11,13.11,0,0,1,10.32,12c.56-.52,1.09-1.05,1.61-1.58l.55-.56a3.07,3.07,0,0,0,1-2.17,3.08,3.08,0,0,0-1-2.18l-1.8-1.8L10.07,3c-.4-.41-.82-.83-1.23-1.21A3,3,0,0,0,6.72.9a3.07,3.07,0,0,0-2.15.94L2.31,4.09a4.64,4.64,0,0,0-1.38,3,11.09,11.09,0,0,0,.84,4.83,28.11,28.11,0,0,0,5,8.37Z"></path>
                                        </g>
                                    </g>
                                </svg>
                            </div>
                            <div class="about__box-content">
                                <p class="mb-0 title">
                                    Gọi mua hàng
                                    <br>
                                    <strong>1800.2097</strong>
                                </p>
                            </div>
                        </a>
                        <a href="" class="item-about about-contact">
                            <div class="about__box-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 23.22 30.36" width="25" height="25">
                                    <defs>
                                        <style>.cls-1 {
                                                fill: none;
                                                stroke: #fff;
                                                stroke-linecap: round;
                                                stroke-linejoin: round;
                                                stroke-width: 1.8px;
                                            }</style>
                                    </defs>
                                    <g id="Layer_2" data-name="Layer 2">
                                        <g id="Layer_1-2" data-name="Layer 1">
                                            <path class="cls-1" d="M11.61.9A10.77,10.77,0,0,0,.9,11.69C.9,20.14,10.6,28.87,11,29.23a.87.87,0,0,0,1.18,0c.42-.36,10.12-9.09,10.12-17.54A10.77,10.77,0,0,0,11.61.9Z"></path>
                                            <path class="cls-1" d="M11.61,16.35a4.74,4.74,0,1,1,4.74-4.74,4.75,4.75,0,0,1-4.74,4.74Z"></path>
                                        </g>
                                    </g>
                                </svg>
                            </div>
                            <div class="about__box-content"><p class="mb-0 title">Cửa hàng<br>gần bạn</p></div>
                        </a>
                        <a href="" class="item-about about-contact">
                            <div class="about__box-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 44.22 25.85" height="24">
                                    <defs>
                                        <style>.cls-1, .cls-2, .cls-3 {
                                                fill: none;
                                                stroke: #fff;
                                                stroke-linecap: round;
                                                stroke-linejoin: round;
                                            }
    
                                            .cls-1 {
                                                stroke-width: 1.66px;
                                            }
    
                                            .cls-2 {
                                                stroke-width: 1.66px;
                                            }
    
                                            .cls-3 {
                                                stroke-width: 1.8px;
                                            }</style>
                                    </defs>
                                    <g id="Layer_2" data-name="Layer 2">
                                        <g id="Layer_1-2" data-name="Layer 1">
                                            <circle class="cls-1" cx="7.66" cy="22.02" r="3"></circle>
                                            <circle class="cls-2" cx="24.79" cy="22.02" r="3"></circle>
                                            <path class="cls-3" d="M28.61,22h4.13a1.44,1.44,0,0,0,1.44-1.44v-6"></path>
                                            <path class="cls-3" d="M27.12.9H14.82a1.44,1.44,0,0,0-1.44,1.44V20.58A1.44,1.44,0,0,0,14.82,22h6.29"></path>
                                            <path class="cls-3" d="M10.27,5.92H6.75A2.65,2.65,0,0,0,4.54,7.11L1.33,12A2.64,2.64,0,0,0,.9,13.47v6.46A2.1,2.1,0,0,0,3,22h.75"></path>
                                            <path class="cls-3" d="M34.18,3.47V2.34A1.44,1.44,0,0,0,32.74.9H25.08"></path>
                                            <line class="cls-3" x1="43.32" y1="6.97" x2="32.57" y2="6.97"></line>
                                            <line class="cls-3" x1="40.5" y1="11.05" x2="32.57" y2="11.05"></line>
                                            <line class="cls-3" x1="42.09" y1="16.33" x2="38.07" y2="16.33"></line>
                                        </g>
                                    </g>
                                </svg>
                            </div>
                            <div class="about__box-content"><p class="mb-0 title">Tra cứu<br>đơn hàng</p></div>
                        </a>
                        <a href="/index/giohang" class="item-about about-contact">
                            <div class="about__box-icon">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 28.95 35.07" width="25" height="25">
                                    <defs>
                                        <style>.cls-1 {
                                                fill: none;
                                                stroke: #fff;
                                                stroke-linecap: round;
                                                stroke-linejoin: round;
                                                stroke-width: 1.8px;
                                            }</style>
                                    </defs>
                                    <g id="Layer_2" data-name="Layer 2">
                                        <g id="Layer_1-2" data-name="Layer 1">
                                            <path class="cls-1" d="M10,10.54V5.35A4.44,4.44,0,0,1,14.47.9h0a4.45,4.45,0,0,1,4.45,4.45v5.19"></path>
                                            <path class="cls-1" d="M23.47,34.17h-18A4.58,4.58,0,0,1,.91,29.24L2.5,8.78A1.44,1.44,0,0,1,3.94,7.46H25a1.43,1.43,0,0,1,1.43,1.32L28,29.24A4.57,4.57,0,0,1,23.47,34.17Z"></path>
                                        </g>
                                    </g>
                                </svg>
                            </div>
                            <div class="about__box-content">
                                <p class="mb-0 title">Giỏ<br>hàng</p>
                                <span id="items_in_cart"></span>
                            </div>
                        </a>
                        <a href="/index/dangnhap" class="item-about about-contact about-smember">
                            <div class="about__box-icon">
                                <svg id="icon-smember" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 560 560" width="20">
                                    <defs>
                                        <style>#icon-smember .cls-1 {
                                                fill: none;
                                                stroke: #fff;
                                                stroke-width: 30px;
                                            }</style>
                                    </defs>
                                    <title>Asset 1</title>
                                    <g id="Layer_2" data-name="Layer 2">
                                        <g id="Layer_1-2" data-name="Layer 1">
                                            <circle class="cls-1" cx="280" cy="280" r="265"></circle>
                                            <circle class="cls-1" cx="280" cy="210" r="115"></circle>
                                            <path class="cls-1" d="M86.82,461.4C124.71,354.71,241.91,298.93,348.6,336.82A205,205,0,0,1,473.18,461.4"></path>
                                        </g>
                                    </g>
                                </svg>
                            </div>
                            <div class="about__box-content">
                                <p class="mb-0 title">Smember</p>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        
    </header>

    <section class="login my-5 text-center mx-auto">
        <div class="w-100">
            <form action="/index/dangnhap" method="post" class="w-50 mx-auto">
                <h1 class="h3 mb-3 font-weight-normal">Nhập vào tài khoản của bạn !</h1>
                <label for="inputEmail" class="sr-only">Username</label>
                <input type="text" id="inputUsername" class="form-control" placeholder="Username" autofocus="" name="username">
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password">
                <div class="checkbox mb-3 text-left">
                  <label>
                    <input type="checkbox" value="true" name="remember"> Nhớ mật khẩu ?
                  </label>
                  
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Đăng nhập</button>
                <a href="/index/dangki" class="btn btn-lg btn-primary btn-block">Đăng kí tài khoản</a>
                <button formaction="/index/nhanvien" class="btn btn-lg btn-primary btn-block">Qua trang nhân viên</button>
                <button class="btn btn-lg btn-primary btn-block" formaction="/index/quenmatkhau">Quên mật khẩu ?</button>
                ${message}
                ${error}
              </form>
        </div>
        
    </section>

     <!-- Site footer -->
     <footer class="site-footer mt-5">
        <div class="container">
          <div class="row">
            <div class="col-sm-12 col-md-6">
              <h6>About</h6>
              <p class="text-justify">Scanfcode.com <i>CODE WANTS TO BE SIMPLE </i> is an initiative  to help the upcoming programmers with the code. Scanfcode focuses on providing the most efficient code or snippets as the code wants to be simple. We will help programmers build up concepts in different programming languages that include C, C++, Java, HTML, CSS, Bootstrap, JavaScript, PHP, Android, SQL and Algorithm.</p>
            </div>
  
            <div class="col-xs-6 col-md-3">
              <h6>Categories</h6>
              <ul class="footer-links">
                <li><a href="http://scanfcode.com/category/c-language/">C</a></li>
                <li><a href="http://scanfcode.com/category/front-end-development/">UI Design</a></li>
                <li><a href="http://scanfcode.com/category/back-end-development/">PHP</a></li>
                <li><a href="http://scanfcode.com/category/java-programming-language/">Java</a></li>
                <li><a href="http://scanfcode.com/category/android/">Android</a></li>
                <li><a href="http://scanfcode.com/category/templates/">Templates</a></li>
              </ul>
            </div>
  
            <div class="col-xs-6 col-md-3">
              <h6>Quick Links</h6>
              <ul class="footer-links">
                <li><a href="http://scanfcode.com/about/">About Us</a></li>
                <li><a href="http://scanfcode.com/contact/">Contact Us</a></li>
                <li><a href="http://scanfcode.com/contribute-at-scanfcode/">Contribute</a></li>
                <li><a href="http://scanfcode.com/privacy-policy/">Privacy Policy</a></li>
                <li><a href="http://scanfcode.com/sitemap/">Sitemap</a></li>
              </ul>
            </div>
          </div>
          <hr>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-md-8 col-sm-6 col-xs-12">
              <p class="copyright-text">Copyright &copy; 2017 All Rights Reserved by 
           <a href="#">Scanfcode</a>.
              </p>
            </div>
  
            <div class="col-md-4 col-sm-6 col-xs-12">
              <ul class="social-icons">
                <li><a class="facebook" href="#"><i class="fab fa-facebook"></i></a></li>
                <li><a class="twitter" href="#"><i class="fab fa-twitter"></i></a></li>
                <li><a class="dribbble" href="#"><i class="fab fa-dribbble"></i></a></li>
                <li><a class="linkedin" href="#"><i class="fab fa-linkedin"></i></a></li>   
              </ul>
            </div>
          </div>
        </div>
  </footer>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>

    <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    
    <script src="/customer/libs/slick/slick.min.js"></script>

    <script>
        $(document).ready(function () {
            $('.slider__content').slick({ 
		  autoplay: true,
		  autoplaySpeed: 2000,
		                dots: true,
		                arrows:true,
		                infinite: true,
		                speed: 300,
		                slidesToShow: 5,
		                slidesToScroll: 5,
		                responsive: [
		                    {
		                        breakpoint: 1024,
		                        settings: {
		                            slidesToShow: 3,
		                            slidesToScroll: 3,
		                            infinite: true,
		                            dots: true
		                        }
		                    },
		                    {
		                        breakpoint: 600,
		                        settings: {
		                            slidesToShow: 2,
		                            slidesToScroll: 2
		                        }
		                    },
		                    {
		                        breakpoint: 480,
		                        settings: {
		                            slidesToShow: 1,
		                            slidesToScroll: 1
		                        }
		                    }
		                    // You can unslick at a given breakpoint now by adding:
		                    // settings: "unslick"
		                    // instead of a settings object
		                ]
		            });
		        });
    </script>
</body>
</html>