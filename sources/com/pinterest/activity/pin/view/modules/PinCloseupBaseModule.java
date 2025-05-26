package com.pinterest.activity.pin.view.modules;

import a11.d;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import c82.a;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r40;
import h32.a4;
import h32.c1;
import h32.d4;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.c0;
import np0.g;
import nx.b0;
import nx.d0;
import o5.c;
import org.jetbrains.annotations.NotNull;
import rq.k;
import uk1.e;
import xj2.b;
import xk2.m;
import yk1.n;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\b\u0010¹\u0001\u001a\u00030¸\u0001\u0012\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001B*\b\u0016\u0012\b\u0010¹\u0001\u001a\u00030¸\u0001\u0012\n\u0010»\u0001\u001a\u0005\u0018\u00010º\u0001\u0012\u0007\u0010¾\u0001\u001a\u00020\u0003¢\u0006\u0006\b¼\u0001\u0010¿\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0004¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0014¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0018\u00010(j\u0004\u0018\u0001`*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0014¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u0006H\u0004¢\u0006\u0004\b.\u0010%J\u000f\u0010/\u001a\u00020\u0006H\u0004¢\u0006\u0004\b/\u0010%J\u0019\u00100\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b8\u00109JK\u0010>\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00172$\b\u0002\u0010=\u001a\u001e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0(j\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)`<H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0004¢\u0006\u0004\b@\u0010'J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0017H\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0006H\u0014¢\u0006\u0004\bD\u0010%J\u000f\u0010E\u001a\u00020\u0017H\u0004¢\u0006\u0004\bE\u0010'J\u0017\u0010G\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010)¢\u0006\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010s\u0012\u0004\bx\u0010%\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010z\u001a\u0004\u0018\u00010y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0082\u0001\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001\"\u0006\b\u0089\u0001\u0010\u0086\u0001R*\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0005\b\u008e\u0001\u00101R)\u0010\u008f\u0001\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\u000e\"\u0005\b\u0092\u0001\u0010\fR*\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0005\b\u0097\u0001\u0010\u0012R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R'\u0010\u009c\u0001\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010'\"\u0005\b\u009f\u0001\u0010CR'\u0010 \u0001\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b \u0001\u0010\u009d\u0001\u001a\u0005\b \u0001\u0010'\"\u0005\b¡\u0001\u0010CR\u0019\u0010¢\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009d\u0001R\u0017\u0010@\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u009d\u0001R*\u0010£\u0001\u001a\u0004\u0018\u0001068\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u00109R \u0010©\u0001\u001a\u00030¨\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001f\u0010¯\u0001\u001a\u00020\u00178DX\u0084\u0084\u0002¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0005\b¯\u0001\u0010'R\u0017\u0010°\u0001\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0017\u0010²\u0001\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010±\u0001R.\u0010´\u0001\u001a\u0004\u0018\u00010)2\t\u0010³\u0001\u001a\u0004\u0018\u00010)8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006À\u0001"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/PinCloseupBaseModule;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Lh32/d4;", "viewType", "updateViewType", "(Lh32/d4;)V", "getViewType", "()Lh32/d4;", "Lh32/a4;", "viewParameterType", "updateViewParameterType", "(Lh32/a4;)V", "Lh32/c1;", "eventData", "updateEventData", "(Lh32/c1;)V", "", "isFullPin", "Lcom/pinterest/api/model/f30;", "pin", "Lb11/g;", "config", "Lnx/d0;", "pinalytics", "bindData", "(ZLcom/pinterest/api/model/f30;Lb11/g;Lnx/d0;)V", "screenHeightAdjustment", "checkForBeginView", "(I)V", "createViewIfNecessary", "()V", "shouldSendPinCardView", "()Z", "Ljava/util/HashMap;", "", "Lcom/pinterest/analytics/AuxData;", "getCardViewAuxData", "()Ljava/util/HashMap;", "useAutoVisibility", "updateHorizontalPadding", "applyDefaultSidePadding", "updatePinalytics", "(Lnx/d0;)V", "Landroid/view/View;", "contentView", "maybeUpdateLayoutForTabletPortrait", "(Landroid/view/View;)V", "Lc82/a;", "pinSpamParams", "updatePinSpamParams", "(Lc82/a;)V", "linkUrl", "shouldAlwaysUseLinkUrl", "Lkotlin/collections/HashMap;", "auxData", "handleWebsiteClicked", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/HashMap;)V", "isFullPinLoaded", "detailsLoaded", "setFullPinLoaded", "(Z)V", "renderLandscapeConfiguration", "shouldRenderLandscapeConfiguration", "pinId", "setProductTagParentPinId", "(Ljava/lang/String;)V", "La11/d;", "clickThroughHelperFactory", "La11/d;", "getClickThroughHelperFactory", "()La11/d;", "setClickThroughHelperFactory", "(La11/d;)V", "Luk1/e;", "presenterPinalyticsFactory", "Luk1/e;", "getPresenterPinalyticsFactory", "()Luk1/e;", "setPresenterPinalyticsFactory", "(Luk1/e;)V", "Lnp0/g;", "closeupActionController", "Lnp0/g;", "getCloseupActionController", "()Lnp0/g;", "setCloseupActionController", "(Lnp0/g;)V", "Lo5/c;", "bidiFormatter", "Lo5/c;", "getBidiFormatter", "()Lo5/c;", "setBidiFormatter", "(Lo5/c;)V", "Llh0/c0;", "baseCloseupLibraryExperiments", "Llh0/c0;", "getBaseCloseupLibraryExperiments", "()Llh0/c0;", "setBaseCloseupLibraryExperiments", "(Llh0/c0;)V", "Lnx/b0;", "pinAuxHelper", "Lnx/b0;", "getPinAuxHelper", "()Lnx/b0;", "setPinAuxHelper", "(Lnx/b0;)V", "Lcom/pinterest/api/model/f30;", "getPin", "()Lcom/pinterest/api/model/f30;", "setPin", "(Lcom/pinterest/api/model/f30;)V", "getPin$annotations", "Lcom/pinterest/api/model/r40;", "pinMetadata", "Lcom/pinterest/api/model/r40;", "getPinMetadata", "()Lcom/pinterest/api/model/r40;", "setPinMetadata", "(Lcom/pinterest/api/model/r40;)V", "Landroid/graphics/Rect;", "paddingRect", "Landroid/graphics/Rect;", "getPaddingRect", "()Landroid/graphics/Rect;", "setPaddingRect", "(Landroid/graphics/Rect;)V", "marginRect", "getMarginRect", "setMarginRect", "viewPinalytics", "Lnx/d0;", "getViewPinalytics", "()Lnx/d0;", "setViewPinalytics", "containerViewType", "Lh32/d4;", "getContainerViewType", "setContainerViewType", "containerViewParameterType", "Lh32/a4;", "getContainerViewParameterType", "()Lh32/a4;", "setContainerViewParameterType", "Lh32/c1;", "", "viewLocation", "[I", "sentViewEvent", "Z", "getSentViewEvent", "setSentViewEvent", "isActive", "setActive", "isViewCreated", "containerPinSpamParams", "Lc82/a;", "getContainerPinSpamParams", "()Lc82/a;", "setContainerPinSpamParams", "Lxj2/b;", "baseDisposables", "Lxj2/b;", "getBaseDisposables", "()Lxj2/b;", "isTabletLandscapeMode$delegate", "Lxk2/k;", "isTabletLandscapeMode", "pixelsIn16Dp", "I", "pixelsIn48Dp", "<set-?>", "productTagParentPinId", "Ljava/lang/String;", "getProductTagParentPinId", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeupLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class PinCloseupBaseModule extends k implements n {
    public c0 baseCloseupLibraryExperiments;

    @NotNull
    private final b baseDisposables;
    public c bidiFormatter;
    public d clickThroughHelperFactory;
    public g closeupActionController;
    private a containerPinSpamParams;
    private a4 containerViewParameterType;
    private d4 containerViewType;
    private c1 eventData;
    private boolean isActive;
    private boolean isFullPinLoaded;

    /* renamed from: isTabletLandscapeMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k isTabletLandscapeMode;
    private boolean isViewCreated;

    @NotNull
    private Rect marginRect;

    @NotNull
    private Rect paddingRect;
    private f30 pin;
    public b0 pinAuxHelper;
    private r40 pinMetadata;
    private final int pixelsIn16Dp;
    private final int pixelsIn48Dp;
    public e presenterPinalyticsFactory;
    private String productTagParentPinId;
    private boolean sentViewEvent;

    @NotNull
    private final int[] viewLocation;
    private d0 viewPinalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupBaseModule(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.paddingRect = new Rect();
        this.marginRect = new Rect();
        this.viewLocation = new int[2];
        this.baseDisposables = new b();
        this.isTabletLandscapeMode = m.b(new db.m(this, 11));
        this.pixelsIn16Dp = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.pixelsIn48Dp = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.sentViewEvent = false;
        this.isViewCreated = false;
        this.isFullPinLoaded = false;
    }

    public static /* synthetic */ void getPin$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleWebsiteClicked$default(PinCloseupBaseModule pinCloseupBaseModule, String str, Boolean bool, HashMap hashMap, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleWebsiteClicked");
        }
        if ((i13 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i13 & 4) != 0) {
            hashMap = new HashMap();
        }
        pinCloseupBaseModule.handleWebsiteClicked(str, bool, hashMap);
    }

    public void a(int i13) {
        checkForBeginView(i13);
    }

    public final void applyDefaultSidePadding() {
        boolean z13 = hf0.b.q() || hf0.b.m();
        Rect rect = this.paddingRect;
        rect.left = z13 ? this.pixelsIn48Dp : this.pixelsIn16Dp;
        rect.right = z13 ? this.pixelsIn48Dp : this.pixelsIn16Dp;
    }

    public void bindData(boolean isFullPin, @NotNull f30 pin, @NotNull b11.g config, @NotNull d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        updatePinalytics(pinalytics);
        updateViewType(config.f20989b);
        updateViewParameterType(config.f20988a);
        if (isFullPin) {
            this.isFullPinLoaded = true;
        }
        updatePin(pin);
    }

    public final void checkForBeginView(int screenHeightAdjustment) {
        f30 f30Var;
        if (!this.sentViewEvent && shouldSendPinCardView() && hasContent() && this.isActive) {
            getLocationOnScreen(this.viewLocation);
            int i13 = this.viewLocation[1];
            int measuredHeight = getMeasuredHeight() + i13;
            int i14 = hf0.b.f69003c - screenHeightAdjustment;
            if (((i13 < 0 || i13 > i14) && ((measuredHeight < 0 || measuredHeight > i14) && (i13 > 0 || measuredHeight < i14))) || (f30Var = this.pin) == null || this.sentViewEvent) {
                return;
            }
            HashMap<String, String> cardViewAuxData = getCardViewAuxData();
            d0 d0Var = this.viewPinalytics;
            if (d0Var != null) {
                d0.B(d0Var, f1.PIN_CARD_VIEW, getComponentType(), f30Var.getId(), cardViewAuxData, 16);
            }
            this.sentViewEvent = true;
        }
    }

    public void createView() {
    }

    public final void createViewIfNecessary() {
        if (this.isViewCreated) {
            return;
        }
        createView();
        this.isViewCreated = true;
    }

    public void endView() {
        this.sentViewEvent = false;
    }

    @NotNull
    public final c0 getBaseCloseupLibraryExperiments() {
        c0 c0Var = this.baseCloseupLibraryExperiments;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.r("baseCloseupLibraryExperiments");
        throw null;
    }

    @NotNull
    public final b getBaseDisposables() {
        return this.baseDisposables;
    }

    @NotNull
    public final c getBidiFormatter() {
        c cVar = this.bidiFormatter;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("bidiFormatter");
        throw null;
    }

    public HashMap<String, String> getCardViewAuxData() {
        return null;
    }

    @NotNull
    public final d getClickThroughHelperFactory() {
        d dVar = this.clickThroughHelperFactory;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("clickThroughHelperFactory");
        throw null;
    }

    @NotNull
    public final g getCloseupActionController() {
        g gVar = this.closeupActionController;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("closeupActionController");
        throw null;
    }

    public abstract g0 getComponentType();

    public final a getContainerPinSpamParams() {
        return this.containerPinSpamParams;
    }

    public final a4 getContainerViewParameterType() {
        return this.containerViewParameterType;
    }

    public final d4 getContainerViewType() {
        return this.containerViewType;
    }

    @NotNull
    public final Rect getMarginRect() {
        return this.marginRect;
    }

    @NotNull
    public final Rect getPaddingRect() {
        return this.paddingRect;
    }

    public final f30 getPin() {
        return this.pin;
    }

    @NotNull
    public final b0 getPinAuxHelper() {
        b0 b0Var = this.pinAuxHelper;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("pinAuxHelper");
        throw null;
    }

    public f30 getPinForImpression() {
        return getPin();
    }

    public final r40 getPinMetadata() {
        return this.pinMetadata;
    }

    @NotNull
    public final e getPresenterPinalyticsFactory() {
        e eVar = this.presenterPinalyticsFactory;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final String getProductTagParentPinId() {
        return this.productTagParentPinId;
    }

    public final boolean getSentViewEvent() {
        return this.sentViewEvent;
    }

    public final d0 getViewPinalytics() {
        return this.viewPinalytics;
    }

    @NotNull
    public final d4 getViewType() {
        d4 d4Var = this.containerViewType;
        return d4Var == null ? d4.PIN : d4Var;
    }

    public final void handleWebsiteClicked(String str) {
        handleWebsiteClicked$default(this, str, null, null, 6, null);
    }

    public abstract boolean hasContent();

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isFullPinLoaded, reason: from getter */
    public final boolean getIsFullPinLoaded() {
        return this.isFullPinLoaded;
    }

    public final boolean isTabletLandscapeMode() {
        return ((Boolean) this.isTabletLandscapeMode.getValue()).booleanValue();
    }

    public final void maybeUpdateLayoutForTabletPortrait(@NotNull View contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (hf0.b.q() && hf0.b.o()) {
            setGravity(1);
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = com.bumptech.glide.c.G();
            layoutParams.height = -2;
            contentView.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.baseDisposables.d();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "PinCloseupBaseModule";
        }
        r.u(this, canonicalName);
    }

    public void renderLandscapeConfiguration() {
    }

    public final void setActive(boolean z13) {
        this.isActive = z13;
    }

    public final void setBaseCloseupLibraryExperiments(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.baseCloseupLibraryExperiments = c0Var;
    }

    public final void setBidiFormatter(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.bidiFormatter = cVar;
    }

    public final void setClickThroughHelperFactory(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.clickThroughHelperFactory = dVar;
    }

    public final void setCloseupActionController(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.closeupActionController = gVar;
    }

    public final void setContainerPinSpamParams(a aVar) {
        this.containerPinSpamParams = aVar;
    }

    public final void setContainerViewParameterType(a4 a4Var) {
        this.containerViewParameterType = a4Var;
    }

    public final void setContainerViewType(d4 d4Var) {
        this.containerViewType = d4Var;
    }

    public void setFullPinLoaded(boolean detailsLoaded) {
        this.isFullPinLoaded = detailsLoaded;
    }

    public final void setMarginRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.marginRect = rect;
    }

    public final void setPaddingRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.paddingRect = rect;
    }

    public final void setPin(f30 f30Var) {
        this.pin = f30Var;
    }

    public final void setPinAuxHelper(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.pinAuxHelper = b0Var;
    }

    public final void setPinMetadata(r40 r40Var) {
        this.pinMetadata = r40Var;
    }

    public final void setPresenterPinalyticsFactory(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.presenterPinalyticsFactory = eVar;
    }

    public final void setProductTagParentPinId(String pinId) {
        this.productTagParentPinId = pinId;
    }

    public final void setSentViewEvent(boolean z13) {
        this.sentViewEvent = z13;
    }

    public final void setViewPinalytics(d0 d0Var) {
        this.viewPinalytics = d0Var;
    }

    public final boolean shouldRenderLandscapeConfiguration() {
        return ig1.b.e1(bs1.c.l0(this));
    }

    public boolean shouldSendPinCardView() {
        return false;
    }

    public abstract boolean shouldShowForPin();

    public abstract boolean shouldUpdateView();

    public void updateActive(boolean z13) {
        this.isActive = z13;
    }

    public final void updateEventData(c1 eventData) {
        this.eventData = eventData;
    }

    public final void updateHorizontalPadding() {
        int dimensionPixelSize = isTabletLandscapeMode() ? getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_large) : getResources().getDimensionPixelSize(eo1.c.lego_spacing_horizontal_medium);
        Rect rect = this.paddingRect;
        rect.left = dimensionPixelSize;
        rect.right = dimensionPixelSize;
    }

    public void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.pin = pin;
        this.pinMetadata = b40.A(pin);
        if (!shouldShowForPin()) {
            if (useAutoVisibility()) {
                setVisibility(8);
                return;
            }
            return;
        }
        createViewIfNecessary();
        if (shouldUpdateView()) {
            updateView();
            if (useAutoVisibility()) {
                setVisibility(0);
            }
        }
        if (shouldRenderLandscapeConfiguration()) {
            renderLandscapeConfiguration();
        }
    }

    public void updatePinSpamParams(a pinSpamParams) {
        this.containerPinSpamParams = pinSpamParams;
    }

    public void updatePinalytics(d0 pinalytics) {
        this.viewPinalytics = pinalytics;
    }

    public void updateView() {
        Rect rect = this.paddingRect;
        setPaddingRelative(rect.left, rect.top, rect.right, rect.bottom);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(this.marginRect.left);
            marginLayoutParams.setMarginEnd(this.marginRect.right);
            Rect rect2 = this.marginRect;
            marginLayoutParams.topMargin = rect2.top;
            marginLayoutParams.bottomMargin = rect2.bottom;
        }
    }

    public final void updateViewParameterType(a4 viewParameterType) {
        this.containerViewParameterType = viewParameterType;
    }

    public final void updateViewType(@NotNull d4 viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.containerViewType = viewType;
    }

    public boolean useAutoVisibility() {
        return true;
    }

    public final void handleWebsiteClicked(String str, Boolean bool) {
        handleWebsiteClicked$default(this, str, bool, null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r0 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleWebsiteClicked(java.lang.String r15, java.lang.Boolean r16, @org.jetbrains.annotations.NotNull java.util.HashMap<java.lang.String, java.lang.String> r17) {
        /*
            r14 = this;
            r1 = r14
            java.lang.String r0 = "auxData"
            r12 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            com.pinterest.api.model.f30 r4 = r1.pin
            nx.d0 r7 = r1.viewPinalytics
            if (r4 == 0) goto La3
            if (r7 == 0) goto La3
            java.lang.String r2 = r1.productTagParentPinId
            if (r2 == 0) goto L83
            xk2.q r0 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r4.getId()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch: java.lang.Throwable -> L28
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r0 = move-exception
            xk2.q r3 = xk2.s.f135225b
            xk2.r r0 = ue.c.m(r0)
        L2f:
            boolean r3 = r0 instanceof xk2.r
            r5 = 0
            if (r3 == 0) goto L35
            r0 = r5
        L35:
            r3 = r0
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L7c
            h32.c1 r0 = r1.eventData
            if (r0 == 0) goto L41
            h32.x2 r6 = r0.H
            goto L42
        L41:
            r6 = r5
        L42:
            if (r6 == 0) goto L47
            java.lang.Long r8 = r6.f67392a
            goto L48
        L47:
            r8 = r5
        L48:
            if (r8 == 0) goto L4e
            java.lang.Long r6 = r6.f67394c
            if (r6 != 0) goto L7e
        L4e:
            h32.b1 r6 = new h32.b1
            if (r0 == 0) goto L56
            r6.<init>(r0)
            goto L59
        L56:
            r6.<init>()
        L59:
            long r8 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L62
            goto L69
        L62:
            r0 = move-exception
            xk2.q r8 = xk2.s.f135225b
            xk2.r r0 = ue.c.m(r0)
        L69:
            boolean r8 = r0 instanceof xk2.r
            if (r8 == 0) goto L6e
            r0 = r5
        L6e:
            java.lang.Long r0 = (java.lang.Long) r0
            h32.x2 r8 = new h32.x2
            r8.<init>(r3, r2, r0, r5)
            r6.H = r8
            h32.c1 r0 = r6.a()
            goto L7e
        L7c:
            h32.c1 r0 = r1.eventData
        L7e:
            if (r0 != 0) goto L81
            goto L83
        L81:
            r10 = r0
            goto L86
        L83:
            h32.c1 r0 = r1.eventData
            goto L81
        L86:
            np0.g r2 = r14.getCloseupActionController()
            android.content.Context r3 = r14.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            c82.a r8 = r1.containerPinSpamParams
            xj2.b r9 = r1.baseDisposables
            r13 = 1024(0x400, float:1.435E-42)
            java.lang.String r6 = "unknown"
            r5 = r15
            r11 = r16
            r12 = r17
            np0.g.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupBaseModule.handleWebsiteClicked(java.lang.String, java.lang.Boolean, java.util.HashMap):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupBaseModule(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.paddingRect = new Rect();
        this.marginRect = new Rect();
        this.viewLocation = new int[2];
        this.baseDisposables = new b();
        this.isTabletLandscapeMode = m.b(new db.m(this, 11));
        this.pixelsIn16Dp = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.pixelsIn48Dp = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.sentViewEvent = false;
        this.isViewCreated = false;
        this.isFullPinLoaded = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupBaseModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.paddingRect = new Rect();
        this.marginRect = new Rect();
        this.viewLocation = new int[2];
        this.baseDisposables = new b();
        this.isTabletLandscapeMode = m.b(new db.m(this, 11));
        this.pixelsIn16Dp = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.pixelsIn48Dp = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.sentViewEvent = false;
        this.isViewCreated = false;
        this.isFullPinLoaded = false;
    }
}
