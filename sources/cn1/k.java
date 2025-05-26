package cn1;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f28204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f28205j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(GestaltSearchField gestaltSearchField, String str) {
        super(1);
        this.f28204i = str;
        this.f28205j = gestaltSearchField;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rn1.a state = (rn1.a) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        String str = this.f28204i;
        u50.f0 h23 = bs1.c.h2(str);
        vn1.g gVar = vn1.g.BODY_100;
        fm1.c Z = d7.b.Z(str.length() > 0);
        rm1.i iVar = GestaltSearchField.f49499t;
        return rn1.a.y(state, h23, null, null, null, gVar, 0, Z, null, null, null, false, 0, null, null, null, null, Integer.valueOf(this.f28205j.P0().getId()), false, null, null, 2031534);
    }
}
