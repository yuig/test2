package th0;

import a.g0;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.n;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q5.y0;
import yn2.x;

/* loaded from: classes5.dex */
public final class c extends xa.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f117635c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f117636d;

    public c(d dVar) {
        this.f117636d = dVar;
    }

    @Override // xa.a
    public final void a(ViewGroup container, int i13, Object object) {
        switch (this.f117635c) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(object, "object");
                container.removeView((View) object);
                return;
            default:
                throw new UnsupportedOperationException("Required method destroyItem was not overridden");
        }
    }

    @Override // xa.a
    public final int b() {
        int i13 = this.f117635c;
        Object obj = this.f117636d;
        switch (i13) {
            case 0:
                d dVar = (d) obj;
                int i14 = dVar.f117637a.f112916e + 1;
                int i15 = dVar.f117645i;
                if (i14 <= i15) {
                    return i15;
                }
                int i16 = i15 + 1;
                dVar.f117645i = i16;
                return i16;
            default:
                return ((String[]) obj).length;
        }
    }

    @Override // xa.a
    public final Object e(ViewGroup container, int i13) {
        int i14 = this.f117635c;
        Object obj = this.f117636d;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(container, "container");
                d dVar = (d) obj;
                container.addView((View) dVar.f117642f.get(i13));
                return dVar.f117642f.get(i13);
            default:
                Intrinsics.checkNotNullParameter(container, "container");
                LottieAnimationView lottieAnimationView = new LottieAnimationView(container.getContext());
                String str = ((String[]) obj)[i13];
                InputStream open = lottieAnimationView.getContext().getAssets().open(str);
                Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                StringBuilder sb3 = new StringBuilder();
                try {
                    Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
                    Iterator it = x.d(new y0(bufferedReader)).iterator();
                    while (it.hasNext()) {
                        sb3.append((String) it.next());
                    }
                    Unit unit = Unit.f80348a;
                    dl2.b.J(bufferedReader, null);
                    String sb4 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb4.getBytes());
                    lottieAnimationView.D2(n.a(str, new g0(4, byteArrayInputStream, str), new u0.n(byteArrayInputStream, 29)));
                    lottieAnimationView.M2(-1);
                    lottieAnimationView.k2();
                    container.addView(lottieAnimationView);
                    return lottieAnimationView;
                } finally {
                }
        }
    }

    @Override // xa.a
    public final boolean f(View view, Object object) {
        switch (this.f117635c) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(object, "object");
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(object, "object");
                break;
        }
        return Intrinsics.d(view, object);
    }

    public c(String[] animations) {
        Intrinsics.checkNotNullParameter(animations, "animations");
        this.f117636d = animations;
    }
}
