package bc;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.w;
import java.io.IOException;
import java.util.Map;
import jc.b;
import jc.g;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f22614d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f22615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22616b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f22617c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f22616b = str;
        } else {
            this.f22616b = str.concat("/");
        }
        this.f22617c = map;
        if (callback instanceof View) {
            this.f22615a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f22615a = null;
        }
    }

    public final Bitmap a(String str) {
        String str2 = this.f22616b;
        w wVar = (w) this.f22617c.get(str);
        if (wVar == null) {
            return null;
        }
        Bitmap bitmap = wVar.f28477f;
        if (bitmap != null) {
            return bitmap;
        }
        Context context = this.f22615a;
        if (context == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str3 = wVar.f28475d;
        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                synchronized (f22614d) {
                    ((w) this.f22617c.get(str)).f28477f = decodeByteArray;
                }
                return decodeByteArray;
            } catch (IllegalArgumentException e13) {
                b.d("data URL did not have correct base64 format.", e13);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + str3), null, options);
                if (decodeStream == null) {
                    b.c("Decoded image `" + str + "` is null.");
                    return null;
                }
                Bitmap e14 = g.e(decodeStream, wVar.f28472a, wVar.f28473b);
                synchronized (f22614d) {
                    ((w) this.f22617c.get(str)).f28477f = e14;
                }
                return e14;
            } catch (IllegalArgumentException e15) {
                b.d("Unable to decode image `" + str + "`.", e15);
                return null;
            }
        } catch (IOException e16) {
            b.d("Unable to open asset.", e16);
            return null;
        }
    }

    public final boolean b(Context context) {
        Context context2 = this.f22615a;
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == context2;
    }
}
