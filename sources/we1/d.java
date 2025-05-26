package we1;

import android.widget.LinearLayout;

/* loaded from: classes5.dex */
public final class d extends LinearLayout implements yk1.n, nx.v {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f129318c = 0;

    /* renamed from: a, reason: collision with root package name */
    public uo0.c f129319a;

    /* renamed from: b, reason: collision with root package name */
    public rg0.n f129320b;

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129319a;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129319a;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
