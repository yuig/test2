package we1;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class g extends ConstraintLayout implements yk1.n, s, nx.v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f129349e = 0;

    /* renamed from: a, reason: collision with root package name */
    public uo0.c f129350a;

    /* renamed from: b, reason: collision with root package name */
    public r f129351b;

    /* renamed from: c, reason: collision with root package name */
    public ConstraintLayout f129352c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f129353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f129353d = new ArrayList();
        setOnClickListener(new lc1.b(this, 20));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        uo0.c cVar = this.f129350a;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        uo0.c cVar = this.f129350a;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
