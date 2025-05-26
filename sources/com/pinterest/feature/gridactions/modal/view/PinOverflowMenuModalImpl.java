package com.pinterest.feature.gridactions.modal.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import com.bumptech.glide.d;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import es.h;
import fs0.w;
import gs0.j;
import gs0.o;
import gs0.q;
import h32.a4;
import h32.c1;
import h32.d4;
import java.util.HashMap;
import java.util.List;
import jc0.v;
import ji0.i;
import kh2.c3;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh0.m1;
import lh0.z3;
import ls0.e;
import ls0.f;
import m60.u;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import xk2.k;
import xk2.m;

@Keep
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002vwB³\u0002\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u00020\u0006\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020403\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u00109\u001a\u00020\u0006\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010?\u001a\u00020\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010B\u001a\u00020\u0006\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010K\u001a\u00020\u0006\u0012\b\b\u0002\u0010L\u001a\u00020\u0006\u0012\b\b\u0002\u0010M\u001a\u00020\u0006\u0012\b\b\u0002\u0010N\u001a\u00020\u0006\u0012\u001c\b\u0002\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010Oj\u0004\u0018\u0001`P\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010S\u0012\b\b\u0002\u0010V\u001a\u00020\u0006\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010^\u001a\u00020]¢\u0006\u0004\bt\u0010uJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0006*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J!\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R\u0016\u0010:\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u0004\u0018\u00010<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00101R\u0016\u0010@\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00108R\u0016\u0010A\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00108R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00101R\u0016\u0010D\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00108R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00108R\u0014\u0010K\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00101R\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00101R\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00101R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00101R(\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010Oj\u0004\u0018\u0001`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u0004\u0018\u00010S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00101R\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010f\u001a\u0004\bq\u0010r¨\u0006x"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl;", "Lgs0/j;", "Lcs0/g;", "", "setInclusiveFilter", "()V", "", "getIsEligibleForFollowAction", "()Z", "Lcom/pinterest/api/model/f30;", "", "creatorUid", "isFollowActionEligibleOnCloseup", "(Lcom/pinterest/api/model/f30;Ljava/lang/String;)Z", "getCreatorId", "()Ljava/lang/String;", "Lcom/pinterest/api/model/sr;", "getPinImageDetailsForOverflow", "()Lcom/pinterest/api/model/sr;", "Lh32/d4;", "getViewType", "()Lh32/d4;", "Lfs0/w;", "createPresenter", "()Lfs0/w;", "Lgs0/o;", "getView", "()Lgs0/o;", "onModalContentContainerCreated", "showFeedBack", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/pinterest/component/modal/BaseModalViewWrapper;", "createModalView", "(Landroid/content/Context;Landroid/os/Bundle;)Lcom/pinterest/component/modal/BaseModalViewWrapper;", "Lyf0/h;", "insetMode", "Landroid/view/ViewGroup;", "modalViewWrapper", "applyInsetMode", "(Lyf0/h;Landroid/view/ViewGroup;)V", "pin", "Lcom/pinterest/api/model/f30;", "Ljo1/a;", "baseFragmentType", "Ljo1/a;", "isPinCloseup", "Z", "mentionedInPin", "", "", "additionalOverflow", "Ljava/util/List;", "uniqueScreenKey", "Ljava/lang/String;", "isHomefeedTab", "viewType", "Lh32/d4;", "Lh32/a4;", "viewParameterType", "Lh32/a4;", "isHideSupported", "pinNavigationSource", "searchQuery", "isProductTag", "Lh32/c1;", "eventData", "Lh32/c1;", "imageDownloadUrl", "Lb60/b;", "activeUserManager", "Lb60/b;", "overflowMenuTitle", "isThirdPartyGmaPin", "isHairPatternFilterApplied", "isSkinToneFilterApplied", "isBodyTypeApplied", "Ljava/util/HashMap;", "Lcom/pinterest/analytics/AuxData;", "inclusiveFilterAuxData", "Ljava/util/HashMap;", "Landroid/view/View;", "originView", "Landroid/view/View;", "shouldShowMerchantRemoval", "Les/a;", "adFormats", "Les/a;", "Llh0/m1;", "gridActionsParamsExperiments", "Llh0/m1;", "Les/h;", "adsCommonDisplay", "Les/h;", "presenter", "Lfs0/w;", "modalView", "Lgs0/o;", "Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$a;", "customComponentDependencies$delegate", "Lxk2/k;", "getCustomComponentDependencies", "()Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$a;", "customComponentDependencies", "Lkf0/a;", "pinOverFlowMenuComponent$delegate", "getPinOverFlowMenuComponent", "()Lkf0/a;", "pinOverFlowMenuComponent", "Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$b;", "dependencies$delegate", "getDependencies", "()Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$b;", "dependencies", "<init>", "(Lcom/pinterest/api/model/f30;Ljo1/a;ZZLjava/util/List;Ljava/lang/String;ZLh32/d4;Lh32/a4;ZLjava/lang/String;Ljava/lang/String;ZLh32/c1;Ljava/lang/String;Lb60/b;Ljava/lang/String;ZZZZLjava/util/HashMap;Landroid/view/View;ZLes/a;Llh0/m1;Les/h;)V", "a", "b", "gridActions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinOverflowMenuModalImpl extends j {

    @NotNull
    private final b60.b activeUserManager;

    @NotNull
    private final es.a adFormats;

    @NotNull
    private final List<Integer> additionalOverflow;

    @NotNull
    private final h adsCommonDisplay;

    @NotNull
    private final jo1.a baseFragmentType;

    /* renamed from: customComponentDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final k customComponentDependencies;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final k dependencies;
    private final c1 eventData;

    @NotNull
    private final m1 gridActionsParamsExperiments;
    private final String imageDownloadUrl;
    private final HashMap<String, String> inclusiveFilterAuxData;
    private final boolean isBodyTypeApplied;
    private final boolean isHairPatternFilterApplied;
    private final boolean isHideSupported;
    private final boolean isHomefeedTab;
    private final boolean isPinCloseup;
    private final boolean isProductTag;
    private final boolean isSkinToneFilterApplied;
    private final boolean isThirdPartyGmaPin;
    private final boolean mentionedInPin;
    private o modalView;
    private final View originView;
    private final String overflowMenuTitle;

    @NotNull
    private final f30 pin;
    private final String pinNavigationSource;

    /* renamed from: pinOverFlowMenuComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final k pinOverFlowMenuComponent;
    private w presenter;
    private final String searchQuery;
    private final boolean shouldShowMerchantRemoval;
    private final String uniqueScreenKey;
    private final a4 viewParameterType;
    private final d4 viewType;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$a;", "", "gridActions_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/PinOverflowMenuModalImpl$b;", "", "gridActions_release"}, k = 1, mv = {1, 9, 0})
    public interface b {
    }

    public PinOverflowMenuModalImpl(@NotNull f30 pin, @NotNull jo1.a baseFragmentType, boolean z13, boolean z14, @NotNull List<Integer> additionalOverflow, String str, boolean z15, d4 d4Var, a4 a4Var, boolean z16, String str2, String str3, boolean z17, c1 c1Var, String str4, @NotNull b60.b activeUserManager, String str5, boolean z18, boolean z19, boolean z23, boolean z24, HashMap<String, String> hashMap, View view, boolean z25, @NotNull es.a adFormats, @NotNull m1 gridActionsParamsExperiments, @NotNull h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(gridActionsParamsExperiments, "gridActionsParamsExperiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.pin = pin;
        this.baseFragmentType = baseFragmentType;
        this.isPinCloseup = z13;
        this.mentionedInPin = z14;
        this.additionalOverflow = additionalOverflow;
        this.uniqueScreenKey = str;
        this.isHomefeedTab = z15;
        this.viewType = d4Var;
        this.viewParameterType = a4Var;
        this.isHideSupported = z16;
        this.pinNavigationSource = str2;
        this.searchQuery = str3;
        this.isProductTag = z17;
        this.eventData = c1Var;
        this.imageDownloadUrl = str4;
        this.activeUserManager = activeUserManager;
        this.overflowMenuTitle = str5;
        this.isThirdPartyGmaPin = z18;
        this.isHairPatternFilterApplied = z19;
        this.isSkinToneFilterApplied = z23;
        this.isBodyTypeApplied = z24;
        this.inclusiveFilterAuxData = hashMap;
        this.originView = view;
        this.shouldShowMerchantRemoval = z25;
        this.adFormats = adFormats;
        this.gridActionsParamsExperiments = gridActionsParamsExperiments;
        this.adsCommonDisplay = adsCommonDisplay;
        this.customComponentDependencies = m.b(new com.pinterest.feature.gridactions.modal.view.a(this));
        this.pinOverFlowMenuComponent = m.b(new c(this));
        this.dependencies = m.b(new com.pinterest.feature.gridactions.modal.view.b(this));
    }

    private final String getCreatorId() {
        String uid;
        wy0 L3 = this.pin.L3();
        return (L3 == null || (uid = L3.getUid()) == null) ? b40.C(this.pin) : uid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getCustomComponentDependencies() {
        return (a) this.customComponentDependencies.getValue();
    }

    private final b getDependencies() {
        return (b) this.dependencies.getValue();
    }

    private final boolean getIsEligibleForFollowAction() {
        return isFollowActionEligibleOnCloseup(this.pin, getCreatorId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r0.l("android_ad_3p_preview_fix") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.pinterest.api.model.sr getPinImageDetailsForOverflow() {
        /*
            r5 = this;
            es.h r0 = r5.adsCommonDisplay
            com.pinterest.api.model.f30 r1 = r5.pin
            es.v r0 = (es.v) r0
            r0.getClass()
            java.lang.String r2 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.pinterest.api.model.g r2 = r1.t3()
            r3 = 0
            if (r2 == 0) goto L21
            java.lang.Boolean r2 = r2.i0()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r4)
            if (r2 != 0) goto L7b
        L21:
            es.a r2 = r0.f60009b
            es.c r2 = (es.c) r2
            boolean r2 = r2.L(r1)
            if (r2 == 0) goto L2c
            goto L7b
        L2c:
            java.lang.String r2 = "getIsThirdPartyAd(...)"
            boolean r2 = n60.o.y(r1, r2)
            if (r2 == 0) goto L7c
            com.pinterest.api.model.g r1 = r1.t3()
            if (r1 == 0) goto L55
            com.pinterest.api.model.r r1 = r1.n0()
            if (r1 == 0) goto L55
            java.util.Map r1 = r1.m()
            if (r1 == 0) goto L55
            h92.c r2 = h92.c.HAS_DEFAULT_THUMBNAIL
            int r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            goto L56
        L55:
            r1 = r3
        L56:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto L7c
            lh0.d r0 = r0.f60008a
            r0.getClass()
            lh0.z3 r1 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83323a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r2 = "enabled"
            java.lang.String r4 = "android_ad_3p_preview_fix"
            boolean r1 = r0.o(r4, r2, r1)
            if (r1 != 0) goto L7b
            boolean r0 = r0.l(r4)
            if (r0 == 0) goto L7c
        L7b:
            return r3
        L7c:
            com.pinterest.api.model.f30 r0 = r5.pin
            as1.b r1 = as1.b.a()
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.pinterest.api.model.sr r0 = bs1.b.b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl.getPinImageDetailsForOverflow():com.pinterest.api.model.sr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf0.a getPinOverFlowMenuComponent() {
        return (kf0.a) this.pinOverFlowMenuComponent.getValue();
    }

    private final boolean isFollowActionEligibleOnCloseup(f30 f30Var, String str) {
        if (str != null) {
            if (d.o0(((b60.d) this.activeUserManager).f() != null ? Boolean.valueOf(!Intrinsics.d(r0.getUid(), str)) : null) && !j1.F1(f30Var)) {
                return true;
            }
        }
        return false;
    }

    private final void setInclusiveFilter() {
        w wVar = this.presenter;
        if (wVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        wVar.R = this.isHairPatternFilterApplied ? as0.a.HAIR_PATTERN : this.isSkinToneFilterApplied ? as0.a.SKIN_TONE : this.isBodyTypeApplied ? as0.a.BODY_TYPE : null;
        if (wVar != null) {
            wVar.S = this.inclusiveFilterAuxData;
        } else {
            Intrinsics.r("presenter");
            throw null;
        }
    }

    @Override // jc0.b
    public void applyInsetMode(@NotNull yf0.h insetMode, @NotNull ViewGroup modalViewWrapper) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(modalViewWrapper, "modalViewWrapper");
        ViewGroup viewGroup = (ViewGroup) modalViewWrapper.findViewById(ga2.d.modal_container);
        if (viewGroup != null) {
            c3.j(viewGroup);
        }
    }

    @Override // jc0.b
    @NotNull
    public BaseModalViewWrapper createModalView(@NotNull Context context, Bundle savedInstanceState) {
        ModalViewWrapper modalViewWrapper;
        f0 f0Var;
        Intrinsics.checkNotNullParameter(context, "context");
        f a13 = e.a(this.pin, this.baseFragmentType, this.adFormats, this.gridActionsParamsExperiments);
        jo1.a aVar = this.baseFragmentType;
        boolean z13 = this.isPinCloseup;
        boolean z14 = this.mentionedInPin;
        String str = this.pinNavigationSource;
        List<Integer> list = this.additionalOverflow;
        boolean z15 = this.isHomefeedTab;
        boolean isEligibleForFollowAction = getIsEligibleForFollowAction();
        boolean z16 = this.isProductTag;
        boolean z17 = this.isHideSupported;
        a4 a4Var = this.viewParameterType;
        d4 d4Var = this.viewType;
        boolean M0 = b40.M0(this.pin);
        f30 f30Var = this.pin;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        boolean z18 = !f30Var.l5().booleanValue();
        boolean z19 = this.isThirdPartyGmaPin;
        boolean z23 = this.isHairPatternFilterApplied;
        boolean z24 = this.isSkinToneFilterApplied;
        boolean z25 = this.isBodyTypeApplied;
        Boolean U4 = this.pin.U4();
        Intrinsics.checkNotNullExpressionValue(U4, "getIsGoLinkless(...)");
        boolean booleanValue = U4.booleanValue();
        String uid = this.pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        o oVar = new o(context, aVar, z13, z14, str, list, z15, isEligibleForFollowAction, a13, z16, z17, a4Var, d4Var, M0, z18, z19, z23, z24, z25, booleanValue, uid, this.shouldShowMerchantRemoval);
        this.modalView = oVar;
        if (oVar.L(z3.ACTIVATE_EXPERIMENT)) {
            sr pinImageDetailsForOverflow = getPinImageDetailsForOverflow();
            o oVar2 = this.modalView;
            if (oVar2 == null) {
                Intrinsics.r("modalView");
                throw null;
            }
            SpannableStringBuilder string = oVar2.f66074v;
            if (string != null) {
                Intrinsics.checkNotNullParameter(string, "string");
                f0Var = new f0(string);
            } else {
                f0Var = null;
            }
            if (pinImageDetailsForOverflow == null) {
                o oVar3 = this.modalView;
                if (oVar3 == null) {
                    Intrinsics.r("modalView");
                    throw null;
                }
                View findViewById = oVar3.findViewById(bz1.b.reason_text);
                if (findViewById != null) {
                    bs1.c.X0(findViewById);
                }
            }
            modalViewWrapper = new q(context, pinImageDetailsForOverflow, f0Var);
            modalViewWrapper.setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_transparent));
            View view = this.modalView;
            if (view == null) {
                Intrinsics.r("modalView");
                throw null;
            }
            modalViewWrapper.t(view);
        } else {
            modalViewWrapper = new ModalViewWrapper(context);
            String str2 = this.overflowMenuTitle;
            if (str2 == null) {
                str2 = context.getString(x0.options);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            }
            modalViewWrapper.p(str2);
            modalViewWrapper.setBackgroundColor(dl2.b.x0(context, eo1.a.sema_color_background_transparent));
            View view2 = this.modalView;
            if (view2 == null) {
                Intrinsics.r("modalView");
                throw null;
            }
            modalViewWrapper.t(view2);
        }
        return modalViewWrapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0263 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024f  */
    @Override // yk1.l
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fs0.w createPresenter() {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.gridactions.modal.view.PinOverflowMenuModalImpl.createPresenter():fs0.w");
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ int getLayoutHeight() {
        return -2;
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ String getPinId() {
        return null;
    }

    @Override // jc0.a0
    public d4 getViewType() {
        return this.viewType;
    }

    @Override // jc0.a0
    public boolean isDismissible(boolean z13) {
        return !(this instanceof i);
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ void onActivityResult(int i13, int i14, Intent intent) {
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ void onDisplayed() {
    }

    @Override // yk1.l, jc0.a0
    public void onModalContentContainerCreated() {
        super.onModalContentContainerCreated();
        setInclusiveFilter();
        o oVar = this.modalView;
        if (oVar == null) {
            Intrinsics.r("modalView");
            throw null;
        }
        w listener = this.presenter;
        if (listener == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        oVar.f66072t = listener;
        o oVar2 = this.modalView;
        if (oVar2 == null) {
            Intrinsics.r("modalView");
            throw null;
        }
        if (oVar2.D()) {
            o oVar3 = this.modalView;
            if (oVar3 == null) {
                Intrinsics.r("modalView");
                throw null;
            }
            if (oVar3.L(z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                return;
            }
            BaseModalViewWrapper modalViewWrapper = getModalViewWrapper();
            o oVar4 = this.modalView;
            if (oVar4 != null) {
                modalViewWrapper.p(oVar4.getContext().getString(x0.share_to));
            } else {
                Intrinsics.r("modalView");
                throw null;
            }
        }
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // jc0.a0
    public /* bridge */ /* synthetic */ boolean shouldOverrideDismissEvent() {
        return false;
    }

    @Override // gs0.j
    public void showFeedBack() {
        u.f85943a.d(new v(this, false, 0L, 30));
    }

    @Override // yk1.l
    @NotNull
    public o getView() {
        o oVar = this.modalView;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.r("modalView");
        throw null;
    }

    @Override // jc0.a0
    public boolean isDismissible() {
        return isDismissible(false);
    }

    public PinOverflowMenuModalImpl(f30 f30Var, jo1.a aVar, boolean z13, boolean z14, List list, String str, boolean z15, d4 d4Var, a4 a4Var, boolean z16, String str2, String str3, boolean z17, c1 c1Var, String str4, b60.b bVar, String str5, boolean z18, boolean z19, boolean z23, boolean z24, HashMap hashMap, View view, boolean z25, es.a aVar2, m1 m1Var, h hVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f30Var, aVar, z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? q0.f80391a : list, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? false : z15, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : d4Var, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : a4Var, (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? true : z16, (i13 & 1024) != 0 ? null : str2, (i13 & 2048) != 0 ? null : str3, (i13 & 4096) != 0 ? false : z17, (i13 & 8192) != 0 ? null : c1Var, (i13 & 16384) != 0 ? null : str4, bVar, (65536 & i13) != 0 ? null : str5, (131072 & i13) != 0 ? false : z18, (262144 & i13) != 0 ? false : z19, (524288 & i13) != 0 ? false : z23, (1048576 & i13) != 0 ? false : z24, (2097152 & i13) != 0 ? null : hashMap, (4194304 & i13) != 0 ? null : view, (i13 & 8388608) != 0 ? false : z25, aVar2, m1Var, hVar);
    }
}
