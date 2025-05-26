package ca0;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f27108j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f27109k = new f0(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(1);
        this.f27110i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27110i) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                x72.b bVar = x72.b.f134124d;
                if (bVar == null) {
                    Intrinsics.r("current");
                    throw null;
                }
                x72.j n13 = bVar.n(context);
                TextureView k13 = n13.k();
                k13.setTag(n13);
                return k13;
            default:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, null, null, null, false, null, true, null, 3071);
        }
    }
}
