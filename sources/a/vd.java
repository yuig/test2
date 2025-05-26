package a;

import ads_mobile_sdk.jk0;
import ads_mobile_sdk.nk0;
import ads_mobile_sdk.pk0;
import ads_mobile_sdk.vk;
import ads_mobile_sdk.yx0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class vd {
    public static ad a(ad jsResult) {
        List list;
        String p13;
        List split$default;
        String p14;
        Intrinsics.checkNotNullParameter(jsResult, "jsResult");
        if (!(jsResult instanceof pk0)) {
            if (jsResult instanceof jk0) {
                return jsResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        nm.u uVar = (nm.u) ((pk0) jsResult).a();
        nm.s v13 = uVar.v("errors");
        String p15 = v13 != null ? v13.p() : null;
        nm.s v14 = uVar.v("valid");
        if (v14 == null || v14.e() != 1) {
            return new nk0(a.j("Error building request URL: ", p15), yx0.f14444b);
        }
        nm.s v15 = uVar.v("url");
        String p16 = v15 != null ? v15.p() : null;
        if (p16 == null) {
            return new nk0("BuildAdUrlResult url is null");
        }
        nm.s v16 = uVar.v("base_uri");
        String p17 = v16 != null ? v16.p() : null;
        nm.s v17 = uVar.v("post_parameters");
        String p18 = v17 != null ? v17.p() : null;
        nm.s v18 = uVar.v("cookies_include");
        boolean z13 = v18 == null || (p14 = v18.p()) == null || Intrinsics.d(p14, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE) || Intrinsics.d(p14, "true");
        nm.s v19 = uVar.v("csrb_errors");
        if (v19 == null || (p13 = v19.p()) == null) {
            list = null;
        } else {
            split$default = StringsKt__StringsKt.split$default(p13, new String[]{","}, false, 0, 6, null);
            list = split$default;
        }
        return new pk0(new vk(p15 != null ? StringsKt__StringsKt.split$default(p15, new String[]{","}, false, 0, 6, null) : null, p17, p18, z13, p16, null, list));
    }
}
