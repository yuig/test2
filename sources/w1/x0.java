package w1;

import android.graphics.Matrix;
import android.graphics.Path;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.uz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f127564j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f127565k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i13, int i14, String str) {
        super(1);
        this.f127563i = 2;
        this.f127564j = i13;
        this.f127565k = i14;
        this.f127566l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127563i;
        int i14 = this.f127565k;
        int i15 = this.f127564j;
        Object obj2 = this.f127566l;
        switch (i13) {
            case 1:
                b4.s sVar = (b4.s) obj;
                b3.o0 o0Var = (b3.o0) obj2;
                b4.r rVar = sVar.f21652a;
                int b13 = sVar.b(i15);
                int b14 = sVar.b(i14);
                b4.b bVar = (b4.b) rVar;
                CharSequence charSequence = bVar.f21511e;
                if (b13 < 0 || b13 > b14 || b14 > charSequence.length()) {
                    StringBuilder t13 = a.a.t("start(", b13, ") or end(", b14, ") is out of range [0..");
                    t13.append(charSequence.length());
                    t13.append("], or start > end!");
                    throw new IllegalArgumentException(t13.toString().toString());
                }
                Path path = new Path();
                c4.z zVar = bVar.f21510d;
                zVar.f25690f.getSelectionPath(b13, b14, path);
                int i16 = zVar.f25692h;
                if (i16 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i16);
                }
                long d2 = com.bumptech.glide.c.d(0.0f, sVar.f21657f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(a3.c.d(d2), a3.c.e(d2));
                path.transform(matrix);
                b3.k kVar = (b3.k) o0Var;
                kVar.getClass();
                kVar.f21334a.addPath(path, a3.c.d(0L), a3.c.e(0L));
                return Unit.f80348a;
            case 2:
                uz feeds = (uz) obj;
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                List h10 = feeds.h();
                if (h10 == null) {
                    h10 = kotlin.collections.q0.f80391a;
                }
                int i17 = kotlin.collections.f0.i(h10);
                if (i14 > i17) {
                    i14 = i17;
                }
                List<f30> v03 = CollectionsKt.v0(h10, new IntRange(i15, i14, 1));
                String str = (String) obj2;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(v03, 10));
                for (f30 f30Var : v03) {
                    Intrinsics.f(f30Var);
                    arrayList.add(new ny0.a1(f30Var, str, false));
                }
                return arrayList;
            case 3:
                androidx.recyclerview.widget.w diffResult = (androidx.recyclerview.widget.w) obj;
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                return new wt1.r(diffResult, obj2, i15, i14);
            default:
                em1.d chk = (em1.d) obj;
                Intrinsics.checkNotNullParameter(chk, "chk");
                yq1.c2 c2Var = (yq1.c2) obj2;
                CharSequence a03 = df.j1.a0(c2Var.getResources().getString(vq1.d.basic_text_and_link, c2Var.getResources().getString(i15), c2Var.getResources().getString(i14), c2Var.getResources().getString(m60.x0.learn_more)));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return em1.d.e(chk, null, null, null, bs1.c.h2(a03), null, null, 0, null, false, 0, 1015);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, int i13, int i14, int i15) {
        super(1);
        this.f127563i = i15;
        this.f127566l = obj;
        this.f127564j = i13;
        this.f127565k = i14;
    }
}
