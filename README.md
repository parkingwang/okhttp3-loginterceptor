[ ![Download](https://api.bintray.com/packages/msdx/maven/OkHttp3-LogInterceptor/images/download.svg) ](https://bintray.com/msdx/maven/OkHttp3-LogInterceptor/_latestVersion)

OkHttp3 LogInterceptor
===

An android log interceptor for okhttp3.

##How to use?

Gradle dependency:

```groovy
compile 'com.parkingwang:okhttp3-loginterceptor:latest.integration'
```

Java code:
```java
OkHttpClient okHttpClient = new OkHttpClient.Builder()
        .addInterceptor(new LogInterceptor()).build();
```

## What's the different with OkHttp-LogginInterceptor?

#### Show request and response id

This log interceptor can show the id of each request and response , so that we can know each response corresponds to which request.

```
W/OkHttp: [4 request]--> GET https://api.github.com/users/defunkt http/1.1
W/OkHttp: [4 request]--> END GET
W/OkHttp: [5 request]--> GET https://api.github.com/zen http/1.1
W/OkHttp: [5 request]--> END GET
W/OkHttp: [6 request]--> GET https://api.github.com/users/msdx http/1.1
W/OkHttp: [6 request]--> END GET
W/OkHttp: [4 response]<-- 200 OK https://api.github.com/users/defunkt (1335ms)
W/OkHttp: [4 response]Server: GitHub.com
W/OkHttp: [4 response]Date: Thu, 12 Jan 2017 04:01:43 GMT
W/OkHttp: [4 response]Content-Type: application/json; charset=utf-8
W/OkHttp: [4 response]Transfer-Encoding: chunked
...
```

#### Print the formatted JSON response

```
W/OkHttp: [6 response]{"login":"msdx","id":1903422,"avatar_url":"https://avatars.githubusercontent.com/u/1903422?v=3","gravatar_id":"","url":"https://api.github.com/users/msdx","html_url":"https://github.com/msdx","followers_url":"https://api.github.com/users/msdx/followers","following_url":"https://api.github.com/users/msdx/following{/other_user}","gists_url":"https://api.github.com/users/msdx/gists{/gist_id}","starred_url":"https://api.github.com/users/msdx/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/msdx/subscriptions","organizations_url":"https://api.github.com/users/msdx/orgs","repos_url":"https://api.github.com/users/msdx/repos","events_url":"https://api.github.com/users/msdx/events{/privacy}","received_events_url":"https://api.github.com/users/msdx/received_events","type":"User","site_admin":false,"name":" 浩码农","company":"CFuture","blog":"http://blog.csdn.net/maosidiaoxian","location":"Shenzhen, China","email":"msdx.android@qq.com","hireable":null,"bio":"Android coder","public_repos":65,"public_gists":8,"followers":150,"following":49,"created_at":"2012-06-28T18:10:03Z","updated_at":"2017-01-12T02:57:02Z"}
W/OkHttp: [6 response]
W/OkHttp: {
W/OkHttp:     "login": "msdx",
W/OkHttp:     "id": 1903422,
W/OkHttp:     "avatar_url": "https:\/\/avatars.githubusercontent.com\/u\/1903422?v=3",
W/OkHttp:     "gravatar_id": "",
W/OkHttp:     "url": "https:\/\/api.github.com\/users\/msdx",
W/OkHttp:     "html_url": "https:\/\/github.com\/msdx",
W/OkHttp:     "followers_url": "https:\/\/api.github.com\/users\/msdx\/followers",
W/OkHttp:     "following_url": "https:\/\/api.github.com\/users\/msdx\/following{\/other_user}",
W/OkHttp:     "gists_url": "https:\/\/api.github.com\/users\/msdx\/gists{\/gist_id}",
W/OkHttp:     "starred_url": "https:\/\/api.github.com\/users\/msdx\/starred{\/owner}{\/repo}",
W/OkHttp:     "subscriptions_url": "https:\/\/api.github.com\/users\/msdx\/subscriptions",
W/OkHttp:     "organizations_url": "https:\/\/api.github.com\/users\/msdx\/orgs",
W/OkHttp:     "repos_url": "https:\/\/api.github.com\/users\/msdx\/repos",
W/OkHttp:     "events_url": "https:\/\/api.github.com\/users\/msdx\/events{\/privacy}",
W/OkHttp:     "received_events_url": "https:\/\/api.github.com\/users\/msdx\/received_events",
W/OkHttp:     "type": "User",
W/OkHttp:     "site_admin": false,
W/OkHttp:     "name": " 浩码农",
W/OkHttp:     "company": "CFuture",
W/OkHttp:     "blog": "http:\/\/blog.csdn.net\/maosidiaoxian",
W/OkHttp:     "location": "Shenzhen, China",
W/OkHttp:     "email": "msdx.android@qq.com",
W/OkHttp:     "hireable": null,
W/OkHttp:     "bio": "Android coder",
W/OkHttp:     "public_repos": 65,
W/OkHttp:     "public_gists": 8,
W/OkHttp:     "followers": 150,
W/OkHttp:     "following": 49,
W/OkHttp:     "created_at": "2012-06-28T18:10:03Z",
W/OkHttp:     "updated_at": "2017-01-12T02:57:02Z"
W/OkHttp: }
W/OkHttp: [6 response]<-- END HTTP (1143-byte body)
```
