package ic2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import nc2.g;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f72107j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f72108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i13, boolean z13, c cVar, long j13) {
        super(1);
        this.f72106i = i13;
        this.f72107j = z13;
        this.f72108k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a aVar;
        a aVar2;
        a aVar3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c cVar = this.f72108k;
        int i13 = this.f72106i;
        if (i13 != 3) {
            if (i13 == 4 && booleanValue) {
                g gVar = cVar.f72109c;
                aVar = cVar.f72112f;
                double d2 = aVar.f72100a;
                aVar2 = cVar.f72112f;
                double d13 = aVar2.f72101b;
                aVar3 = cVar.f72112f;
                gVar.G(aVar3.f72105f);
            }
        } else if (this.f72107j) {
            cVar.f72109c.y();
        }
        return Unit.f80348a;
    }
}
