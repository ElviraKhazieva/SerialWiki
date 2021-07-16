<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <title>Main</title>
</head>
<body>
<header>
</header>
<div class="container">
    <section class="mt-5 mb-4">
        <div class="row">
            <div class="col"></div>
            <div class="col-8 align-self-center">
                <div class="card wish-list mb-4">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="mb-4 text-black-80 mt-0 font-weight-bold">Добавить подкаст</h3>
                            <h4 class="error-message" id="error-message"></h4>
                            <hr>
                            <form action="/create" method="post" enctype="multipart/form-data">
                                <div class="form-group">
                                    <label>название
                                        <input name="name" type="text" class="form-control" placeholder="Title"
                                               required>
                                    </label>
                                </div>

<#--                                <div class="form-group">-->
<#--                                    <label>Image-->
<#--                                        <input name="image" type="file" accept="image/*" required>-->
<#--                                    </label>-->
<#--                                </div>-->

                                <div class="form-group">
                                    <label for="director">Режисёр</label>
                                    <select class="form-control " name="director" id="director">
                                        <#list directors as d>
                                            <option value="${d.getId()}">${d.getFirstName()} ${d.getLastName()}</option>
                                        </#list>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <label for="genre">Жанры</label>
                                    <select class="form-check " name="genres" id="genre">
                                        <#list genres as g>
                                            <input class="form-check-input" type="checkbox" value="${g.getId()}" id="">
                                            <label class="form-check-label" for="defaultCheck1">
                                                ${g.getName()}
                                            </label>
                                        </#list>
                                    </select>
                                </div>

                                <button class="btn btn-primary" type="submit">Добавить</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col"></div>
        </div>
    </section>
</div>

<script src="/js/fontawesome.js"></script>
<script src="/js/jquery-3.5.1.min.js"></script>
<script src="/js/bootstrap.bundle.js"></script>
</body>
</html>