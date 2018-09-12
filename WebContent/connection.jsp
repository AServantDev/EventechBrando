<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="bootstrap.css">
<title>Page de Connexion</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>
	
	<img id="BannerConnexion" src="images/bannerPic1.jpeg">
	<center>
        <div class="container rounded">
            
                <form  action="" style="width: 500px; margin: auto;">
                        
                               
                        <div class="row">
                            <div class="col">
                                    
                                    <input id="formCt"  type="text" name="mail" class="form-control" placeholder="Email *">
                                    
                                   
                            </div>
                                <div class="col">
                                         
                                        <input  id="formCt" type="password" name="password" class="form-control" placeholder="Mot de passe *">     
                                </div>
                            </div>
                        </div>
                      
                            <div class="row">
                                    <div class="col">
                                            
                                        <input id="connectBtn"  class="btn btn-outline-danger" type="submit" value="Valider">
                                </div>
                                  </div>
                                
                                    
                </form>
        </div>
    </center>
	



	<jsp:include page="footer.html"></jsp:include>

</body>
</html>