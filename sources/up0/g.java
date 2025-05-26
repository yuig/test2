package up0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ts0;
import kg.n;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class g extends me0.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f122951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f122952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ts0 f122953g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, boolean z13, d0 d0Var, ts0 ts0Var, String str, int i13) {
        super(context, Integer.valueOf(i13), str);
        this.f122951e = z13;
        this.f122952f = d0Var;
        this.f122953g = ts0Var;
    }

    @Override // te0.a, android.text.style.ClickableSpan
    public final void onClick(View view) {
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        l.a(this.f122951e, this.f122952f, this.f122953g);
    }
}
