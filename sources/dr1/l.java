package dr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 == null || (bool = m13.h("send_marketing_data", Boolean.FALSE)) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (m13 == null || (bool2 = m13.h("send_events_to_ad_networks", Boolean.FALSE)) == null) {
            bool2 = Boolean.FALSE;
        }
        boolean booleanValue2 = bool2.booleanValue();
        if (m13 == null || (bool3 = m13.h("send_events_to_third_parties", Boolean.TRUE)) == null) {
            bool3 = Boolean.TRUE;
        }
        return new y02.a(booleanValue, booleanValue2, bool3.booleanValue());
    }
}
