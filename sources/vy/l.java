package vy;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126866i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f126867j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f126868k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f126869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, String str, Map map, int i13) {
        super(0);
        this.f126866i = i13;
        this.f126867j = mVar;
        this.f126868k = str;
        this.f126869l = map;
    }

    public final ek2.f b() {
        int i13 = this.f126866i;
        Map<String, String> map = this.f126869l;
        String str = this.f126868k;
        m mVar = this.f126867j;
        switch (i13) {
            case 0:
                return mVar.h().f(str, map).l(tk2.e.f118017c).i(new c(1), new mc.h(14, h.f126860n));
            default:
                return mVar.h().c(str, map).l(tk2.e.f118017c).i(new c(2), new mc.h(15, h.f126861o));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f126866i) {
        }
        return b();
    }
}
