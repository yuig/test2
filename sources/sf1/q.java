package sf1;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112678i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f112679j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f112680k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f112681l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, s sVar, String str) {
        super(1);
        this.f112681l = list;
        this.f112679j = sVar;
        this.f112680k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f112678i;
        String str = this.f112680k;
        s sVar = this.f112679j;
        Object obj2 = this.f112681l;
        switch (i13) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                w0 w0Var = sVar.C;
                if (w0Var != null) {
                    w0Var.c((qf1.x) obj2);
                }
                r41.k.f106176a.d(str, r41.b.IdeaPinPage);
                break;
            default:
                Typeface typeface = (Typeface) obj;
                Iterator it2 = ((List) obj2).iterator();
                while (it2.hasNext()) {
                    ((TextView) it2.next()).setTypeface(typeface);
                }
                sVar.A.remove(str);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, qf1.x xVar, String str) {
        super(1);
        this.f112679j = sVar;
        this.f112681l = xVar;
        this.f112680k = str;
    }
}
