package com.pinterest.activity.pin.view.modules;

import ac2.a1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.h0;
import androidx.media3.ui.k0;
import ao2.o1;
import bc2.e;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.hx;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.vq0;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import es.a;
import es.h;
import g4.u;
import gh0.b;
import h32.f1;
import h32.u0;
import h32.v0;
import hs.d;
import i32.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kg.n;
import kh2.c3;
import kh2.g0;
import kh2.k3;
import kh2.n3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import ls1.q;
import m60.t;
import m60.w;
import nx.b0;
import nx.c0;
import nx.d0;
import nx.d1;
import org.jetbrains.annotations.NotNull;
import rg0.o;
import rq.h4;
import rq.m;
import rq.o4;
import rq.p4;
import rq.q4;
import rq.r1;
import rq.r4;
import rq.s4;
import rq.t4;
import sq.f;
import sq.g;
import sq.i;
import vr0.c;
import x02.i2;
import xk2.k;

@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Ö\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002×\u0001B\u0097\u0001\u0012\b\u0010Ñ\u0001\u001a\u00030Ð\u0001\u0012\u0006\u0010S\u001a\u00020&\u0012\u0006\u0010U\u001a\u00020\u0017\u0012\b\u0010Ó\u0001\u001a\u00030Ò\u0001\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010Z\u001a\u00020\t\u0012\n\u0010]\u001a\u00060&j\u0002`\\\u0012\u0006\u0010^\u001a\u00020\t\u0012\b\b\u0002\u0010_\u001a\u00020\t\u0012\u0006\u0010a\u001a\u00020`\u0012\b\b\u0002\u0010c\u001a\u00020\t\u0012\b\b\u0002\u0010d\u001a\u00020\t\u0012\u0006\u0010f\u001a\u00020e\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010k\u001a\u00020\t\u0012\u0006\u0010l\u001a\u00020\t¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010\u001cJ\u0017\u00104\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u0010\u0006J\u0017\u00107\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020)H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020)H\u0002¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020)H\u0002¢\u0006\u0004\b<\u0010:J\u0017\u0010>\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010?J\u0017\u0010B\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010?J\u000f\u0010C\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010:J)\u0010H\u001a\u00020\u00042\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bJ\u0010KJ'\u0010P\u001a\u00020\u00042\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020&2\u0006\u0010O\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0004H\u0002¢\u0006\u0004\bR\u0010\u0006R\u0014\u0010S\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u00060&j\u0002`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010TR\u0014\u0010^\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010[R\u0014\u0010_\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010[R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010[R\u0014\u0010d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010[R\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010[R\u0014\u0010l\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010[R\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010[R\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R-\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0}8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¢\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010©\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010°\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R*\u0010·\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010À\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÀ\u0001\u0010[R\u0016\u0010Á\u0001\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÁ\u0001\u0010xR\u0018\u0010Â\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010[R\u0018\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010È\u0001\u001a\u00020W8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0019\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Ø\u0001"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/PinCloseupVideoModule;", "Lrq/r1;", "Landroid/view/View$OnClickListener;", "Lsq/f;", "", "createView", "()V", "updateView", "endView", "", "active", "updateActive", "(Z)V", "shouldShowMerchantRemoval", "openPinOverflowMenuModal", "isLoading", "showLoadingSpinner", "Lcom/pinterest/api/model/f30;", "pin", "updatePin", "(Lcom/pinterest/api/model/f30;)V", "onAttachedToWindow", "onDetachedFromWindow", "", "bottomBarPosition", "updateVideoControlsPosition", "(F)V", "hasContent", "()Z", "shouldShowForPin", "shouldUpdateView", "Lh32/g0;", "getComponentType", "()Lh32/g0;", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "getVideoPinUid", "()Ljava/lang/String;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "containerHeight", "updateMediaViewSize", "(I)V", "shouldStartVideoFromBeginning", "hasReachedMaxPlayLoop", "createDefaultView", "refreshExperience", "maybeLogMusicPlay", "shouldScaleVideoToDeviceHeight", "(Lcom/pinterest/api/model/f30;)Z", "getCloseupActionBarHeight", "()I", "getBottomPadding", "getHorizontalPadding", "Lrq/d;", "calculatePortraitDimensionsToFitHeight", "(Lcom/pinterest/api/model/f30;)Lrq/d;", "calculateTabletLandscapeDimensionsToFitHeight", "calculateAdCloseupRpPortraitDimensionsToFitHeight", "calculateDimensionFromVideoTracks", "getScreenHeightWithoutStatusBar", "Lcom/pinterest/video/core/view/PinterestVideoView;", "videoView", "Landroid/widget/RelativeLayout;", "parent", "setupMusicAttributionView", "(Lcom/pinterest/video/core/view/PinterestVideoView;Landroid/widget/RelativeLayout;Lcom/pinterest/api/model/f30;)V", "getMusicAttributionText", "(Lcom/pinterest/api/model/f30;)Ljava/lang/String;", "Lcom/pinterest/gestalt/text/GestaltText;", "textView", "text", "mute", "setMusicAttribution", "(Lcom/pinterest/gestalt/text/GestaltText;Ljava/lang/String;Z)V", "loadSavedMuteState", "pinId", "Ljava/lang/String;", "pinAspectRatio", "F", "Lsq/g;", "impressionLoggingParams", "Lsq/g;", "showGradientAndOverflow", "Z", "Lcom/pinterest/activity/pin/TrafficSource;", "navigationSource", "isHideSupported", "isAdsPin", "Llh0/a0;", "closeupExperiments", "Llh0/a0;", "forceMute", "startWithMute", "Lm60/w;", "eventManager", "Lm60/w;", "Lnx/d1;", "trackingParamAttacher", "Lnx/d1;", "isCloseupRedesignEnabled", "shouldUseAdCloseupRp", "Lcom/pinterest/video/core/view/PinterestVideoView;", "Lvr0/a;", "experiences", "Lvr0/a;", "isPromoted", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "overflowButton", "Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "musicAttributionView", "Lcom/pinterest/gestalt/text/GestaltText;", "playLoopCounter", "I", "", "musicPlayStartMs", "J", "musicTotalPlayTimeMs", "Lxk2/k;", "Loq/b;", "closeupImpressionHelper", "Lxk2/k;", "getCloseupImpressionHelper", "()Lxk2/k;", "setCloseupImpressionHelper", "(Lxk2/k;)V", "Lgs0/k;", "pinOverflowMenuModalProvider", "Lgs0/k;", "getPinOverflowMenuModalProvider", "()Lgs0/k;", "setPinOverflowMenuModalProvider", "(Lgs0/k;)V", "Lx02/i2;", "pinRepository", "Lx02/i2;", "getPinRepository", "()Lx02/i2;", "setPinRepository", "(Lx02/i2;)V", "Lxr/a;", "attributionReporting", "Lxr/a;", "getAttributionReporting", "()Lxr/a;", "setAttributionReporting", "(Lxr/a;)V", "Lbc2/e;", "mp4TrackSelector", "Lbc2/e;", "getMp4TrackSelector", "()Lbc2/e;", "setMp4TrackSelector", "(Lbc2/e;)V", "Lhs/d;", "moduleViewabilityHelper", "Lhs/d;", "getModuleViewabilityHelper", "()Lhs/d;", "setModuleViewabilityHelper", "(Lhs/d;)V", "Lur/a;", "adsCoreDependencies", "Lur/a;", "getAdsCoreDependencies", "()Lur/a;", "setAdsCoreDependencies", "(Lur/a;)V", "Les/h;", "adsCommonDisplay", "Les/h;", "getAdsCommonDisplay", "()Les/h;", "setAdsCommonDisplay", "(Les/h;)V", "Les/a;", "adFormats", "Les/a;", "getAdFormats", "()Les/a;", "setAdFormats", "(Les/a;)V", "Lao2/o1;", "contentDescJob", "Lao2/o1;", "isModuleViewabilityTreatmentMediaEnabled", "padding", "hasUserManuallyToggledMuteState", "Lm60/t;", "eventSubscriber", "Lm60/t;", "getImpressionParams", "()Lsq/g;", "impressionParams", "getPinForImpression", "()Lcom/pinterest/api/model/f30;", "pinForImpression", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "audioManager", "Landroid/content/Context;", "context", "Lnx/d0;", "pinalytics", "<init>", "(Landroid/content/Context;Ljava/lang/String;FLnx/d0;Lsq/g;ZLjava/lang/String;ZZLlh0/a0;ZZLm60/w;Lnx/d1;ZZ)V", "Companion", "rq/r4", "closeup_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class PinCloseupVideoModule extends m implements View.OnClickListener, f {

    @NotNull
    public static final r4 Companion = new r4();
    public static final float MIN_WIDE_VIDEO_RATIO = 1.2f;
    private static final long MUSIC_PLAY_THRESHOLD_MS = 2000;
    public a adFormats;
    public h adsCommonDisplay;
    public ur.a adsCoreDependencies;
    public xr.a attributionReporting;

    @NotNull
    private final a0 closeupExperiments;

    @NotNull
    private k closeupImpressionHelper;
    private o1 contentDescJob;

    @NotNull
    private final w eventManager;

    @NotNull
    private final t eventSubscriber;

    @NotNull
    private final vr0.a experiences;
    private final boolean forceMute;
    private boolean hasUserManuallyToggledMuteState;

    @NotNull
    private final g impressionLoggingParams;
    private final boolean isAdsPin;
    private final boolean isCloseupRedesignEnabled;
    private final boolean isHideSupported;
    private final boolean isModuleViewabilityTreatmentMediaEnabled;
    private boolean isPromoted;
    public d moduleViewabilityHelper;
    public e mp4TrackSelector;
    private GestaltText musicAttributionView;
    private long musicPlayStartMs;
    private long musicTotalPlayTimeMs;

    @NotNull
    private final String navigationSource;
    private GestaltIconButton overflowButton;
    private final int padding;
    private final float pinAspectRatio;

    @NotNull
    private final String pinId;
    public gs0.k pinOverflowMenuModalProvider;
    public i2 pinRepository;
    private int playLoopCounter;
    private final boolean shouldUseAdCloseupRp;
    private final boolean showGradientAndOverflow;
    private final boolean startWithMute;

    @NotNull
    private final d1 trackingParamAttacher;
    private PinterestVideoView videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupVideoModule(@NotNull Context context, @NotNull String pinId, float f13, @NotNull d0 pinalytics, @NotNull g impressionLoggingParams, boolean z13, @NotNull String navigationSource, boolean z14, boolean z15, @NotNull a0 closeupExperiments, boolean z16, boolean z17, @NotNull w eventManager, @NotNull d1 trackingParamAttacher, boolean z18, boolean z19) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(impressionLoggingParams, "impressionLoggingParams");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.pinId = pinId;
        this.pinAspectRatio = f13;
        this.impressionLoggingParams = impressionLoggingParams;
        this.showGradientAndOverflow = z13;
        this.navigationSource = navigationSource;
        this.isHideSupported = z14;
        this.isAdsPin = z15;
        this.closeupExperiments = closeupExperiments;
        this.forceMute = z16;
        this.startWithMute = z17;
        this.eventManager = eventManager;
        this.trackingParamAttacher = trackingParamAttacher;
        this.isCloseupRedesignEnabled = z18;
        this.shouldUseAdCloseupRp = z19;
        c a13 = c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.experiences = a13;
        this.musicTotalPlayTimeMs = -1L;
        this.closeupImpressionHelper = xk2.m.b(new o4(this, true ? 1 : 0));
        boolean a14 = getModuleViewabilityHelper().a();
        this.isModuleViewabilityTreatmentMediaEnabled = a14;
        int i13 = 0;
        this.padding = (!z18 || a14) ? 0 : bs1.c.W(this, eo1.c.space_200);
        this.eventSubscriber = new s4(this);
        setId(n80.c.closeup_video_module);
        boolean f03 = b.f0(context);
        int i14 = f03 ? n80.d.video_view_closeup_a11y : n80.d.video_view_closeup;
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z23 = bk.f.z(context, pinalytics, i14, 8);
        if (z18 && !a14) {
            int v13 = g0.v(context);
            AspectRatioFrameLayout aspectRatioFrameLayout = z23.E;
            aspectRatioFrameLayout.setBackground(i.a(bs1.c.W(aspectRatioFrameLayout, v13)));
            aspectRatioFrameLayout.setClipToOutline(true);
        }
        z23.N0 = new o4(this, i13);
        z23.e0(bc2.m.PIN_CLOSEUP);
        z23.C0.b("is_closeup_video", "true");
        if (z15) {
            z23.E0 = u0.PIN_STORY_PIN_VIDEO;
            z23.D0 = h32.g0.PIN_STORY_PIN_COVER;
        } else {
            z23.D0 = h32.g0.PIN_CLOSEUP_BODY;
        }
        z23.t0(z16);
        z23.j0();
        SimplePlayerControlView simplePlayerControlView = z23.F;
        if (simplePlayerControlView != null) {
            GestaltIcon gestaltIcon = (GestaltIcon) z23.findViewById(h0.exo_play);
            if (gestaltIcon != null) {
                gestaltIcon.g2(h4.f109260w);
            }
            GestaltIcon gestaltIcon2 = (GestaltIcon) z23.findViewById(h0.exo_pause);
            if (gestaltIcon2 != null) {
                gestaltIcon2.g2(h4.f109261x);
            }
            GestaltIcon gestaltIcon3 = (GestaltIcon) z23.findViewById(a1.player_mute);
            if (gestaltIcon3 != null) {
                gestaltIcon3.g2(h4.f109262y);
            }
            GestaltIcon gestaltIcon4 = (GestaltIcon) z23.findViewById(a1.player_expand);
            if (gestaltIcon4 != null) {
                gestaltIcon4.g2(h4.f109263z);
            }
            z23.P(z17 ? true : nc2.h.f90406b);
            FrameLayout frameLayout = simplePlayerControlView.f52780c0;
            if (frameLayout != null) {
                frameLayout.setContentDescription(context.getString(k0.exo_controls_fullscreen_enter_description));
            }
            p4 value = new p4(z23, this);
            Intrinsics.checkNotNullParameter(value, "value");
            z23.f52751a1 = value;
            z23.S();
            z23.u0(new q4(this, z23, f03));
        }
        this.overflowButton = r1.setUpGradientAndMaybeCreateOverflowButton$closeup_release$default(this, z23, z13, z18, a14, false, 16, null);
        this.videoView = z23;
    }

    private final rq.d calculateAdCloseupRpPortraitDimensionsToFitHeight(f30 pin) {
        int i13 = (int) (hf0.b.f69003c * 0.45f);
        return new rq.d(i13, c0.d.a0(i13, c0.d.p(pin), com.bumptech.glide.c.E(this) - getHorizontalPadding()));
    }

    private final rq.d calculateDimensionFromVideoTracks(f30 pin) {
        vq0 g13;
        Map c13;
        Collection values;
        Map g14;
        Collection values2;
        h01 h01Var = null;
        if (b40.X0(pin)) {
            b01 M6 = pin.M6();
            if (M6 != null && (g14 = M6.g()) != null && (values2 = g14.values()) != null) {
                Collection collection = values2;
                Intrinsics.checkNotNullParameter(collection, "<this>");
                h01Var = (h01) CollectionsKt.R(collection);
            }
        } else {
            pq0 t13 = n3.t(pin);
            if (t13 != null && (g13 = t13.g()) != null && (c13 = g13.c()) != null && (values = c13.values()) != null) {
                Collection collection2 = values;
                Intrinsics.checkNotNullParameter(collection2, "<this>");
                h01Var = (h01) CollectionsKt.R(collection2);
            }
        }
        int E = com.bumptech.glide.c.E(this) - getHorizontalPadding();
        if (h01Var == null || h01Var.t().doubleValue() == 0.0d) {
            return new rq.d(0, E);
        }
        Double t14 = h01Var.t();
        Intrinsics.checkNotNullExpressionValue(t14, "getWidth(...)");
        double doubleValue = E / t14.doubleValue();
        Double n13 = h01Var.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getHeight(...)");
        return new rq.d((int) (n13.doubleValue() * doubleValue), E);
    }

    private final rq.d calculatePortraitDimensionsToFitHeight(f30 pin) {
        float p13 = c0.d.p(pin);
        int screenHeightWithoutStatusBar = (getScreenHeightWithoutStatusBar() - getCloseupActionBarHeight()) - getPadding();
        return new rq.d(screenHeightWithoutStatusBar, c0.d.a0(screenHeightWithoutStatusBar, p13, com.bumptech.glide.c.E(this) - getHorizontalPadding()));
    }

    private final rq.d calculateTabletLandscapeDimensionsToFitHeight(f30 pin) {
        float p13 = c0.d.p(pin);
        int screenHeightWithoutStatusBar = getScreenHeightWithoutStatusBar();
        return new rq.d(screenHeightWithoutStatusBar, c0.d.b0(p13, screenHeightWithoutStatusBar));
    }

    private final void createDefaultView(f30 pin) {
        calculateDimensionFromVideoTracks(pin);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        setGravity(17);
        setLayoutParams(layoutParams);
    }

    private final AudioManager getAudioManager() {
        Object systemService = getContext().getSystemService("audio");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* renamed from: getBottomPadding, reason: from getter */
    private final int getPadding() {
        return this.padding;
    }

    private final int getCloseupActionBarHeight() {
        if (this.isCloseupRedesignEnabled) {
            return 0;
        }
        return bs1.c.W(this, p80.a.pin_closeup_unified_action_bar_height);
    }

    private final int getHorizontalPadding() {
        return this.padding * 2;
    }

    private final String getMusicAttributionText(f30 pin) {
        ArrayList arrayList;
        List B = b40.B(pin);
        if (B != null) {
            List<hx> list = B;
            arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (hx hxVar : list) {
                String g13 = hxVar.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getArtist(...)");
                String l13 = hxVar.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getTitle(...)");
                arrayList.add(new tp0.a(g13, l13));
            }
        } else {
            arrayList = null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return c3.E(context, arrayList, b40.C0(pin));
    }

    private final int getScreenHeightWithoutStatusBar() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return hf0.b.d(bs1.c.k0(context)) - hf0.b.f();
    }

    private final boolean hasReachedMaxPlayLoop() {
        return this.playLoopCounter == 50;
    }

    private final void loadSavedMuteState() {
        boolean z13;
        PinterestVideoView pinterestVideoView;
        if (!this.startWithMute || this.hasUserManuallyToggledMuteState) {
            nc2.h hVar = nc2.h.f90405a;
            z13 = nc2.h.f90406b;
        } else {
            z13 = true;
        }
        PinterestVideoView pinterestVideoView2 = this.videoView;
        if ((pinterestVideoView2 == null || pinterestVideoView2.getB() != z13) && (pinterestVideoView = this.videoView) != null) {
            pinterestVideoView.P(z13);
        }
    }

    private final void maybeLogMusicPlay() {
        d0 viewPinalytics;
        List<hx> B;
        v0 v0Var;
        f30 pin = getPin();
        if (pin == null || (viewPinalytics = getViewPinalytics()) == null) {
            return;
        }
        long j13 = this.musicTotalPlayTimeMs - this.musicPlayStartMs;
        boolean C0 = b40.C0(pin);
        boolean z13 = getAudioManager().getStreamVolume(3) > 0;
        if (j13 > 2000 && !C0 && z13 && (B = b40.B(pin)) != null) {
            for (hx hxVar : B) {
                f1 f1Var = f1.PIN_EMBEDDED_MUSIC_PLAY;
                h32.g0 g0Var = h32.g0.MODAL_PIN;
                HashMap m13 = getPinAuxHelper().m(pin);
                String uid = pin.getUid();
                String b13 = this.trackingParamAttacher.b(pin);
                if (b13 != null) {
                    v0 v0Var2 = new v0();
                    v0Var2.G = b13;
                    v0Var = v0Var2;
                } else {
                    v0Var = null;
                }
                c3.f0(viewPinalytics, f1Var, g0Var, m13, hxVar, j13, uid, v0Var);
            }
        }
        this.musicTotalPlayTimeMs = -1L;
        this.musicPlayStartMs = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshExperience() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(o.CONTEXT_PIN_ID.getValue(), this.pinId);
        pairArr[1] = new Pair(o.CONTEXT_IS_VIDEO_VIEW_50.getValue(), "true");
        String value = o.IS_PROMOTED.getValue();
        f30 pin = getPin();
        pairArr[2] = new Pair(value, String.valueOf(com.bumptech.glide.d.o0(pin != null ? pin.d5() : null)));
        ((c) this.experiences).c(y0.ANDROID_PIN_CLOSEUP_TAKEOVER, z0.f(pairArr));
    }

    private final void setMusicAttribution(GestaltText textView, String text, boolean mute) {
        textView.setVisibility(text.length() > 0 ? 0 : 8);
        if (textView.getVisibility() == 0) {
            textView.i(new t4(text, mute, 0));
        }
    }

    private final void setupMusicAttributionView(PinterestVideoView videoView, RelativeLayout parent, f30 pin) {
        List B;
        GestaltText gestaltText;
        ViewGroup viewGroup = parent;
        if (parent == null) {
            viewGroup = setupTopBarBackgroundGradient$closeup_release(videoView, getModuleViewabilityHelper().a());
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(eo1.c.lego_closeup_module_right_padding);
        layoutParams.setMarginStart((dimensionPixelSize * 2) + constraintLayout.getResources().getDimensionPixelSize(eo1.c.lego_round_floating_button_size));
        if (viewGroup.findViewById(n80.c.closeup_overflow_button) != null) {
            layoutParams.setMarginEnd(dimensionPixelSize);
            layoutParams.addRule(16, n80.c.closeup_overflow_button);
            layoutParams.addRule(6, n80.c.closeup_overflow_button);
            layoutParams.addRule(8, n80.c.closeup_overflow_button);
        } else {
            layoutParams.setMarginEnd(layoutParams.getMarginStart());
            layoutParams.addRule(21);
            layoutParams.addRule(10);
            layoutParams.addRule(12);
        }
        layoutParams.addRule(20);
        constraintLayout.setLayoutParams(layoutParams);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText i13 = new GestaltText(6, context, (AttributeSet) null).i(h4.A);
        i13.setSingleLine(true);
        i13.setHorizontallyScrolling(true);
        i13.setHorizontalFadingEdgeEnabled(true);
        i13.setSelected(true);
        i13.setVisibility(4);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams2.f17691t = 0;
        layoutParams2.f17693v = 0;
        layoutParams2.f17671i = 0;
        layoutParams2.f17677l = 0;
        layoutParams2.L = 1;
        i13.setLayoutParams(layoutParams2);
        constraintLayout.addView(i13);
        this.musicAttributionView = i13;
        viewGroup.addView(constraintLayout);
        if (b40.C0(pin) || (B = b40.B(pin)) == null || B.size() <= 1 || (gestaltText = this.musicAttributionView) == null) {
            return;
        }
        gestaltText.setOnClickListener(new co.a(15, this, pin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMusicAttributionView$lambda$25(PinCloseupVideoModule this$0, f30 pin, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pin, "$pin");
        d0 viewPinalytics = this$0.getViewPinalytics();
        if (viewPinalytics != null) {
            f1 f1Var = f1.TAP;
            String uid = pin.getUid();
            viewPinalytics.N(f1Var, u0.MUSIC_PLAYLIST_ATTRIBUTION, h32.g0.MODAL_PIN, uid, false);
        }
        w wVar = this$0.eventManager;
        String uid2 = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        wVar.d(u.p0(uid2));
    }

    private final boolean shouldScaleVideoToDeviceHeight(f30 pin) {
        return calculateDimensionFromVideoTracks(pin).a() > (shouldRenderLandscapeTablet() ? getScreenHeightWithoutStatusBar() : (getScreenHeightWithoutStatusBar() - getCloseupActionBarHeight()) - getPadding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shouldStartVideoFromBeginning() {
        this.playLoopCounter++;
        if (hasReachedMaxPlayLoop()) {
            this.playLoopCounter = 0;
            return;
        }
        PinterestVideoView pinterestVideoView = this.videoView;
        if (pinterestVideoView != null) {
            pinterestVideoView.j(0L, false);
        }
        PinterestVideoView pinterestVideoView2 = this.videoView;
        if (pinterestVideoView2 != null) {
            pinterestVideoView2.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updatePin$lambda$14(PinCloseupVideoModule this$0, f30 pin, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pin, "$pin");
        this$0.eventManager.d(new q(null, pin));
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public void createView() {
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        rq.d dVar = new rq.d(-1, -1);
        if (!shouldRenderLandscapeTablet()) {
            createDefaultView(pin);
            if (this.shouldUseAdCloseupRp) {
                dVar = calculateAdCloseupRpPortraitDimensionsToFitHeight(pin);
            } else if (shouldScaleVideoToDeviceHeight(pin)) {
                dVar = calculatePortraitDimensionsToFitHeight(pin);
            } else if (this.isCloseupRedesignEnabled) {
                dVar = calculateDimensionFromVideoTracks(pin);
            }
        } else if (shouldScaleVideoToDeviceHeight(pin)) {
            dVar = calculateTabletLandscapeDimensionsToFitHeight(pin);
        }
        PinterestVideoView pinterestVideoView = this.videoView;
        if (pinterestVideoView != null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = pinterestVideoView.E;
            ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = dVar.b();
            layoutParams2.height = dVar.a();
            layoutParams2.gravity = 49;
            aspectRatioFrameLayout.setLayoutParams(layoutParams2);
        }
        addView(this.videoView, -1, dVar.a() + getPadding());
        updateView();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public void endView() {
        super.endView();
        maybeLogMusicPlay();
    }

    @NotNull
    public final a getAdFormats() {
        a aVar = this.adFormats;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    @NotNull
    public final h getAdsCommonDisplay() {
        h hVar = this.adsCommonDisplay;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("adsCommonDisplay");
        throw null;
    }

    @NotNull
    public final ur.a getAdsCoreDependencies() {
        ur.a aVar = this.adsCoreDependencies;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsCoreDependencies");
        throw null;
    }

    @NotNull
    public final xr.a getAttributionReporting() {
        xr.a aVar = this.attributionReporting;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("attributionReporting");
        throw null;
    }

    @Override // nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // sq.f
    @NotNull
    public k getCloseupImpressionHelper() {
        return this.closeupImpressionHelper;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    @NotNull
    public h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_VIDEO;
    }

    @Override // sq.f
    @NotNull
    public /* bridge */ /* synthetic */ oq.b getImpressionHelper(@NotNull xr.a aVar, @NotNull b0 b0Var, @NotNull ur.a aVar2, @NotNull a aVar3, boolean z13) {
        return super.getImpressionHelper(aVar, b0Var, aVar2, aVar3, z13);
    }

    @Override // sq.f
    @NotNull
    /* renamed from: getImpressionParams, reason: from getter */
    public g getImpressionLoggingParams() {
        return this.impressionLoggingParams;
    }

    @NotNull
    public final d getModuleViewabilityHelper() {
        d dVar = this.moduleViewabilityHelper;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("moduleViewabilityHelper");
        throw null;
    }

    @NotNull
    public final e getMp4TrackSelector() {
        e eVar = this.mp4TrackSelector;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("mp4TrackSelector");
        throw null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, sq.f
    public f30 getPinForImpression() {
        return getPin();
    }

    @NotNull
    public final gs0.k getPinOverflowMenuModalProvider() {
        gs0.k kVar = this.pinOverflowMenuModalProvider;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("pinOverflowMenuModalProvider");
        throw null;
    }

    @NotNull
    public final i2 getPinRepository() {
        i2 i2Var = this.pinRepository;
        if (i2Var != null) {
            return i2Var;
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    @NotNull
    /* renamed from: getVideoPinUid, reason: from getter */
    public final String getPinId() {
        return this.pinId;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean hasContent() {
        return true;
    }

    @Override // sq.f, nx.v
    public /* bridge */ /* synthetic */ c0 markImpressionEnd() {
        return super.markImpressionEnd();
    }

    @Override // sq.f, nx.v
    public /* bridge */ /* synthetic */ c0 markImpressionStart() {
        return super.markImpressionStart();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.eventManager.h(this.eventSubscriber);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v13) {
        n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        f30 pin = getPin();
        d0 viewPinalytics = getViewPinalytics();
        if (pin == null || viewPinalytics == null) {
            return;
        }
        String D = com.bumptech.glide.c.D(pin);
        viewPinalytics.f0(u0.PIN_SOURCE_IMAGE, h32.g0.MODAL_PIN, pin.getUid(), getPinAuxHelper().m(pin), false);
        PinCloseupBaseModule.handleWebsiteClicked$default(this, D, null, null, 6, null);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.eventManager.j(this.eventSubscriber);
        o1 o1Var = this.contentDescJob;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean z13 = keyCode == 24 || keyCode == 25;
        PinterestVideoView pinterestVideoView = this.videoView;
        if (z13 && pinterestVideoView != null) {
            pinterestVideoView.P(keyCode == 25 && getAudioManager().getStreamVolume(3) == 0);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // jq.a
    public void openPinOverflowMenuModal(boolean shouldShowMerchantRemoval) {
        gs0.k pinOverflowMenuModalProvider = getPinOverflowMenuModalProvider();
        String str = this.navigationSource;
        boolean z13 = this.isHideSupported;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(le0.d.menu_clickthrough));
        Unit unit = Unit.f80348a;
        openPinOverflowMenuModal$closeup_release(pinOverflowMenuModalProvider, str, z13, arrayList, shouldShowMerchantRemoval);
    }

    public final void setAdFormats(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adFormats = aVar;
    }

    public final void setAdsCommonDisplay(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.adsCommonDisplay = hVar;
    }

    public final void setAdsCoreDependencies(@NotNull ur.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsCoreDependencies = aVar;
    }

    public final void setAttributionReporting(@NotNull xr.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.attributionReporting = aVar;
    }

    public void setCloseupImpressionHelper(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.closeupImpressionHelper = kVar;
    }

    @Override // yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(yk1.i iVar) {
    }

    public final void setModuleViewabilityHelper(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.moduleViewabilityHelper = dVar;
    }

    public final void setMp4TrackSelector(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.mp4TrackSelector = eVar;
    }

    public final void setPinOverflowMenuModalProvider(@NotNull gs0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.pinOverflowMenuModalProvider = kVar;
    }

    public final void setPinRepository(@NotNull i2 i2Var) {
        Intrinsics.checkNotNullParameter(i2Var, "<set-?>");
        this.pinRepository = i2Var;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public boolean shouldUpdateView() {
        return false;
    }

    @Override // jq.a
    public void showLoadingSpinner(boolean isLoading) {
        PinterestVideoView pinterestVideoView = this.videoView;
        if (pinterestVideoView != null) {
            FrameLayout frameLayout = pinterestVideoView.Q0;
            k kVar = pinterestVideoView.R0;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(pinterestVideoView.getContext());
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.setForegroundGravity(17);
                pinterestVideoView.Q0 = frameLayout2;
                LoadingView loadingView = (LoadingView) kVar.getValue();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                loadingView.setLayoutParams(layoutParams);
                FrameLayout frameLayout3 = pinterestVideoView.Q0;
                if (frameLayout3 != null) {
                    frameLayout3.addView((LoadingView) kVar.getValue());
                }
            }
            if (!isLoading) {
                ((LoadingView) kVar.getValue()).g2(se0.f.LOADED);
                pinterestVideoView.removeView(pinterestVideoView.Q0);
                return;
            }
            ((LoadingView) kVar.getValue()).g2(se0.f.LOADING);
            FrameLayout frameLayout4 = pinterestVideoView.Q0;
            if (frameLayout4 != null) {
                k3.M1(frameLayout4, pinterestVideoView);
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public void updateActive(boolean active) {
        super.updateActive(active);
        if (active) {
            loadSavedMuteState();
            PinterestVideoView pinterestVideoView = this.videoView;
            if (pinterestVideoView != null) {
                pinterestVideoView.x0();
            }
        }
    }

    @Override // rq.r1
    public void updateMediaViewSize(int containerHeight) {
        int padding = containerHeight - getPadding();
        int a03 = c0.d.a0(padding, this.pinAspectRatio, com.bumptech.glide.c.E(this) - getHorizontalPadding());
        PinterestVideoView pinterestVideoView = this.videoView;
        if (pinterestVideoView != null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = pinterestVideoView.E;
            ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = a03;
            layoutParams2.height = padding;
            aspectRatioFrameLayout.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = pinterestVideoView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = containerHeight;
            pinterestVideoView.setLayoutParams(layoutParams3);
            SimplePlayerControlView simplePlayerControlView = pinterestVideoView.F;
            if (simplePlayerControlView != null) {
                ViewGroup.LayoutParams layoutParams4 = simplePlayerControlView.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams4.height = -1;
                simplePlayerControlView.setLayoutParams(layoutParams4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updatePin(@org.jetbrains.annotations.NotNull com.pinterest.api.model.f30 r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupVideoModule.updatePin(com.pinterest.api.model.f30):void");
    }

    public final void updateVideoControlsPosition(float bottomBarPosition) {
        SimplePlayerControlView simplePlayerControlView;
        LinearLayout linearLayout;
        PinterestVideoView pinterestVideoView = this.videoView;
        if (pinterestVideoView == null || (simplePlayerControlView = pinterestVideoView.F) == null || bottomBarPosition == 0.0f) {
            return;
        }
        simplePlayerControlView.getLocationOnScreen(simplePlayerControlView.f52789l0);
        float min = Math.min(bottomBarPosition - (r2[1] + simplePlayerControlView.getHeight()), 0.0f);
        if (Math.abs(min) <= simplePlayerControlView.getHeight() && (linearLayout = simplePlayerControlView.f52788k0) != null) {
            linearLayout.setTranslationY(min);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public void updateView() {
        super.updateView();
        GestaltIconButton gestaltIconButton = this.overflowButton;
        if (gestaltIconButton != null) {
            gs0.k pinOverflowMenuModalProvider = getPinOverflowMenuModalProvider();
            String str = this.navigationSource;
            boolean z13 = this.isHideSupported;
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(le0.d.menu_clickthrough));
            Unit unit = Unit.f80348a;
            updatePinOverflowMenuModal$closeup_release(gestaltIconButton, pinOverflowMenuModalProvider, str, z13, arrayList);
        }
    }

    @Override // sq.f, nx.v
    public /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return markImpressionEnd();
    }

    @Override // sq.f, nx.v
    public /* bridge */ /* synthetic */ Object markImpressionStart() {
        return markImpressionStart();
    }

    public /* synthetic */ PinCloseupVideoModule(Context context, String str, float f13, d0 d0Var, g gVar, boolean z13, String str2, boolean z14, boolean z15, a0 a0Var, boolean z16, boolean z17, w wVar, d1 d1Var, boolean z18, boolean z19, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, f13, d0Var, gVar, z13, str2, z14, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z15, a0Var, (i13 & 1024) != 0 ? false : z16, (i13 & 2048) != 0 ? false : z17, wVar, d1Var, z18, z19);
    }
}
