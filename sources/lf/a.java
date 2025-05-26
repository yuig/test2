package lf;

import a10.e;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.d;
import h32.a4;
import h32.d4;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jy.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.Charsets;
import kotlin.text.z;
import le.v;
import n60.o;
import p50.k;
import pc.c;
import pc.q0;
import pc.r0;
import r0.p0;
import x40.w;
import x92.b;

/* loaded from: classes3.dex */
public abstract class a implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static ValueCallback f83131a;

    public static final void a(b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        d.e(apiFieldsMap);
        apiFieldsMap.e("user.full_name");
        apiFieldsMap.e("user.explicitly_followed_by_me");
        o.w(apiFieldsMap, "user.implicitly_followed_by_me", "user.recent_story_pin_images", "user.image_medium_url", "user.image_large_url");
        apiFieldsMap.e("user.user_recommendation_reason");
    }

    public static final boolean b(FragmentActivity fragmentActivity, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        ValueCallback valueCallback2 = f83131a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        f83131a = valueCallback;
        if (fileChooserParams != null) {
            try {
                createIntent = fileChooserParams.createIntent();
            } catch (ActivityNotFoundException unused) {
                f83131a = null;
                return false;
            }
        } else {
            createIntent = null;
        }
        if (fragmentActivity != null) {
            fragmentActivity.startActivityForResult(createIntent, 100);
        }
        return true;
    }

    public static final PublicKey g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] decode = Base64.decode(z.n(z.n(z.n(key, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String h(String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        v vVar = v.f83104a;
        URL url = new URL("https", Intrinsics.n(v.f83121r, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        j0 j0Var = new j0();
        v.d().execute(new p0(url, j0Var, kid, reentrantLock, newCondition, 1));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) j0Var.f80434a;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static void j(a4 a4Var, d4 d4Var, String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new jy.a(a4Var, d4Var, s92.o.ABORTED, pinUid).i();
    }

    public static void k(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new g(pinUid).i();
    }

    public static void l(tc.g writer, pc.v customScalarAdapters, k value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("board");
        c.f99520a.d(writer, customScalarAdapters, value.f98871a);
        writer.M0("pageSize");
        c.f99521b.d(writer, customScalarAdapters, 50);
        r0 r0Var = value.f98872b;
        if (r0Var instanceof q0) {
            writer.M0("widgetCountForStyle");
            c.d(c.f99526g).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f98873c;
        if (r0Var2 instanceof q0) {
            writer.M0("widgetStyle");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var2);
        }
    }

    public static void m(tc.g writer, pc.v customScalarAdapters, w value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("conversationId");
        e eVar = c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133564a);
        writer.M0("message");
        eVar.d(writer, customScalarAdapters, value.f133565b);
        writer.M0("source");
        eVar.d(writer, customScalarAdapters, value.f133566c);
        r0 r0Var = value.f133567d;
        if (r0Var instanceof q0) {
            writer.M0("clientTrackingParams");
            c.d(c.f99524e).a(writer, customScalarAdapters, (q0) r0Var);
        }
    }

    public static final void n(int i13, int i14, Intent intent) {
        ValueCallback valueCallback;
        if (i13 != 100 || (valueCallback = f83131a) == null) {
            return;
        }
        valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i14, intent));
        f83131a = null;
    }

    public static final boolean o(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public abstract boolean c();

    public abstract String e();

    public abstract boolean i();
}
