package up0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ts0;
import kg.n;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends te0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f122966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts0 f122967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f122968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, ts0 ts0Var, l lVar, int i13) {
        super(context, Integer.valueOf(i13), 4);
        this.f122966d = context;
        this.f122967e = ts0Var;
        this.f122968f = lVar;
    }

    @Override // te0.a, android.text.style.ClickableSpan
    public final void onClick(View view) {
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        String j13 = this.f122967e.j();
        if (j13 != null) {
            lu1.b bVar = this.f122968f.f122973a;
            ((lu1.c) bVar).m(this.f122966d, g3.C(j13));
        }
    }
}
