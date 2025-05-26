package gr;

import com.pinterest.activity.sendapin.ui.PersonListCell;
import em1.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gm1.a f65985b;

    public /* synthetic */ a(gm1.a aVar, int i13) {
        this.f65984a = i13;
        this.f65985b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f65984a;
        gm1.a aVar = this.f65985b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                int i14 = PersonListCell.f35160g;
                aVar.h3(cVar);
                break;
            default:
                int i15 = oo0.a.f96801c;
                aVar.h3(cVar);
                break;
        }
        return null;
    }
}
