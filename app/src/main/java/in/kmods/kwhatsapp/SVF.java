package in.kmods.kwhatsapp;

import android.util.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SVF {
    /*
    *   Class: Ld/f/ja/Bb;
    */

    /*  1
     *  Replace: invoke-static {v3, v2, v1, v0}, Ld/f/X/a;->a([B[BII)Ljavax/crypto/SecretKey;
     *  invoke-static {}, Lin/kmods/kwhatsapp/SVF;->SecretKey()Ljavax/crypto/SecretKey;
     */
    public static SecretKey SecretKey() {
        byte[] decode = Base64.decode("eQV5aq/Cg63Gsq1sshN9T3gh+UUp0wIw0xgHYT1bnCjEqOJQKCRrWxdAe2yvsDeCJL+Y4G3PRD2HUF7oUgiGow==", 0);
        return new SecretKeySpec(decode, 0, decode.length, "PBKDF2WithHmacSHA1And8BIT");
    }

    /*  2
     *  Replace: invoke-static {p0}, Lc/a/f/r;->a(Landroid/content/Context;)[Landroid/content/pm/Signature;
     *  invoke-static {}, Lin/kmods/kwhatsapp/SVF;->Signature()[B
     */
    public static byte[] Signature() {
        return Base64.decode("MIIDMjCCAvCgAwIBAgIETCU2pDALBgcqhkjOOAQDBQAwfDELMAkGA1UEBhMCVVMxEzARBgNVBAgTCkNhbGlmb3JuaWExFDASBgNVBAcTC1NhbnRhIENsYXJhMRYwFAYDVQQKEw1XaGF0c0FwcCBJbmMuMRQwEgYDVQQLEwtFbmdpbmVlcmluZzEUMBIGA1UEAxMLQnJpYW4gQWN0b24wHhcNMTAwNjI1MjMwNzE2WhcNNDQwMjE1MjMwNzE2WjB8MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEUMBIGA1UEBxMLU2FudGEgQ2xhcmExFjAUBgNVBAoTDVdoYXRzQXBwIEluYy4xFDASBgNVBAsTC0VuZ2luZWVyaW5nMRQwEgYDVQQDEwtCcmlhbiBBY3RvbjCCAbgwggEsBgcqhkjOOAQBMIIBHwKBgQD9f1OBHXUSKVLfSpwu7OTn9hG3UjzvRADDHj+AtlEmaUVdQCJR+1k9jVj6v8X1ujD2y5tVbNeBO4AdNG/yZmC3a5lQpaSfn+gEexAiwk+7qdf+t8Yb+DtX58aophUPBPuD9tPFHsMCNVQTWhaRMvZ1864rYdcq7/IiAxmd0UgBxwIVAJdgUI8VIwvMspK5gqLrhAvwWBz1AoGBAPfhoIXWmz3ey7yrXDa4V7l5lK+7+jrqgvlXTAs9B4JnUVlXjrrUWU/mcQcQgYC0SRZxI+hMKBYTt88JMozIpuE8FnqLVHyNKOCjrh4rs6Z1kW6jfwv6ITVi8ftiegEkO8yk8b6oUZCJqIPf4VrlnwaSi2ZegHtVJWQBTDv+z0kqA4GFAAKBgQDRGYtLgWh7zyRtQainJfCpiaUbzjJuhMgo4fVWZIvXHaSHBU1t5w//S0lDK2hiqkj8KpMWGywVov9eZxZy37V26dEqr/c2m5qZ0E+ynSu7sqUD7kGx/zeIcGT0H+KAVgkGNQCo5Uc0koLRWYHNtYoIvt5R3X6YZylbPftF/8ayWTALBgcqhkjOOAQDBQADLwAwLAIUAKYCp0d6z4QQdyN74JDfQ2WCyi8CFDUM4CaNB+ceVXdKtOrNTQcc0e+t", 0);
    }

    /*  3
     *  Replace: invoke-static {p0}, Ld/f/X/a;->e(Landroid/content/Context;)[B
     *  invoke-static {}, Lin/kmods/kwhatsapp/SVF;->Hash()[B
     */
    public static byte[] Hash() {
        return Base64.decode("L5yJTQQk+IA8XgZPsWwyUg==", 0);
    }
}
