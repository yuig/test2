package com.pinterest.ui.grid.videopin;

import ab2.a;
import ab2.b;
import ab2.d;
import ab2.p;
import ac2.p1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.o1;
import bk1.z;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.video.core.view.PinterestVideoView;
import df.j1;
import e21.n;
import e82.l;
import es.h;
import g4.u;
import h32.g0;
import hs.e;
import i2.j2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kh2.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kv.c;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.m4;
import lh0.o;
import lh0.z3;
import m60.r0;
import m60.s0;
import m60.w;
import ni1.d0;
import ni1.k1;
import ni1.l1;
import ni1.o2;
import ni1.t1;
import ni1.t2;
import ni1.u1;
import ni1.y2;
import nx.v;
import org.jetbrains.annotations.NotNull;
import ow.p0;
import pk.a0;
import qa2.c0;
import qa2.f0;
import qa2.h0;
import qa2.j0;
import qa2.m1;
import qs.g;
import rq.n0;
import ti1.f;
import u50.b0;
import wa2.i;
import wa2.m;
import xk2.k;

@Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b*\u0002´\u0002\b\u0017\u0018\u0000 Ú\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u00072\u00020\u0006:\u0002Û\u0002BX\b\u0004\u0012\b\u0010Õ\u0002\u001a\u00030Ô\u0002\u0012\u0006\u0010J\u001a\u00020I\u0012\u0007\u0010Ö\u0002\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020M\u0012\f\b\u0002\u0010×\u0002\u001a\u0005\u0018\u00010\u009c\u0001\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010v\u0012\u0006\u0010y\u001a\u00020\u000f\u0012\u0006\u0010{\u001a\u00020\u000f¢\u0006\u0006\bØ\u0002\u0010Ù\u0002J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0004¢\u0006\u0004\b\u0019\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\nJ/\u0010)\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010 J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u0010\nJ\u001f\u00109\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0017H\u0014¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010 J\u000f\u0010<\u001a\u00020\bH\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\nJ\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\nJ\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\nJ\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\nJ\u0011\u0010A\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010\nJ7\u0010O\u001a\u00020\b2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u0017H\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010\u001aJ)\u0010Y\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000bH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\bH\u0002¢\u0006\u0004\b[\u0010\nJ\u000f\u0010\\\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010\nJ\u000f\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b]\u0010\nJ\u000f\u0010^\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010\nJ\u000f\u0010_\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ7\u0010c\u001a\u00020\b2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020a2\u0006\u0010e\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\u000fH\u0002¢\u0006\u0004\bc\u0010gJ\u0017\u0010h\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020\b2\b\b\u0001\u0010j\u001a\u00020\u0017H\u0002¢\u0006\u0004\bk\u0010/J3\u0010l\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\bl\u0010\u001eJ\u0017\u0010m\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\bH\u0002¢\u0006\u0004\bo\u0010\nJ\u000f\u0010p\u001a\u00020\bH\u0002¢\u0006\u0004\bp\u0010\nJ\u000f\u0010q\u001a\u00020\bH\u0002¢\u0006\u0004\bq\u0010\nR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010uR\u0016\u0010w\u001a\u0004\u0018\u00010v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010zR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010F\u001a\u00020E8\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\bF\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u0089\u0001\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0016\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010\u007f\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010¤\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R(\u0010ª\u0001\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bª\u0001\u0010x\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010°\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R*\u0010·\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R*\u0010Á\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ê\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010zR*\u0010Ì\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ó\u0001\u001a\u00030Ò\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R*\u0010Ú\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010á\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R*\u0010è\u0001\u001a\u00030ç\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R*\u0010ï\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R*\u0010ö\u0001\u001a\u00030õ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R*\u0010ý\u0001\u001a\u00030ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R*\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R*\u0010\u0092\u0002\u001a\u00030\u0091\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R=\u0010\u0099\u0002\u001a\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\u0098\u00028\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u0012\u0005\b\u009f\u0002\u0010\n\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R*\u0010¡\u0002\u001a\u00030 \u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R*\u0010¨\u0002\u001a\u00030§\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010±\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u0018\u0010µ\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u001a\u0010¸\u0002\u001a\u00030·\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0002\u0010¹\u0002R$\u0010W\u001a\u00020V8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bW\u0010º\u0002\u0012\u0005\b½\u0002\u0010\n\u001a\u0006\b»\u0002\u0010¼\u0002R\u0019\u0010X\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\bX\u0010\u008f\u0001\u001a\u0005\b¾\u0002\u0010\u0014R\u001d\u0010¿\u0002\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\u000e\n\u0005\b¿\u0002\u0010z\u001a\u0005\bÀ\u0002\u0010 R\u0018\u0010Â\u0002\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u001c\u0010Å\u0002\u001a\u0005\u0018\u00010Ä\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R\u001e\u0010É\u0002\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÇ\u0002\u0010\u007f\u001a\u0005\bÈ\u0002\u0010`R\u0018\u0010Í\u0002\u001a\u00030Ê\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R\u0016\u0010Ï\u0002\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0002\u0010 R\u0011\u0010e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010 R\u0016\u0010Ñ\u0002\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0002\u0010 R\u0015\u0010f\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0002\u0010 R\u0016\u0010Ó\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0002\u0010 ¨\u0006Ü\u0002"}, d2 = {"Lcom/pinterest/ui/grid/videopin/PinVideoGridCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lab2/a;", "Lqa2/m1;", "Lqa2/c0;", "Lnx/v;", "", "Lqa2/f0;", "", "updateVideoViewBackgroundForTesting", "()V", "", "yOffset", "updateInnerViewsForYOffset", "(F)V", "", "isMuted", "onUserUpdatedMuteState", "(Z)V", "gridCount", "()F", "Lcom/pinterest/api/model/f30;", "pin", "", "pinGridPosition", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "Lkotlin/Function1;", "Lni1/y2;", "customization", "(Lcom/pinterest/api/model/f30;ILkotlin/jvm/functions/Function1;)V", "resizable", "()Z", "", "uid", "()Ljava/lang/String;", "onAttachedToWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onViewRecycled", "onItemDragStart", "newAdapterPosition", "onItemDragEnd", "(I)V", "isDragAndDropEnabledForItem", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "isMutedOnGrid", "onInitialized", "onAttached", "onDetached", "onScrollStarted", "onDeactivated", "markImpressionStart", "()Ljava/lang/Object;", "markImpressionEnd", "onDeactivatedScrollAwareGridView", "Lti1/f;", "pinRep", "Lwa2/m;", "pinFeatureConfig", "Lnx/d0;", "pinalytics", "Lni1/o2;", "viewModel", "Lao2/j0;", "scope", "bindPinRepViewLayer", "(Lti1/f;Lwa2/m;Lnx/d0;Lni1/o2;Lao2/j0;)V", "playWhenReady", "playbackState", "handlePlaybackState", "(ZI)Z", "setVideoPin", "Lcom/pinterest/video/core/view/PinterestVideoView;", "videoView", "cornerRadius", "setVideoViewCornerRadius", "(Lcom/pinterest/api/model/f30;Lcom/pinterest/video/core/view/PinterestVideoView;F)V", "setupLetterboxBackground", "resizeVideoView", "resetFixedHeightViews", "setupVideoEndFrame", "getParentGridTop", "()I", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "endFrame", "showVideoEndFrame", "(Lcom/pinterest/design/widget/RoundedCornersLayout;)V", "isFixedHeightPin", "onlyTopCornersRounded", "(Lcom/pinterest/video/core/view/PinterestVideoView;FLcom/pinterest/design/widget/RoundedCornersLayout;ZZ)V", "shouldEnableVideoEndFrame", "(Lcom/pinterest/api/model/f30;)Z", "iconRes", "showPinReactionSuccess", "startPinRepViewModel", "maybeSetupAdsOpenMeasurement", "(Lcom/pinterest/api/model/f30;)V", "handleDlAdCloseupOverlayHidePlaybackState", "maybeResetVideoFlavor", "setItemSelected", "Lnx/d0;", "getPinalytics", "()Lnx/d0;", "Lao2/j0;", "Lni1/d0;", "pinModelToVMStateConverterFactoryForTesting", "Lni1/d0;", "shouldAlwaysPlay", "Z", "disableVideoEndFrame", "Lwa2/m;", "Lni1/c0;", "vmStateConverter$delegate", "Lxk2/k;", "getVmStateConverter", "()Lni1/c0;", "vmStateConverter", "Lti1/a;", "calculatedFields", "Lti1/a;", "Lti1/f;", "getPinRep", "()Lti1/f;", "pinRepViewModel", "Lni1/o2;", "Lcom/pinterest/api/model/f30;", "selectedPadding", "I", "selectedBorderOffset", "F", "Landroid/graphics/RectF;", "selectedBorderRect", "Landroid/graphics/RectF;", "selectedItemRect", "Landroid/graphics/Path;", "selectedPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "selectedPaint$delegate", "getSelectedPaint", "()Landroid/graphics/Paint;", "selectedPaint", "Lqa2/j0;", "pgcViewFactory", "Lqa2/j0;", "getPgcViewFactory", "()Lqa2/j0;", "setPgcViewFactory", "(Lqa2/j0;)V", "Lni1/t2;", "pinRepViewModelFactory", "Lni1/t2;", "getPinRepViewModelFactory", "()Lni1/t2;", "setPinRepViewModelFactory", "(Lni1/t2;)V", "pinModelToVMStateConverterFactory", "getPinModelToVMStateConverterFactory", "()Lni1/d0;", "setPinModelToVMStateConverterFactory", "(Lni1/d0;)V", "Llh0/o;", "baseExperimentsHelper", "Llh0/o;", "getBaseExperimentsHelper", "()Llh0/o;", "setBaseExperimentsHelper", "(Llh0/o;)V", "Llh0/m4;", "videoFeatureLibraryExperiments", "Llh0/m4;", "getVideoFeatureLibraryExperiments", "()Llh0/m4;", "setVideoFeatureLibraryExperiments", "(Llh0/m4;)V", "Lao2/o1;", "contentDescJob", "Lao2/o1;", "Llh0/j;", "adsLibraryExperiments", "Llh0/j;", "getAdsLibraryExperiments", "()Llh0/j;", "setAdsLibraryExperiments", "(Llh0/j;)V", "Lab2/p;", "videoEndFrame", "Lab2/p;", "videoHasEnded", "Lm60/w;", "eventManager", "Lm60/w;", "getEventManager", "()Lm60/w;", "setEventManager", "(Lm60/w;)V", "Lbc2/e;", "mp4TrackSelector", "Lbc2/e;", "getMp4TrackSelector", "()Lbc2/e;", "setMp4TrackSelector", "(Lbc2/e;)V", "Lac2/p1;", "videoManagerUtil", "Lac2/p1;", "getVideoManagerUtil", "()Lac2/p1;", "setVideoManagerUtil", "(Lac2/p1;)V", "Lac2/m;", "videoManager", "Lac2/m;", "getVideoManager", "()Lac2/m;", "setVideoManager", "(Lac2/m;)V", "Lj80/b;", "carouselUtil", "Lj80/b;", "getCarouselUtil", "()Lj80/b;", "setCarouselUtil", "(Lj80/b;)V", "Les/a;", "adFormats", "Les/a;", "getAdFormats", "()Les/a;", "setAdFormats", "(Les/a;)V", "Lur/a;", "adsCoreDependencies", "Lur/a;", "getAdsCoreDependencies", "()Lur/a;", "setAdsCoreDependencies", "(Lur/a;)V", "Lkv/a;", "adsAudioOverlayPowerscoreExperimentManager", "Lkv/a;", "getAdsAudioOverlayPowerscoreExperimentManager", "()Lkv/a;", "setAdsAudioOverlayPowerscoreExperimentManager", "(Lkv/a;)V", "Lkv/c;", "organicAudioOverlayPowerscoreExperimentManager", "Lkv/c;", "getOrganicAudioOverlayPowerscoreExperimentManager", "()Lkv/c;", "setOrganicAudioOverlayPowerscoreExperimentManager", "(Lkv/c;)V", "Les/h;", "adsCommonDisplay", "Les/h;", "getAdsCommonDisplay", "()Les/h;", "setAdsCommonDisplay", "(Les/h;)V", "Lvr/a;", "adsCommonAnalytics", "Lvr/a;", "getAdsCommonAnalytics", "()Lvr/a;", "setAdsCommonAnalytics", "(Lvr/a;)V", "Lhs/e;", "dlAdCloseupPinOverlayVisibility", "Lhs/e;", "getDlAdCloseupPinOverlayVisibility", "()Lhs/e;", "setDlAdCloseupPinOverlayVisibility", "(Lhs/e;)V", "getDlAdCloseupPinOverlayVisibility$annotations", "Lqs/g;", "premiereSpotlightHFSlotIndexDebugLogger", "Lqs/g;", "getPremiereSpotlightHFSlotIndexDebugLogger", "()Lqs/g;", "setPremiereSpotlightHFSlotIndexDebugLogger", "(Lqs/g;)V", "Low/a;", "adsOpenMeasurementManager", "Low/a;", "getAdsOpenMeasurementManager", "()Low/a;", "setAdsOpenMeasurementManager", "(Low/a;)V", "Le21/n;", "reactionSuccessOverlayView", "Le21/n;", "Lnc2/j;", "cachedVideoViewFlavor", "Lnc2/j;", "ab2/j", "eventsSubscriber", "Lab2/j;", "Lab2/n;", "storyPinVideoGridCellExt", "Lab2/n;", "Lcom/pinterest/video/core/view/PinterestVideoView;", "getVideoView", "()Lcom/pinterest/video/core/view/PinterestVideoView;", "getVideoView$annotations", "getCornerRadius", "forceMuteVideo", "getForceMuteVideo", "Lnc2/f;", "playabilityTracker", "Lnc2/f;", "Landroid/graphics/drawable/ShapeDrawable;", "letterboxBackground", "Landroid/graphics/drawable/ShapeDrawable;", "endFrameDelay$delegate", "getEndFrameDelay", "endFrameDelay", "Lqa2/h0;", "getInternalCell", "()Lqa2/h0;", "internalCell", "getShouldForceLetterbox", "shouldForceLetterbox", "getShowAudioIndicatorOnGrid", "showAudioIndicatorOnGrid", "getOnlyTopCornersRounded", "isGrayLetterbox", "Landroid/content/Context;", "context", "initialPinFeatureConfig", "customPinGridCellFactory", "<init>", "(Landroid/content/Context;Lnx/d0;Lwa2/m;Lao2/j0;Lqa2/j0;Lni1/d0;ZZ)V", "Companion", "ab2/d", "videoFeatureLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class PinVideoGridCell extends b implements a, m1, c0, v, f0 {
    private static final int BACKGROUND_ALPHA_DARK_MODE = 26;
    private static final int BACKGROUND_ALPHA_LIGHT_MODE = 255;

    @NotNull
    public static final d Companion = new d();
    private static final float MAX_RESOLUTION_WIDTH = 7680.0f;
    private static final int MAX_WIDTH_GRID_COUNT = 1;
    public es.a adFormats;
    public kv.a adsAudioOverlayPowerscoreExperimentManager;
    public vr.a adsCommonAnalytics;
    public h adsCommonDisplay;
    public ur.a adsCoreDependencies;
    public j adsLibraryExperiments;
    public ow.a adsOpenMeasurementManager;
    public o baseExperimentsHelper;
    private nc2.j cachedVideoViewFlavor;

    @NotNull
    private ti1.a calculatedFields;
    public j80.b carouselUtil;
    private o1 contentDescJob;
    private final float cornerRadius;
    private final boolean disableVideoEndFrame;
    public e dlAdCloseupPinOverlayVisibility;

    /* renamed from: endFrameDelay$delegate, reason: from kotlin metadata */
    @NotNull
    private final k endFrameDelay;
    public w eventManager;

    @NotNull
    private final ab2.j eventsSubscriber;
    private final boolean forceMuteVideo;
    private ShapeDrawable letterboxBackground;
    public bc2.e mp4TrackSelector;
    public c organicAudioOverlayPowerscoreExperimentManager;
    public j0 pgcViewFactory;
    private f30 pin;

    @NotNull
    private final m pinFeatureConfig;
    public d0 pinModelToVMStateConverterFactory;
    private final d0 pinModelToVMStateConverterFactoryForTesting;

    @NotNull
    private final f pinRep;

    @NotNull
    private final o2 pinRepViewModel;
    public t2 pinRepViewModelFactory;

    @NotNull
    private final nx.d0 pinalytics;

    @NotNull
    private final nc2.f playabilityTracker;
    public g premiereSpotlightHFSlotIndexDebugLogger;
    private n reactionSuccessOverlayView;

    @NotNull
    private final ao2.j0 scope;
    private final float selectedBorderOffset;

    @NotNull
    private final RectF selectedBorderRect;

    @NotNull
    private final RectF selectedItemRect;
    private final int selectedPadding;

    /* renamed from: selectedPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final k selectedPaint;

    @NotNull
    private final Path selectedPath;
    private final boolean shouldAlwaysPlay;
    private ab2.n storyPinVideoGridCellExt;
    private p videoEndFrame;
    public m4 videoFeatureLibraryExperiments;
    private boolean videoHasEnded;
    public ac2.m videoManager;
    public p1 videoManagerUtil;

    @NotNull
    private final PinterestVideoView videoView;

    /* renamed from: vmStateConverter$delegate, reason: from kotlin metadata */
    @NotNull
    private final k vmStateConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinVideoGridCell(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull m initialPinFeatureConfig, @NotNull ao2.j0 scope, j0 j0Var, d0 d0Var, boolean z13, boolean z14) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(initialPinFeatureConfig, "initialPinFeatureConfig");
        Intrinsics.checkNotNullParameter(scope, "scope");
        inject();
        this.pinalytics = pinalytics;
        this.scope = scope;
        this.pinModelToVMStateConverterFactoryForTesting = d0Var;
        this.shouldAlwaysPlay = z13;
        this.disableVideoEndFrame = z14;
        m a13 = m.a(initialPinFeatureConfig, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, new b0(eo1.c.lego_corner_radius_medium), false, -8201, -1, 767);
        this.pinFeatureConfig = a13;
        this.vmStateConverter = xk2.m.b(new ab2.h(this, 1));
        this.calculatedFields = ps0.m.d(a13);
        this.selectedPadding = getResources().getDimensionPixelSize(r0.margin_half);
        this.selectedBorderOffset = getResources().getDimensionPixelSize(r0.margin_quarter);
        this.selectedBorderRect = new RectF();
        this.selectedItemRect = new RectF();
        this.selectedPath = new Path();
        this.selectedPaint = xk2.m.b(new j2(12, context, this));
        this.eventsSubscriber = new ab2.j(this);
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z15 = bk.f.z(context, pinalytics, sc2.d.video_view_simple, 8);
        this.videoView = z15;
        this.playabilityTracker = ((ac2.o1) getVideoManager()).f2005h;
        this.endFrameDelay = xk2.m.b(new ab2.h(this, 0));
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) (j0Var == null ? getPgcViewFactory() : j0Var)).a(context, true);
        this.pinRep = sbaPinRep;
        qa2.d0 d0Var2 = a13.f128855d0;
        o2 a14 = d0Var2 != null ? t2.a(getPinRepViewModelFactory(), scope, new zw.a(d0Var2), 6) : t2.a(getPinRepViewModelFactory(), scope, null, 14);
        this.pinRepViewModel = a14;
        bindPinRepViewLayer(sbaPinRep, a13, pinalytics, a14, scope);
        float intValue = a13.f128889u0.a(context).intValue();
        this.cornerRadius = intValue;
        z15.M(intValue);
        z15.D0 = this.calculatedFields.f117703b ? g0.RELATED_PIN : g0.FLOWED_PIN;
        z15.z(1);
        z15.g0(z13 ? nc2.j.AUTOPLAY_ALWAYS_WITH_NETWORK : nc2.j.AUTOPLAY_MAYBE_WITH_NETWORK);
        z15.e0(bc2.m.GRID);
        z15.O(true);
        z15.P(true);
        z15.u0(new ab2.c(this, z15));
        sbaPinRep.setPinVideoGridCellControlsListener(this);
        sbaPinRep.addToView(this);
        addView(z15, -2, -2);
        setWillNotDraw(false);
    }

    private final void bindPinRepViewLayer(f pinRep, m pinFeatureConfig, nx.d0 pinalytics, o2 viewModel, ao2.j0 scope) {
        pinRep.setPinalytics(pinalytics);
        pinRep.applyUnMigratedPFCFields(pinFeatureConfig.f128875n0, pinFeatureConfig.f128861g0, pinFeatureConfig.f128855d0, pinFeatureConfig.f128879p0, pinFeatureConfig.M);
        pinRep.setEventIntake(viewModel.c());
        kotlin.jvm.internal.j.z(scope, null, null, new ab2.g(viewModel, pinRep, this, null), 3);
    }

    @NotNull
    public static final PinVideoGridCell from(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull ao2.j0 scope, @NotNull i pinFeatureConfig) {
        d dVar = Companion;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return d.b(dVar, context, pinalytics, scope, false, false, null, pinFeatureConfig, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP);
    }

    public static /* synthetic */ void getDlAdCloseupPinOverlayVisibility$annotations() {
    }

    private final int getEndFrameDelay() {
        return ((Number) this.endFrameDelay.getValue()).intValue();
    }

    private final boolean getOnlyTopCornersRounded() {
        f fVar = this.pinRep;
        si1.d dVar = (si1.d) (fVar instanceof si1.d ? (si1.e) fVar : null);
        if (dVar != null) {
            return dVar.getHasChin() || dVar.getHasPinChips();
        }
        return false;
    }

    private final int getParentGridTop() {
        KeyEvent.Callback internalCell = getInternalCell();
        Intrinsics.g(internalCell, "null cannot be cast to non-null type android.view.View");
        ViewParent parent = ((View) internalCell).getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        View O = r.O(parent);
        Rect rect = new Rect();
        if (O != null) {
            O.getGlobalVisibleRect(rect);
        }
        return rect.top;
    }

    private final Paint getSelectedPaint() {
        return (Paint) this.selectedPaint.getValue();
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }

    private final ni1.c0 getVmStateConverter() {
        return (ni1.c0) this.vmStateConverter.getValue();
    }

    private final void handleDlAdCloseupOverlayHidePlaybackState() {
        if (this.pin != null) {
            m4 videoFeatureLibraryExperiments = getVideoFeatureLibraryExperiments();
            videoFeatureLibraryExperiments.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) videoFeatureLibraryExperiments.f83425a;
            if (g1Var.o("android_dl_ad_closeup_overlay_hide", "enabled", z3Var) || g1Var.l("android_dl_ad_closeup_overlay_hide")) {
                e dlAdCloseupPinOverlayVisibility = getDlAdCloseupPinOverlayVisibility();
                f30 f30Var = this.pin;
                if (f30Var == null) {
                    Intrinsics.r("pin");
                    throw null;
                }
                if (Intrinsics.d(((hs.c) dlAdCloseupPinOverlayVisibility).a(f30Var.getUid()), Boolean.TRUE)) {
                    w eventManager = getEventManager();
                    f30 f30Var2 = this.pin;
                    if (f30Var2 != null) {
                        eventManager.d(new ls1.a(f30Var2.getUid()));
                        return;
                    } else {
                        Intrinsics.r("pin");
                        throw null;
                    }
                }
                w eventManager2 = getEventManager();
                f30 f30Var3 = this.pin;
                if (f30Var3 != null) {
                    eventManager2.d(new ls1.b(f30Var3.getUid()));
                } else {
                    Intrinsics.r("pin");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handlePlaybackState(boolean playWhenReady, int playbackState) {
        boolean z13 = playWhenReady && playbackState == 3;
        p pVar = this.videoEndFrame;
        if (pVar == null) {
            return z13;
        }
        if (pVar.isEnabled()) {
            if (playbackState == 4 && !this.videoHasEnded) {
                this.videoHasEnded = true;
                showVideoEndFrame(pVar);
                return true;
            }
            if (playbackState == 4 && this.videoHasEnded) {
                return true;
            }
            if (this.videoHasEnded) {
                this.videoHasEnded = false;
                bs1.c.X0(pVar);
                this.videoView.j(0L, false);
                oc2.i.b(this.videoView, 0L, 2);
            }
        }
        return z13;
    }

    private final boolean isGrayLetterbox() {
        m4 videoFeatureLibraryExperiments = getVideoFeatureLibraryExperiments();
        z3 activate = a4.f83298b;
        videoFeatureLibraryExperiments.getClass();
        Intrinsics.checkNotNullParameter("enabled_gray", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        return ((g1) videoFeatureLibraryExperiments.f83425a).o("android_ads_short_video_letterbox", "enabled_gray", activate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeResetVideoFlavor() {
        nc2.j jVar = this.cachedVideoViewFlavor;
        if (jVar != null) {
            PinterestVideoView pinterestVideoView = this.videoView;
            if (pinterestVideoView.K != nc2.j.DISABLE_AUTOPLAY) {
                jVar = null;
            }
            if (jVar != null) {
                pinterestVideoView.getClass();
                Intrinsics.checkNotNullParameter(jVar, "<set-?>");
                pinterestVideoView.K = jVar;
            }
        }
    }

    private final void maybeSetupAdsOpenMeasurement(f30 pin) {
        if (ab2.e.f1742a[((vr.b) getAdsCommonAnalytics()).d(pin).ordinal()] == 1 && ((p0) getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = getAdsOpenMeasurementManager();
            PinterestVideoView view = this.videoView;
            p0 p0Var = (p0) adsOpenMeasurementManager;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.f(p0Var, pin, view, null), 3);
        }
    }

    private final void resetFixedHeightViews() {
        a0.k1(this, -2);
        this.videoView.z(1);
        PinterestVideoView pinterestVideoView = this.videoView;
        ViewGroup.LayoutParams layoutParams = pinterestVideoView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        pinterestVideoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resizeVideoView() {
        if (!getShouldForceLetterbox()) {
            a0.k1(this, getInternalCell().getViewHeight());
        }
        this.videoView.z(0);
        PinterestVideoView pinterestVideoView = this.videoView;
        ViewGroup.LayoutParams layoutParams = pinterestVideoView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        h0 internalCell = getInternalCell();
        Intrinsics.checkNotNullParameter(internalCell, "<this>");
        layoutParams.height = internalCell.getPinDrawableHeight();
        pinterestVideoView.setLayoutParams(layoutParams);
        if (getShouldForceLetterbox()) {
            PinterestVideoView pinterestVideoView2 = this.videoView;
            pinterestVideoView2.f52776b0 = true;
            pinterestVideoView2.setBackground(this.letterboxBackground);
        }
    }

    private final void setItemSelected() {
        int i13 = this.selectedPadding;
        setPadding(i13, i13, i13, i13);
        this.selectedPath.reset();
        Path path = this.selectedPath;
        RectF rectF = this.selectedBorderRect;
        float f13 = this.cornerRadius;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f13, f13, direction);
        RectF rectF2 = this.selectedItemRect;
        RectF rectF3 = this.selectedBorderRect;
        rectF2.top = rectF3.top;
        rectF2.right = rectF3.right;
        rectF2.bottom = rectF3.top + this.cornerRadius;
        this.selectedPath.addRect(rectF2, direction);
        setSelected(isSelected());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        r3 = ((es.v) r3).t(r25, lh0.d.f83320b.b());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setVideoPin(com.pinterest.api.model.f30 r25, int r26) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.videopin.PinVideoGridCell.setVideoPin(com.pinterest.api.model.f30, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVideoPin$lambda$4(PinVideoGridCell this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setupVideoEndFrame();
    }

    private final void setVideoViewCornerRadius(f30 pin, PinterestVideoView videoView, float cornerRadius) {
        boolean z13 = this.calculatedFields.f117706e;
        ArrayList e13 = pin != null ? h.e(getAdsCommonDisplay(), pin, Boolean.TRUE, 2) : null;
        es.c cVar = (es.c) getAdFormats();
        cVar.getClass();
        boolean z14 = z13 && e13 != null && (e13.isEmpty() ^ true) && !cVar.S(pin) && cVar.y(pin);
        if (!z13) {
            z14 = false;
        }
        f fVar = this.pinRep;
        si1.d dVar = (si1.d) (fVar instanceof si1.d ? (si1.e) fVar : null);
        if (dVar == null || (!(dVar.getHasChin() || dVar.getHasPinChips()) || z14)) {
            videoView.M(cornerRadius);
            return;
        }
        float[] value = {cornerRadius, cornerRadius, cornerRadius, cornerRadius, 0.0f, 0.0f, 0.0f, 0.0f};
        videoView.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        videoView.f52794v = value;
        videoView.N(videoView.getWidth(), videoView.getHeight(), value);
        videoView.invalidate();
    }

    private final void setupLetterboxBackground() {
        int color;
        float f13 = this.cornerRadius;
        float f14 = getOnlyTopCornersRounded() ? 0.0f : this.cornerRadius;
        this.letterboxBackground = new ShapeDrawable(new RoundRectShape(new float[]{f13, f13, f13, f13, f14, f14, f14, f14}, null, null));
        Context context = getContext();
        int i13 = (context == null || !a0.q0(context)) ? 255 : 26;
        ShapeDrawable shapeDrawable = this.letterboxBackground;
        Paint paint = shapeDrawable != null ? shapeDrawable.getPaint() : null;
        if (paint == null) {
            return;
        }
        if (isGrayLetterbox()) {
            Context context2 = getContext();
            int i14 = sc2.a.letterbox_gray_background;
            Object obj = d5.a.f53679a;
            color = context2.getColor(i14);
        } else {
            Context context3 = getContext();
            int i15 = sc2.a.letterbox_black_background;
            Object obj2 = d5.a.f53679a;
            color = context3.getColor(i15);
        }
        paint.setColor(f5.c.j(color, i13));
    }

    private final void setupVideoEndFrame() {
        wq1.a aVar = new wq1.a(this, 26);
        p pVar = this.videoEndFrame;
        if (pVar == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            p pVar2 = new p(context, aVar);
            this.videoEndFrame = pVar2;
            addView(pVar2);
        } else if (pVar != null) {
            pVar.setOnClickListener(aVar);
        }
        p pVar3 = this.videoEndFrame;
        if (pVar3 != null) {
            pVar3.setOnLongClickListener(new n0(this, 13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupVideoEndFrame$lambda$11(PinVideoGridCell this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pinRepViewModel.c().a(new u1(new z(true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupVideoEndFrame$lambda$13(PinVideoGridCell this$0, View view) {
        Rect bounds;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        f30 f30Var = this$0.pin;
        si1.a aVar = null;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (n60.o.B(f30Var, "getIsPromoted(...)")) {
            this$0.setBackground(bs1.c.f0(this$0, s0.lego_pin_rounded_rect, null, null, 6));
        }
        this$0.setElevation(1.0f);
        this$0.animate().rotation(-3.0f).scaleX(1.1f).scaleY(1.1f).setDuration(300L).start();
        u50.r c13 = this$0.pinRepViewModel.c();
        Rect rect = new Rect();
        this$0.pinRep.asView().getGlobalVisibleRect(rect);
        Unit unit = Unit.f80348a;
        si1.a B0 = u.B0(rect);
        wa2.a pinDrawable = this$0.pinRep.getPinDrawable();
        if (pinDrawable != null && (bounds = pinDrawable.getBounds()) != null) {
            aVar = u.B0(bounds);
        }
        si1.a aVar2 = aVar;
        Intrinsics.f(aVar2);
        c13.a(new t1(B0, aVar2, this$0.pinRep.asView().getRootView().getWidth(), this$0.pinRep.asView().getHeight(), this$0.getParentGridTop()));
        return true;
    }

    private final boolean shouldEnableVideoEndFrame(f30 pin) {
        int i13 = 0;
        if (this.disableVideoEndFrame || !n60.o.B(pin, "getIsPromoted(...)")) {
            return false;
        }
        Boolean R4 = pin.R4();
        Intrinsics.checkNotNullExpressionValue(R4, "getIsEligibleForWebCloseup(...)");
        if (!R4.booleanValue() || j1.J0(pin)) {
            return false;
        }
        j experiments = getAdsLibraryExperiments();
        boolean a13 = this.calculatedFields.a();
        boolean b13 = this.calculatedFields.b();
        p1 videoManagerUtil = getVideoManagerUtil();
        kv.a audioOverlayPowerscoreExperimentManager = getAdsAudioOverlayPowerscoreExperimentManager();
        c organicAudioOverlayPowerscoreExperimentManager = getOrganicAudioOverlayPowerscoreExperimentManager();
        boolean G = ((es.c) getAdFormats()).G(pin);
        h adsCommonDisplay = getAdsCommonDisplay();
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        return (j1.P0(pin, adsCommonDisplay, a13, b13, experiments.c(), G, new is1.a(experiments, i13), experiments.b()) || j1.O1(adsCommonDisplay, audioOverlayPowerscoreExperimentManager, organicAudioOverlayPowerscoreExperimentManager, pin, experiments, videoManagerUtil, G)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPinReactionSuccess(int iconRes) {
        wa2.a T;
        if (this.reactionSuccessOverlayView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            n nVar = new n(context, iconRes);
            this.reactionSuccessOverlayView = nVar;
            addView(nVar);
        }
        n nVar2 = this.reactionSuccessOverlayView;
        if (nVar2 == null || (T = com.bumptech.glide.d.T(getInternalCell())) == null) {
            return;
        }
        nVar2.setLayoutParams(new ConstraintLayout.LayoutParams(T.f128841d, T.f128842e));
        nVar2.b();
    }

    private final void showVideoEndFrame(RoundedCornersLayout endFrame) {
        showVideoEndFrame(this.videoView, this.cornerRadius, endFrame, isFixedHeightPin(), getOnlyTopCornersRounded());
        kg.a.s(endFrame, 0L, null, 6);
    }

    private final void startPinRepViewModel(f30 pin, int pinGridPosition, Function1<? super y2, y2> customization) {
        this.pinRep.bindDisplayState(this.pinRepViewModel.b((y2) customization.invoke(y2.b(getVmStateConverter().a(pinGridPosition, pin), null, null, null, false, false, null, null, false, false, isMutedOnGrid(), getShowAudioIndicatorOnGrid(), 0, false, resizable(), null, null, null, null, null, null, null, 1073741823, 4177919)), false));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (isSelected()) {
            canvas.drawPath(this.selectedPath, getSelectedPaint());
        }
    }

    @NotNull
    public final es.a getAdFormats() {
        es.a aVar = this.adFormats;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    @NotNull
    public final kv.a getAdsAudioOverlayPowerscoreExperimentManager() {
        kv.a aVar = this.adsAudioOverlayPowerscoreExperimentManager;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
        throw null;
    }

    @NotNull
    public final vr.a getAdsCommonAnalytics() {
        vr.a aVar = this.adsCommonAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsCommonAnalytics");
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
    public final j getAdsLibraryExperiments() {
        j jVar = this.adsLibraryExperiments;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("adsLibraryExperiments");
        throw null;
    }

    @NotNull
    public final ow.a getAdsOpenMeasurementManager() {
        ow.a aVar = this.adsOpenMeasurementManager;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsOpenMeasurementManager");
        throw null;
    }

    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @NotNull
    public final o getBaseExperimentsHelper() {
        o oVar = this.baseExperimentsHelper;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.r("baseExperimentsHelper");
        throw null;
    }

    @NotNull
    public final j80.b getCarouselUtil() {
        j80.b bVar = this.carouselUtil;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("carouselUtil");
        throw null;
    }

    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final e getDlAdCloseupPinOverlayVisibility() {
        e eVar = this.dlAdCloseupPinOverlayVisibility;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("dlAdCloseupPinOverlayVisibility");
        throw null;
    }

    @NotNull
    public final w getEventManager() {
        w wVar = this.eventManager;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public boolean getForceMuteVideo() {
        return this.forceMuteVideo;
    }

    @Override // qa2.f0
    @NotNull
    public h0 getInternalCell() {
        return this.pinRep;
    }

    @NotNull
    public final bc2.e getMp4TrackSelector() {
        bc2.e eVar = this.mp4TrackSelector;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("mp4TrackSelector");
        throw null;
    }

    @NotNull
    public final c getOrganicAudioOverlayPowerscoreExperimentManager() {
        c cVar = this.organicAudioOverlayPowerscoreExperimentManager;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
        throw null;
    }

    @NotNull
    public final j0 getPgcViewFactory() {
        j0 j0Var = this.pgcViewFactory;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("pgcViewFactory");
        throw null;
    }

    @NotNull
    public final d0 getPinModelToVMStateConverterFactory() {
        d0 d0Var = this.pinModelToVMStateConverterFactory;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("pinModelToVMStateConverterFactory");
        throw null;
    }

    @NotNull
    public final f getPinRep() {
        return this.pinRep;
    }

    @NotNull
    public final t2 getPinRepViewModelFactory() {
        t2 t2Var = this.pinRepViewModelFactory;
        if (t2Var != null) {
            return t2Var;
        }
        Intrinsics.r("pinRepViewModelFactory");
        throw null;
    }

    @NotNull
    public final nx.d0 getPinalytics() {
        return this.pinalytics;
    }

    @NotNull
    public final g getPremiereSpotlightHFSlotIndexDebugLogger() {
        g gVar = this.premiereSpotlightHFSlotIndexDebugLogger;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("premiereSpotlightHFSlotIndexDebugLogger");
        throw null;
    }

    public boolean getShouldForceLetterbox() {
        h hVar = ((ur.b) getAdsCoreDependencies()).f123060c;
        f30 f30Var = this.pin;
        if (f30Var != null) {
            return ((es.v) hVar).S(f30Var);
        }
        Intrinsics.r("pin");
        throw null;
    }

    public boolean getShowAudioIndicatorOnGrid() {
        f30 f30Var = this.pin;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        j adsLibraryExperiments = getAdsLibraryExperiments();
        p1 videoManagerUtil = getVideoManagerUtil();
        kv.a adsAudioOverlayPowerscoreExperimentManager = getAdsAudioOverlayPowerscoreExperimentManager();
        c organicAudioOverlayPowerscoreExperimentManager = getOrganicAudioOverlayPowerscoreExperimentManager();
        es.a adFormats = getAdFormats();
        f30 f30Var2 = this.pin;
        if (f30Var2 != null) {
            return j1.O1(getAdsCommonDisplay(), adsAudioOverlayPowerscoreExperimentManager, organicAudioOverlayPowerscoreExperimentManager, f30Var, adsLibraryExperiments, videoManagerUtil, ((es.c) adFormats).G(f30Var2));
        }
        Intrinsics.r("pin");
        throw null;
    }

    @NotNull
    public final m4 getVideoFeatureLibraryExperiments() {
        m4 m4Var = this.videoFeatureLibraryExperiments;
        if (m4Var != null) {
            return m4Var;
        }
        Intrinsics.r("videoFeatureLibraryExperiments");
        throw null;
    }

    @NotNull
    public final ac2.m getVideoManager() {
        ac2.m mVar = this.videoManager;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("videoManager");
        throw null;
    }

    @NotNull
    public final p1 getVideoManagerUtil() {
        p1 p1Var = this.videoManagerUtil;
        if (p1Var != null) {
            return p1Var;
        }
        Intrinsics.r("videoManagerUtil");
        throw null;
    }

    @NotNull
    public final PinterestVideoView getVideoView() {
        return this.videoView;
    }

    public float gridCount() {
        return hf0.b.f69004d;
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public boolean getF45303h() {
        return false;
    }

    public final boolean isFixedHeightPin() {
        if (this.calculatedFields.f117702a == null) {
            f30 f30Var = this.pin;
            if (f30Var == null) {
                Intrinsics.r("pin");
                throw null;
            }
            if (!dl2.b.M1(f30Var) && !getShouldForceLetterbox()) {
                return false;
            }
        }
        return true;
    }

    public boolean isMutedOnGrid() {
        return this.videoView.getB();
    }

    @Override // nx.v
    public Object markImpressionEnd() {
        return getInternalCell().markImpressionEnd();
    }

    @Override // nx.v
    public Object markImpressionStart() {
        return getInternalCell().markImpressionStart();
    }

    @Override // qa2.c0
    public void onAttached() {
        getInternalCell().onAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.eventsSubscriber);
        handleDlAdCloseupOverlayHidePlaybackState();
    }

    @Override // qa2.c0
    public void onDeactivated() {
        getInternalCell().onDeactivated();
    }

    public void onDeactivatedScrollAwareGridView() {
        getInternalCell().onDeactivated();
    }

    @Override // qa2.c0
    public void onDetached() {
        getInternalCell().onDetached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (getShowAudioIndicatorOnGrid()) {
            this.videoView.P(true);
        }
        getEventManager().j(this.eventsSubscriber);
        o1 o1Var = this.contentDescJob;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
        super.onDetachedFromWindow();
    }

    @Override // qa2.c0
    public void onInitialized() {
        getInternalCell().onInitialized();
    }

    @Override // ar0.d
    public void onItemDragEnd(int newAdapterPosition) {
        this.pinRepViewModel.c().a(new k1(newAdapterPosition));
    }

    @Override // ar0.d
    public void onItemDragStart() {
        this.pinRepViewModel.c().a(l1.f90735a);
        setItemSelected();
        invalidate();
    }

    @Override // qa2.c0
    public void onScrollStarted() {
        getInternalCell().onScrollStarted();
    }

    @Override // android.view.View
    public void onSizeChanged(int w13, int h10, int oldw, int oldh) {
        RectF rectF = this.selectedBorderRect;
        float f13 = this.selectedBorderOffset;
        rectF.set(f13, f13, w13 - f13, h10 - f13);
    }

    @Override // qa2.m1
    public void onUserUpdatedMuteState(boolean isMuted) {
        ((ac2.o1) getVideoManager()).s(this.videoView, isMuted);
    }

    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // qa2.f0, y92.i
    public void onViewRecycled() {
        getInternalCell().onViewRecycled();
        setForeground(null);
        m4 videoFeatureLibraryExperiments = getVideoFeatureLibraryExperiments();
        videoFeatureLibraryExperiments.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) videoFeatureLibraryExperiments.f83425a;
        if (!g1Var.o("android_dl_ad_closeup_overlay_hide", "enabled", z3Var) && !g1Var.l("android_dl_ad_closeup_overlay_hide")) {
            maybeResetVideoFlavor();
        }
        es.a aVar = ((ur.b) getAdsCoreDependencies()).f123058a;
        f30 f30Var = this.pin;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (((es.c) aVar).t(f30Var) && ((p0) getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = getAdsOpenMeasurementManager();
            f30 f30Var2 = this.pin;
            if (f30Var2 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String pinId = f30Var2.getUid();
            Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
            p0 p0Var = (p0) adsOpenMeasurementManager;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.h(p0Var, pinId, null), 3);
        }
        PinterestVideoView pinterestVideoView = this.videoView;
        pinterestVideoView.L0 = false;
        pinterestVideoView.M0 = false;
        pinterestVideoView.L = null;
        pinterestVideoView.M = null;
        updateInnerViewsForYOffset(0.0f);
        ab2.n nVar = this.storyPinVideoGridCellExt;
        if (nVar != null) {
            nVar.a();
        }
        if (isFixedHeightPin()) {
            resetFixedHeightViews();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0 || !this.videoView.V()) {
            return;
        }
        this.videoView.P(true);
    }

    @Override // y92.g
    public boolean resizable() {
        return false;
    }

    public final void setAdFormats(@NotNull es.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adFormats = aVar;
    }

    public final void setAdsAudioOverlayPowerscoreExperimentManager(@NotNull kv.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsAudioOverlayPowerscoreExperimentManager = aVar;
    }

    public final void setAdsCommonAnalytics(@NotNull vr.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsCommonAnalytics = aVar;
    }

    public final void setAdsCommonDisplay(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.adsCommonDisplay = hVar;
    }

    public final void setAdsCoreDependencies(@NotNull ur.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsCoreDependencies = aVar;
    }

    public final void setAdsLibraryExperiments(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.adsLibraryExperiments = jVar;
    }

    public final void setAdsOpenMeasurementManager(@NotNull ow.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsOpenMeasurementManager = aVar;
    }

    public final void setBaseExperimentsHelper(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.baseExperimentsHelper = oVar;
    }

    public final void setCarouselUtil(@NotNull j80.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.carouselUtil = bVar;
    }

    public final void setDlAdCloseupPinOverlayVisibility(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.dlAdCloseupPinOverlayVisibility = eVar;
    }

    public final void setEventManager(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.eventManager = wVar;
    }

    public /* bridge */ /* synthetic */ void setLoadState(yk1.i iVar) {
    }

    public final void setMp4TrackSelector(@NotNull bc2.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.mp4TrackSelector = eVar;
    }

    public final void setOrganicAudioOverlayPowerscoreExperimentManager(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.organicAudioOverlayPowerscoreExperimentManager = cVar;
    }

    public final void setPgcViewFactory(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.pgcViewFactory = j0Var;
    }

    public void setPin(@NotNull f30 pin, int pinGridPosition) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        setPin(pin, pinGridPosition, ab2.k.f1754i);
    }

    public final void setPinModelToVMStateConverterFactory(@NotNull d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.pinModelToVMStateConverterFactory = d0Var;
    }

    public final void setPinRepViewModelFactory(@NotNull t2 t2Var) {
        Intrinsics.checkNotNullParameter(t2Var, "<set-?>");
        this.pinRepViewModelFactory = t2Var;
    }

    public final void setPremiereSpotlightHFSlotIndexDebugLogger(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.premiereSpotlightHFSlotIndexDebugLogger = gVar;
    }

    public final void setVideoFeatureLibraryExperiments(@NotNull m4 m4Var) {
        Intrinsics.checkNotNullParameter(m4Var, "<set-?>");
        this.videoFeatureLibraryExperiments = m4Var;
    }

    public final void setVideoManager(@NotNull ac2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.videoManager = mVar;
    }

    public final void setVideoManagerUtil(@NotNull p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<set-?>");
        this.videoManagerUtil = p1Var;
    }

    @Override // y92.g
    /* renamed from: uid */
    public String getUniqueId() {
        f30 f30Var = this.pin;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        Intrinsics.r("pin");
        throw null;
    }

    public final void updateInnerViewsForYOffset(float yOffset) {
        this.videoView.setY(yOffset);
        p pVar = this.videoEndFrame;
        if (pVar == null) {
            return;
        }
        pVar.setY(yOffset);
    }

    public final void updateVideoViewBackgroundForTesting() {
        PinterestVideoView pinterestVideoView = this.videoView;
        Context context = getContext();
        int i13 = eo1.b.color_themed_text_shopping;
        Object obj = d5.a.f53679a;
        pinterestVideoView.setBackground(new ColorDrawable(context.getColor(i13)));
    }

    public final void setPin(@NotNull f30 pin, int pinGridPosition, @NotNull Function1<? super y2, y2> customization) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(customization, "customization");
        this.pin = pin;
        startPinRepViewModel(pin, pinGridPosition, customization);
        if (b40.Q0(pin)) {
            if (this.storyPinVideoGridCellExt == null) {
                this.storyPinVideoGridCellExt = new ab2.n(this.pinalytics, this.videoView, this.pinRepViewModel.c(), getAdsLibraryExperiments(), getVideoFeatureLibraryExperiments(), getVideoManagerUtil(), this.playabilityTracker, getAdFormats(), getAdsAudioOverlayPowerscoreExperimentManager(), getOrganicAudioOverlayPowerscoreExperimentManager(), getAdsCommonDisplay());
            }
            ab2.n nVar = this.storyPinVideoGridCellExt;
            if (nVar == null) {
                Intrinsics.r("storyPinVideoGridCellExt");
                throw null;
            }
            nVar.b(pin);
        } else {
            setVideoPin(pin, pinGridPosition);
        }
        if (getShowAudioIndicatorOnGrid() || getForceMuteVideo()) {
            PinterestVideoView pinterestVideoView = this.videoView;
            pinterestVideoView.f52775a0 = false;
            pinterestVideoView.P(true);
            PinterestVideoView pinterestVideoView2 = this.videoView;
            Boolean p63 = pin.p6();
            Intrinsics.checkNotNullExpressionValue(p63, "getShouldMute(...)");
            pinterestVideoView2.t0(p63.booleanValue());
        }
        this.videoView.O0 = n60.o.y(pin, "getIsThirdPartyAd(...)");
        yk1.a aVar = new yk1.a(getResources(), getContext().getTheme());
        m4 videoFeatureLibraryExperiments = getVideoFeatureLibraryExperiments();
        videoFeatureLibraryExperiments.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) videoFeatureLibraryExperiments.f83425a;
        this.contentDescJob = com.bumptech.glide.c.Y(aVar, pin, false, false, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new l(this, 3), 12);
        maybeSetupAdsOpenMeasurement(pin);
    }

    @NotNull
    public static final PinVideoGridCell from(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull ao2.j0 scope, boolean z13, @NotNull i pinFeatureConfig) {
        d dVar = Companion;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return d.b(dVar, context, pinalytics, scope, z13, false, null, pinFeatureConfig, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
    }

    private final void showVideoEndFrame(PinterestVideoView videoView, float cornerRadius, RoundedCornersLayout endFrame, boolean isFixedHeightPin, boolean onlyTopCornersRounded) {
        int height;
        int width;
        int i13 = (int) cornerRadius;
        if (onlyTopCornersRounded) {
            endFrame.g(i13, i13, 0, 0);
        } else {
            endFrame.e(i13);
        }
        f fVar = this.pinRep;
        si1.d dVar = (si1.d) (fVar instanceof si1.d ? (si1.e) fVar : null);
        boolean hasPinChips = dVar != null ? dVar.getHasPinChips() : false;
        if (isFixedHeightPin) {
            height = videoView.getHeight();
        } else if (hasPinChips) {
            int height2 = videoView.getHeight();
            f fVar2 = this.pinRep;
            si1.c cVar = (si1.c) (fVar2 instanceof si1.c ? (si1.e) fVar2 : null);
            height = height2 + (cVar != null ? cVar.getChipsHeight() : 0);
        } else {
            height = videoView.getHeight();
        }
        if (isFixedHeightPin) {
            width = videoView.getWidth();
        } else {
            width = videoView.E.getWidth();
        }
        endFrame.setLayoutParams(new ConstraintLayout.LayoutParams(width, height));
        bs1.c.b1(endFrame);
    }

    @NotNull
    public static final PinVideoGridCell from(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull ao2.j0 scope, boolean z13, boolean z14, j0 j0Var, @NotNull i pinFeatureConfig) {
        d dVar = Companion;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return d.b(dVar, context, pinalytics, scope, z13, z14, j0Var, pinFeatureConfig, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
    }

    @NotNull
    public static final PinVideoGridCell from(@NotNull Context context, @NotNull nx.d0 d0Var, @NotNull ao2.j0 j0Var, boolean z13, boolean z14, j0 j0Var2, @NotNull i iVar, d0 d0Var2) {
        Companion.getClass();
        return d.a(context, d0Var, j0Var, z13, z14, j0Var2, iVar, d0Var2);
    }

    @NotNull
    public static final PinVideoGridCell from(@NotNull Context context, @NotNull nx.d0 pinalytics, @NotNull ao2.j0 scope, boolean z13, boolean z14, @NotNull i pinFeatureConfig) {
        d dVar = Companion;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return d.b(dVar, context, pinalytics, scope, z13, z14, null, pinFeatureConfig, 160);
    }

    public /* synthetic */ PinVideoGridCell(Context context, nx.d0 d0Var, m mVar, ao2.j0 j0Var, j0 j0Var2, d0 d0Var2, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, d0Var, mVar, j0Var, (i13 & 16) != 0 ? null : j0Var2, (i13 & 32) != 0 ? null : d0Var2, z13, z14);
    }
}
