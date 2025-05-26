package le;

import android.content.Context;
import com.facebook.AccessToken;
import com.pinterest.identity.core.error.UnauthException;
import java.util.Date;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83098a;

    public /* synthetic */ s(int i13) {
        this.f83098a = i13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f83098a) {
            case 0:
                Context context = v.f83112i;
                if (context != null) {
                    return context.getCacheDir();
                }
                Intrinsics.r("applicationContext");
                throw null;
            case 1:
                return new UnsupportedOperationException();
            case 2:
                return com.facebook.login.x.f30074j.w();
            default:
                Date date = AccessToken.f29844l;
                AccessToken s13 = wc.j.s();
                if (s13 != null) {
                    return s13;
                }
                throw new UnauthException.ThirdParty.Facebook.MissingAccessTokenError();
        }
    }
}
