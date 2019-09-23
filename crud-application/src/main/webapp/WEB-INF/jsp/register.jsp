<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
    <link rel="stylesheet" href="../css/register.css">
</head>
<body>
  <div class="container">
    <div class="row">
      <div class="col-lg-4 col-xl-4 mx-auto">
        <div class="card card-signin flex-row my-5">
          
          <div class="card-body">
            <h5 class="card-title text-center">Register</h5>
            <form class="form-signin" method = "POST" action = "/np/save">
              <div class="form-label-group">
                <input type="text" id="inputUserame" class="form-control" name="userName" placeholder="Username" required autofocus>
                <label for="inputUserame">Username</label>
              </div>

              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" name="email" placeholder="Email address" required>
                <label for="inputEmail">Email address</label>
              </div>
              
              <hr>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>
              
              <div class="form-label-group">
                <input type="text" id="designation" class="form-control" name="designation" placeholder="Designation" required>
                <label for="designation">Designation</label>
              </div>

				<input type="submit" value="Register" class="btn btn-lg btn-primary btn-block text-uppercase">
              
              <a class="d-block text-center mt-2 small" href="/np/">Sign In</a>
              <hr class="my-4">
             
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>