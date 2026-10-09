1public class Codec {
2
3    // Encodes a URL to a shortened URL.
4    private Map<String, String> map = new HashMap<>();
5    private int n = 0;
6    private String domain = "http://tinyurl.com/";
7
8    public String encode(String longUrl) {
9        n++;
10        String shortUrl = domain + n;
11        map.put(shortUrl, longUrl);
12        return shortUrl;
13    }
14
15    // Decodes a shortened URL to its original URL.
16    public String decode(String shortUrl) {
17        return map.get(shortUrl);
18    }
19}
20
21// Your Codec object will be instantiated and called as such:
22// Codec codec = new Codec();
23// codec.decode(codec.encode(url));