package dj;

import ads_mobile_sdk.nl0;
import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import wi.k;

/* loaded from: classes3.dex */
public abstract class e extends k {

    /* renamed from: k, reason: collision with root package name */
    public final String f55120k;

    /* renamed from: l, reason: collision with root package name */
    public final nl0 f55121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public e(String signalType, String str, LinkedHashSet categoryExclusions, LinkedHashMap customTargeting, Bundle googleExtrasBundle, HashSet keywords, HashSet neighboringContentUrls, LinkedHashMap adSourceExtrasBundles, String str2) {
        super(str, categoryExclusions, customTargeting, googleExtrasBundle, keywords, neighboringContentUrls, adSourceExtrasBundles, str2);
        nl0 nl0Var;
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.f55120k = signalType;
        int hashCode = signalType.hashCode();
        if (hashCode != -376111084) {
            switch (hashCode) {
                case 1743582862:
                    if (signalType.equals("requester_type_0")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_ADMOB;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582863:
                    if (signalType.equals("requester_type_1")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582864:
                    if (signalType.equals("requester_type_2")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_GBID;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582865:
                    if (signalType.equals("requester_type_3")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_GOLDENEYE;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582866:
                    if (signalType.equals("requester_type_4")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_YAVIN;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582867:
                    if (signalType.equals("requester_type_5")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_UNITY;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582868:
                    if (signalType.equals("requester_type_6")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_PAW;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                case 1743582869:
                    if (signalType.equals("requester_type_7")) {
                        nl0Var = nl0.SCAR_REQUEST_TYPE_GUILDER;
                        break;
                    }
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
                default:
                    nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
                    break;
            }
        } else {
            if (signalType.equals("signal_type_ad_manager_s2s")) {
                nl0Var = nl0.SCAR_REQUEST_TYPE_GAM_S2S;
            }
            nl0Var = nl0.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        this.f55121l = nl0Var;
    }
}
