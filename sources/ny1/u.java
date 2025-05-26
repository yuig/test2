package ny1;

import df.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f92705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f92706j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f92707k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f92708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f92709m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, ArrayList arrayList, String str, Function0 function0, Function0 function02) {
        super(0);
        this.f92705i = wVar;
        this.f92706j = arrayList;
        this.f92707k = str;
        this.f92708l = function0;
        this.f92709m = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = this.f92707k;
        j1.l1(this.f92705i.f92713c, this.f92706j, new int[0], str);
        this.f92708l.invoke();
        this.f92709m.invoke();
        return Unit.f80348a;
    }
}
