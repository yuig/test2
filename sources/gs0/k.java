package gs0;

import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl;
import h32.a4;
import h32.c1;
import h32.d4;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.m1;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f66044a;

    /* renamed from: b, reason: collision with root package name */
    public final es.a f66045b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f66046c;

    /* renamed from: d, reason: collision with root package name */
    public final es.h f66047d;

    public k(b60.b activeUserManager, es.a adFormats, m1 gridActionsParamsExperiments, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(gridActionsParamsExperiments, "gridActionsParamsExperiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f66044a = activeUserManager;
        this.f66045b = adFormats;
        this.f66046c = gridActionsParamsExperiments;
        this.f66047d = adsCommonDisplay;
    }

    public static j a(k kVar, f30 pin, jo1.a baseFragmentType, boolean z13, boolean z14, List list, String str, boolean z15, d4 d4Var, a4 a4Var, boolean z16, String str2, String str3, boolean z17, c1 c1Var, String str4, String str5, boolean z18, boolean z19, boolean z23, boolean z24, HashMap hashMap, View view, boolean z25, int i13) {
        boolean z26 = (i13 & 8) != 0 ? false : z14;
        List additionalOverflow = (i13 & 16) != 0 ? q0.f80391a : list;
        String str6 = (i13 & 32) != 0 ? null : str;
        boolean z27 = (i13 & 64) != 0 ? false : z15;
        d4 d4Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : d4Var;
        a4 a4Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : a4Var;
        boolean z28 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? true : z16;
        String str7 = (i13 & 1024) != 0 ? null : str2;
        String str8 = (i13 & 2048) != 0 ? null : str3;
        boolean z29 = (i13 & 4096) != 0 ? false : z17;
        c1 c1Var2 = (i13 & 8192) != 0 ? null : c1Var;
        String str9 = (i13 & 16384) != 0 ? null : str4;
        String str10 = (32768 & i13) != 0 ? null : str5;
        boolean z33 = (65536 & i13) != 0 ? false : z18;
        boolean z34 = (131072 & i13) != 0 ? false : z19;
        boolean z35 = (262144 & i13) != 0 ? false : z23;
        boolean z36 = (524288 & i13) != 0 ? false : z24;
        HashMap hashMap2 = (1048576 & i13) != 0 ? null : hashMap;
        View view2 = (2097152 & i13) != 0 ? null : view;
        boolean z37 = (i13 & 4194304) == 0 ? z25 : false;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
        Class cls = Boolean.TYPE;
        Object newInstance = PinOverflowMenuModalImpl.class.getConstructor(f30.class, jo1.a.class, cls, cls, List.class, String.class, cls, d4.class, a4.class, cls, String.class, String.class, cls, c1.class, String.class, b60.b.class, String.class, cls, cls, cls, cls, HashMap.class, View.class, cls, es.a.class, m1.class, es.h.class).newInstance(pin, baseFragmentType, Boolean.valueOf(z13), Boolean.valueOf(z26), additionalOverflow, str6, Boolean.valueOf(z27), d4Var2, a4Var2, Boolean.valueOf(z28), str7, str8, Boolean.valueOf(z29), c1Var2, str9, kVar.f66044a, str10, Boolean.valueOf(z33), Boolean.valueOf(z34), Boolean.valueOf(z35), Boolean.valueOf(z36), hashMap2, view2, Boolean.valueOf(z37), kVar.f66045b, kVar.f66046c, kVar.f66047d);
        Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModal<*>");
        return (j) newInstance;
    }
}
