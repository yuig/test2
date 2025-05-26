package com.pinterest.feature.pincarouselads.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import ao2.o1;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.s30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.grid.lego.CarouselPinStatsView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import h32.c1;
import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p2;
import lh0.z3;
import m60.r0;
import m60.s0;
import ni1.a1;
import ni1.c0;
import ni1.h1;
import ni1.o2;
import ni1.p1;
import ni1.t2;
import ni1.u1;
import ni1.x1;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import qa2.d0;
import qa2.f0;
import qa2.h0;
import qa2.j0;
import so.ba;
import so.ib;
import so.jb;
import so.oa;
import so.w8;

@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u00072\u00020\u00062\u00020\b2\u00020\tB4\u0012\b\u0010\u009d\u0002\u001a\u00030\u009c\u0002\u0012\u0006\u0010o\u001a\u00020n\u0012\u0007\u0010\u0092\u0001\u001a\u00020.\u0012\u000e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\n0\u0096\u0001¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0014¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0010H\u0014¢\u0006\u0004\b$\u0010\"J\u0011\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010&J\u001d\u0010*\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b*\u0010+J/\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00132\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020;*\u0002062\u0006\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u0010H\u0017¢\u0006\u0004\b@\u0010\u0015J\u001f\u0010C\u001a\u00020\u00132\u0006\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010:J\u0017\u0010F\u001a\u00020\u00132\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\u0010H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u00132\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ7\u0010T\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u0010H\u0014¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\rH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\nH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00132\u0006\u0010A\u001a\u000206H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00132\u0006\u0010A\u001a\u000206H\u0016¢\u0006\u0004\b^\u0010]J\u000f\u0010_\u001a\u00020\u0013H\u0016¢\u0006\u0004\b_\u0010\u0017J\u000f\u0010`\u001a\u00020\u0013H\u0016¢\u0006\u0004\b`\u0010\u0017J\u001d\u0010c\u001a\u00020\u00132\u0006\u0010b\u001a\u00020a2\u0006\u0010A\u001a\u000206¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0013H\u0016¢\u0006\u0004\be\u0010\u0017J%\u0010g\u001a\u00020\u00132\u0006\u0010A\u001a\u0002062\u0006\u0010f\u001a\u00020\u00102\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00132\u0006\u0010A\u001a\u000206H\u0016¢\u0006\u0004\bi\u0010]J3\u0010s\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020r0p2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010w\u001a\u00020\u00132\u0006\u0010u\u001a\u00020q2\u0006\u0010v\u001a\u00020rH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0013H\u0002¢\u0006\u0004\by\u0010\u0017J\u000f\u0010z\u001a\u00020\u0013H\u0002¢\u0006\u0004\bz\u0010\u0017J\u0017\u0010{\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020\u00132\u0006\u0010A\u001a\u000206H\u0002¢\u0006\u0004\b}\u0010]J\u0017\u0010\u007f\u001a\u00020\u00132\u0006\u0010~\u001a\u00020\nH\u0002¢\u0006\u0004\b\u007f\u0010[J\u0011\u0010\u0080\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\"J-\u0010\u0084\u0001\u001a\u00020\u00132\u0007\u0010\u0081\u0001\u001a\u00020\u00102\u0007\u0010\u0082\u0001\u001a\u00020\u00102\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J4\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u0086\u0001\u001a\u00020q2\u0006\u0010A\u001a\u0002062\u0006\u0010f\u001a\u00020\u00102\u0007\u0010\u0087\u0001\u001a\u00020aH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J$\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0087\u0001\u001a\u00020a2\u0006\u0010A\u001a\u000206H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u000206H\u0002¢\u0006\u0005\b\u008d\u0001\u0010|J\u0019\u0010\u008e\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u000206H\u0002¢\u0006\u0005\b\u008e\u0001\u0010|R\u001a\u0010o\u001a\u00020n8\u0006¢\u0006\u000f\n\u0005\bo\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0092\u0001\u001a\u00020.8\u0006¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R#\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\n0\u0096\u00018\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009e\u0001\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010\u000fR\u0017\u0010\u0086\u0001\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R*\u0010¥\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¯\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010¶\u0001\u001a\u00030µ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010½\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R'\u0010k\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bk\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R'\u0010m\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bm\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Î\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R*\u0010Õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010Ü\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001a\u0010ã\u0001\u001a\u00030â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0019\u0010å\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001b\u0010ç\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0019\u0010é\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001b\u0010ë\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010è\u0001R\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010ì\u0001R\u0017\u0010í\u0001\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001c\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001b\u0010ò\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R!\u0010ø\u0001\u001a\u00030ô\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0001\u0010\u009c\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R!\u0010ý\u0001\u001a\u00030ù\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010\u009c\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R!\u0010\u0082\u0002\u001a\u00030þ\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0001\u0010\u009c\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R!\u0010\u0087\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u009c\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R!\u0010\u008c\u0002\u001a\u00030\u0088\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u009c\u0001\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001e\u0010\u008d\u0002\u001a\u00020\n8\u0014X\u0094D¢\u0006\u000f\n\u0006\b\u008d\u0002\u0010æ\u0001\u001a\u0005\b\u008e\u0002\u0010\fR\u001e\u0010\u008f\u0002\u001a\u00020\n8\u0014X\u0094D¢\u0006\u000f\n\u0006\b\u008f\u0002\u0010æ\u0001\u001a\u0005\b\u008f\u0002\u0010\fR2\u0010\u0090\u0002\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u0012\u0005\b\u0096\u0002\u0010\u0017\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0019\u0010\u0097\u0002\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010ê\u0001R\u0018\u0010\u009b\u0002\u001a\u00030\u0098\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002¨\u0006 \u0002"}, d2 = {"Lcom/pinterest/feature/pincarouselads/view/SingleColumnCarouselPinView;", "Lcom/pinterest/feature/pincarouselads/view/BaseRecyclerCellView;", "Lyq0/a0;", "Ll21/e;", "Lm21/a;", "Lnx/v;", "", "Ly92/g;", "Lqa2/f0;", "Lqa2/d0;", "", "resizable", "()Z", "", "uid", "()Ljava/lang/String;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onInitialized", "onAttached", "onDetached", "onScrollStarted", "onDeactivatedScrollAwareGridView", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "getIndexTrackerViewId", "()I", "getPinterestRecyclerViewId", "getLayoutResourceId", "markImpressionStart", "()Ljava/lang/Object;", "markImpressionEnd", "Lyq0/z;", "adapter", "registerViewHolderCreators", "(Lyq0/z;)V", "Lpb0/a;", "clock", "Lnx/d0;", "pinalytics", "Lnx/o0;", "pinalyticsManager", "", "Lzy/m;", "createImpressionLoggers", "(Lpb0/a;Lnx/d0;Lnx/o0;)[Lzy/m;", "Lcom/pinterest/api/model/f30;", "latestPin", "modelGridPosition", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "Ln21/i;", "createPresenter", "(Lcom/pinterest/api/model/f30;I)Ln21/i;", "currentIndex", "count", "setBadge", "pin", "gridPosition", "updatePinGridTitle", "", "carouselSizeRatio", "setCarouselRatio", "(F)V", "visibleIndex", "setVisibleCarouselIndex", "(I)V", "Ll21/d;", "interactor", "setCarouselContainerInteractor", "(Ll21/d;)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "titleStr", "setLongestTitle", "(Ljava/lang/String;)V", "showTrackingDots", "showImageOnly", "(Z)V", "resetImageOnly", "(Lcom/pinterest/api/model/f30;)V", "setPinStats", "onPinClicked", "rotateAndScale", "Lwa2/i;", "pinFeatureConfig", "applyFeatureConfig", "(Lwa2/i;Lcom/pinterest/api/model/f30;)V", "onViewRecycled", "position", "bindItem", "(Lcom/pinterest/api/model/f30;ILwa2/i;)V", "onOpenPinCloseup", "Lqa2/j0;", "pinGridCellFactory", "Lni1/t2;", "pinRepViewModelFactory", "Lao2/j0;", "scope", "Lkotlin/Pair;", "Lti1/f;", "Lni1/o2;", "createPinRepView", "(Lqa2/j0;Lni1/t2;Lao2/j0;)Lkotlin/Pair;", "view", "viewModel", "initializePinRep", "(Lti1/f;Lni1/o2;)V", "setCarouselIndexTrackerMargin", "addScrollListener", "shouldApplyCardCounterRemovalExperiment", "(Lcom/pinterest/api/model/f30;)Z", "loadContentDescription", "hasChin", "modifyViewsForD2S", "getChinHeight", "dx", "scrollState", "userInvokedScroll", "updateCurrentIndex", "(IIZ)V", "pinRep", "legacyPinFeatureConfig", "startOrRestartViewModel", "(Lti1/f;Lcom/pinterest/api/model/f30;ILwa2/i;)V", "Lwa2/m;", "updatePinFeatureConfigForInnerCell", "(Lwa2/i;Lcom/pinterest/api/model/f30;)Lwa2/m;", "checkOrganicCarouselExpGroupForCardCounter", "checkOrganicCarouselExpGroupForScrollingDots", "Lao2/j0;", "getScope", "()Lao2/j0;", "analytics", "Lnx/d0;", "getAnalytics", "()Lnx/d0;", "Luj2/q;", "networkStateStream", "Luj2/q;", "getNetworkStateStream", "()Luj2/q;", "debugTag$delegate", "Lxk2/k;", "getDebugTag", "debugTag", "Lti1/f;", "pinRepViewModel", "Lni1/o2;", "boundPinFeatureConfig", "Lwa2/m;", "Llh0/p2;", "pinCarouselAdsLibraryExperiments", "Llh0/p2;", "getPinCarouselAdsLibraryExperiments", "()Llh0/p2;", "setPinCarouselAdsLibraryExperiments", "(Llh0/p2;)V", "Lao2/o1;", "experimentJob", "Lao2/o1;", "Luk1/e;", "presenterPinalyticsFactory", "Luk1/e;", "getPresenterPinalyticsFactory", "()Luk1/e;", "setPresenterPinalyticsFactory", "(Luk1/e;)V", "Ln21/j;", "singleColumnCarouselPinPresenterFactory", "Ln21/j;", "getSingleColumnCarouselPinPresenterFactory", "()Ln21/j;", "setSingleColumnCarouselPinPresenterFactory", "(Ln21/j;)V", "Lro1/c;", "deepLinkAdUtil", "Lro1/c;", "getDeepLinkAdUtil", "()Lro1/c;", "setDeepLinkAdUtil", "(Lro1/c;)V", "Lqa2/j0;", "getPinGridCellFactory", "()Lqa2/j0;", "setPinGridCellFactory", "(Lqa2/j0;)V", "Lni1/t2;", "getPinRepViewModelFactory", "()Lni1/t2;", "setPinRepViewModelFactory", "(Lni1/t2;)V", "Lni1/d0;", "vmStateConverterFactory", "Lni1/d0;", "getVmStateConverterFactory", "()Lni1/d0;", "setVmStateConverterFactory", "(Lni1/d0;)V", "Lfs/c;", "adsSalesDealsDisplay", "Lfs/c;", "getAdsSalesDealsDisplay", "()Lfs/c;", "setAdsSalesDealsDisplay", "(Lfs/c;)V", "Lur/a;", "ads", "Lur/a;", "getAds", "()Lur/a;", "setAds", "(Lur/a;)V", "Lni1/c0;", "vmStateConverter", "Lni1/c0;", "minLinesMeasured", "Z", "longestTitleStr", "Ljava/lang/String;", "maxHeight", "I", "uniqueId", "Ll21/d;", "defaultCornerRadius", "F", "Lh32/c1;", "eventData", "Lh32/c1;", "customPinActionHandler", "Lqa2/d0;", "Landroid/view/ViewGroup;", "carouselViewWrapper$delegate", "getCarouselViewWrapper", "()Landroid/view/ViewGroup;", "carouselViewWrapper", "Lcom/pinterest/feature/pincarouselads/view/PinCellClipRecyclerView;", "carouselRecyclerView$delegate", "getCarouselRecyclerView", "()Lcom/pinterest/feature/pincarouselads/view/PinCellClipRecyclerView;", "carouselRecyclerView", "Lcom/pinterest/gestalt/text/GestaltText;", "carouselBadgeView$delegate", "getCarouselBadgeView", "()Lcom/pinterest/gestalt/text/GestaltText;", "carouselBadgeView", "Landroid/widget/FrameLayout;", "carouselBadgeViewBackground$delegate", "getCarouselBadgeViewBackground", "()Landroid/widget/FrameLayout;", "carouselBadgeViewBackground", "Lcom/pinterest/ui/grid/lego/CarouselPinStatsView;", "carouselPinStats$delegate", "getCarouselPinStats", "()Lcom/pinterest/ui/grid/lego/CarouselPinStatsView;", "carouselPinStats", "shouldShowTrackingDots", "getShouldShowTrackingDots", "isDraggable", "presenter", "Ln21/i;", "getPresenter", "()Ln21/i;", "setPresenter", "(Ln21/i;)V", "getPresenter$annotations", "globalDx", "Lqa2/h0;", "getInternalCell", "()Lqa2/h0;", "internalCell", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lao2/j0;Lnx/d0;Luj2/q;)V", "pinCarouselAdsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor", "NonConstantResourceId"})
/* loaded from: classes2.dex */
public class SingleColumnCarouselPinView extends g implements l21.e, nx.v, y92.g, f0, d0 {
    public ur.a ads;
    public fs.c adsSalesDealsDisplay;

    @NotNull
    private final nx.d0 analytics;
    private wa2.m boundPinFeatureConfig;

    /* renamed from: carouselBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k carouselBadgeView;

    /* renamed from: carouselBadgeViewBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k carouselBadgeViewBackground;

    /* renamed from: carouselPinStats$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k carouselPinStats;

    /* renamed from: carouselRecyclerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k carouselRecyclerView;

    /* renamed from: carouselViewWrapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k carouselViewWrapper;
    private d0 customPinActionHandler;

    /* renamed from: debugTag$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k debugTag;
    public ro1.c deepLinkAdUtil;
    private final float defaultCornerRadius;
    private c1 eventData;
    private o1 experimentJob;
    private int globalDx;
    private l21.d interactor;
    private final boolean isDraggable;
    private String longestTitleStr;
    private int maxHeight;
    private boolean minLinesMeasured;

    @NotNull
    private final uj2.q<Boolean> networkStateStream;
    public p2 pinCarouselAdsLibraryExperiments;
    public j0 pinGridCellFactory;

    @NotNull
    private final ti1.f pinRep;

    @NotNull
    private final o2 pinRepViewModel;
    public t2 pinRepViewModelFactory;
    private n21.i presenter;
    public uk1.e presenterPinalyticsFactory;

    @NotNull
    private final ao2.j0 scope;
    private final boolean shouldShowTrackingDots;
    public n21.j singleColumnCarouselPinPresenterFactory;
    private String uniqueId;
    private c0 vmStateConverter;
    public ni1.d0 vmStateConverterFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleColumnCarouselPinView(@NotNull Context context, @NotNull ao2.j0 scope, @NotNull nx.d0 analytics, @NotNull uj2.q<Boolean> networkStateStream) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.scope = scope;
        this.analytics = analytics;
        this.networkStateStream = networkStateStream;
        this.debugTag = xk2.m.b(j.f47382k);
        this.minLinesMeasured = true;
        float dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        this.defaultCornerRadius = dimensionPixelSize;
        this.carouselViewWrapper = xk2.m.b(new q(this, 4));
        this.carouselRecyclerView = xk2.m.b(new q(this, 3));
        this.carouselBadgeView = xk2.m.b(new q(this, 0));
        this.carouselBadgeViewBackground = xk2.m.b(new q(this, 1));
        this.carouselPinStats = xk2.m.b(new q(this, 2));
        this.shouldShowTrackingDots = true;
        this.isDraggable = true;
        addScrollListener();
        setPinalytics(analytics);
        PinCellClipRecyclerView carouselRecyclerView = getCarouselRecyclerView();
        carouselRecyclerView.f47349o = dimensionPixelSize;
        carouselRecyclerView.o();
        carouselRecyclerView.invalidate();
        getIndexTrackerView().c(eo1.b.color_themed_dark_gray, eo1.b.color_themed_background_secondary_strong);
        Pair<ti1.f, o2> createPinRepView = createPinRepView(getPinGridCellFactory(), getPinRepViewModelFactory(), scope);
        ti1.f fVar = (ti1.f) createPinRepView.f80346a;
        o2 o2Var = (o2) createPinRepView.f80347b;
        this.pinRep = fVar;
        this.pinRepViewModel = o2Var;
        initializePinRep(fVar, o2Var);
    }

    private final void addScrollListener() {
        getPinterestRecyclerView().b(new p(this));
    }

    private final boolean checkOrganicCarouselExpGroupForCardCounter(f30 pin) {
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            return false;
        }
        p2 pinCarouselAdsLibraryExperiments = getPinCarouselAdsLibraryExperiments();
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        return pinCarouselAdsLibraryExperiments.b("employees", z3Var) || getPinCarouselAdsLibraryExperiments().b("enabled", z3Var);
    }

    private final boolean checkOrganicCarouselExpGroupForScrollingDots(f30 pin) {
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            return false;
        }
        if (getPinCarouselAdsLibraryExperiments().b("enabled_remove_scrolling_dots", z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            return true;
        }
        return !getShouldShowTrackingDots();
    }

    private final Pair<ti1.f, o2> createPinRepView(j0 pinGridCellFactory, t2 pinRepViewModelFactory, ao2.j0 scope) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new Pair<>((ti1.f) ((qa2.d) pinGridCellFactory).a(context, true), t2.a(pinRepViewModelFactory, scope, new zw.a(this), 6));
    }

    private final FrameLayout getCarouselBadgeViewBackground() {
        Object value = this.carouselBadgeViewBackground.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    private final CarouselPinStatsView getCarouselPinStats() {
        Object value = this.carouselPinStats.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CarouselPinStatsView) value;
    }

    private final ViewGroup getCarouselViewWrapper() {
        Object value = this.carouselViewWrapper.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }

    private final int getChinHeight() {
        ti1.f fVar = this.pinRep;
        si1.c cVar = (si1.c) (fVar instanceof si1.c ? (si1.e) fVar : null);
        if (cVar != null) {
            return cVar.getChinHeight();
        }
        return 0;
    }

    public static /* synthetic */ void getPresenter$annotations() {
    }

    private final void initializePinRep(ti1.f view, o2 viewModel) {
        view.setEventIntake(viewModel.c());
        kotlin.jvm.internal.j.z(this.scope, null, null, new s(viewModel, view, null), 3);
        kotlin.jvm.internal.j.z(this.scope, null, null, new v(viewModel, this, null), 3);
        getCarouselViewWrapper().addView(view.asView());
        view.setOnPinRepPiecesMeasured(new q(this, 5));
    }

    private final void loadContentDescription(f30 pin) {
        yk1.a aVar = new yk1.a(getResources(), getContext().getTheme());
        p2 pinCarouselAdsLibraryExperiments = getPinCarouselAdsLibraryExperiments();
        pinCarouselAdsLibraryExperiments.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) pinCarouselAdsLibraryExperiments.f83457a;
        this.experimentJob = com.bumptech.glide.c.Y(aVar, pin, false, false, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new u00.e(this, 10), 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void modifyViewsForD2S(boolean hasChin) {
        int W;
        PinCellClipRecyclerView carouselRecyclerView = getCarouselRecyclerView();
        carouselRecyclerView.f47347m = hasChin;
        carouselRecyclerView.o();
        carouselRecyclerView.n(carouselRecyclerView.getWidth(), carouselRecyclerView.getHeight());
        carouselRecyclerView.invalidate();
        if (hasChin) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (dl2.b.T1(context)) {
                W = (dl2.b.G0(this, eo1.a.grid_cell_carousel_indicator_vertical_spacing) * 2) + bs1.c.W(this, r0.lego_grid_cell_chin_cta_height);
            } else {
                W = bs1.c.W(this, r0.lego_grid_cell_carousel_index_below_chin_top_spacing);
            }
            CarouselIndexView indexTrackerView = getIndexTrackerView();
            ViewGroup.LayoutParams layoutParams = indexTrackerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = W;
            indexTrackerView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCarouselIndexTrackerMargin() {
        int chinHeight;
        fs.c adsSalesDealsDisplay = getAdsSalesDealsDisplay();
        f30 c03 = this.pinRep.getC0();
        p2 pinCarouselAdsLibraryExperiments = getPinCarouselAdsLibraryExperiments();
        pinCarouselAdsLibraryExperiments.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) pinCarouselAdsLibraryExperiments.f83457a;
        boolean z13 = g1Var.o("ads_android_deal_ads_expansion_carousel_ads", "enabled", z3Var) || g1Var.l("ads_android_deal_ads_expansion_carousel_ads");
        q activateExperiment = new q(this, 8);
        adsSalesDealsDisplay.getClass();
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (c03 != null && adsSalesDealsDisplay.c(c03, false, false, false, adsSalesDealsDisplay.f62827a.a())) {
            activateExperiment.invoke();
        } else {
            z13 = false;
        }
        ti1.f fVar = this.pinRep;
        si1.d dVar = (si1.d) (fVar instanceof si1.d ? (si1.e) fVar : null);
        boolean z14 = dVar != null && dVar.getHasChin();
        if (z13 && z14 && (chinHeight = getChinHeight()) > 0) {
            int G0 = (dl2.b.G0(this, eo1.a.grid_cell_carousel_indicator_vertical_spacing) * 2) + chinHeight;
            CarouselIndexView indexTrackerView = getIndexTrackerView();
            ViewGroup.LayoutParams layoutParams = indexTrackerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = G0;
            indexTrackerView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0.l("ads_android_deal_ads_expansion_carousel_ads_remove_chip") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldApplyCardCounterRemovalExperiment(com.pinterest.api.model.f30 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "getIsPromoted(...)"
            boolean r0 = n60.o.B(r5, r0)
            if (r0 == 0) goto L38
            boolean r0 = com.pinterest.api.model.b40.w0(r5)
            if (r0 != 0) goto L1a
            es.a r0 = as.c.a()
            es.c r0 = (es.c) r0
            boolean r0 = r0.A(r5)
            if (r0 == 0) goto L38
        L1a:
            lh0.p2 r0 = r4.getPinCarouselAdsLibraryExperiments()
            r0.getClass()
            lh0.z3 r1 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83457a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r2 = "enabled"
            java.lang.String r3 = "ads_android_deal_ads_expansion_carousel_ads_remove_chip"
            boolean r1 = r0.o(r3, r2, r1)
            if (r1 != 0) goto L3e
            boolean r0 = r0.l(r3)
            if (r0 == 0) goto L38
            goto L3e
        L38:
            boolean r5 = r4.checkOrganicCarouselExpGroupForCardCounter(r5)
            if (r5 == 0) goto L40
        L3e:
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView.shouldApplyCardCounterRemovalExperiment(com.pinterest.api.model.f30):boolean");
    }

    private final void startOrRestartViewModel(ti1.f pinRep, f30 pin, int position, wa2.i legacyPinFeatureConfig) {
        wa2.m updatePinFeatureConfigForInnerCell = updatePinFeatureConfigForInnerCell(legacyPinFeatureConfig, pin);
        this.boundPinFeatureConfig = updatePinFeatureConfigForInnerCell;
        pinRep.applyUnMigratedPFCFields(updatePinFeatureConfigForInnerCell.f128875n0, updatePinFeatureConfigForInnerCell.f128861g0, updatePinFeatureConfigForInnerCell.f128855d0, updatePinFeatureConfigForInnerCell.f128879p0, updatePinFeatureConfigForInnerCell.M);
        this.customPinActionHandler = updatePinFeatureConfigForInnerCell.f128855d0;
        c0 a13 = ((ba) getVmStateConverterFactory()).a(updatePinFeatureConfigForInnerCell, new o(this, 0), new com.google.firebase.messaging.a0(this, 18));
        this.vmStateConverter = a13;
        pinRep.bindDisplayState(this.pinRepViewModel.b(a13.a(position, pin), false));
        this.pinRepViewModel.c().a(a1.f90594a);
        this.pinRepViewModel.c().a(new x1(new gk1.b0(false, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 startOrRestartViewModel$lambda$8(SingleColumnCarouselPinView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        nx.d0 pinalytics = this$0.getPinalytics();
        if (pinalytics != null) {
            return pinalytics.p();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap startOrRestartViewModel$lambda$9(SingleColumnCarouselPinView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        nx.d0 pinalytics = this$0.getPinalytics();
        if (pinalytics != null) {
            return pinalytics.f();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentIndex(int dx2, int scrollState, boolean userInvokedScroll) {
        l21.d dVar;
        this.globalDx = Math.abs(dx2) + this.globalDx;
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        Rect rect = new Rect();
        if (this.globalDx >= getWidth() * 0.85f) {
            int childCount = recyclerView.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = recyclerView.getChildAt(i13);
                childAt.getGlobalVisibleRect(rect);
                float width = rect.width() / recyclerView.getWidth();
                if (width >= 0.85f && width < 1.0f) {
                    this.globalDx = 0;
                    if (scrollState != 0 && (dVar = this.interactor) != null) {
                        getLinearLayoutManager().getClass();
                        ((n21.i) dVar).G3(l2.Z(childAt), userInvokedScroll);
                    }
                }
            }
        }
    }

    private final wa2.m updatePinFeatureConfigForInnerCell(wa2.i legacyPinFeatureConfig, f30 pin) {
        boolean z13;
        n21.i iVar = this.presenter;
        if (iVar == null || iVar.f89023p) {
            z13 = legacyPinFeatureConfig.f128796s0;
        } else {
            z13 = !checkOrganicCarouselExpGroupForScrollingDots(pin);
        }
        return wa2.m.a(m60.f0.i0(legacyPinFeatureConfig), false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, z13, null, null, false, -8388609, -1, 959);
    }

    public final void applyFeatureConfig(@NotNull wa2.i pinFeatureConfig, @NotNull f30 pin) {
        n21.i iVar;
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pin, "pin");
        n21.i iVar2 = this.presenter;
        if (iVar2 != null) {
            d0 d0Var = pinFeatureConfig.f128768e0;
            boolean z13 = false;
            iVar2.f89021n = false;
            if (pinFeatureConfig.f128797t && !iVar2.f89010c.d5().booleanValue()) {
                z13 = true;
            }
            iVar2.f89023p = z13;
            iVar2.f89024q = pinFeatureConfig.f128763c;
            iVar2.f89022o = pinFeatureConfig.f128799u;
        }
        n21.i iVar3 = this.presenter;
        if (iVar3 == null || !iVar3.isBound() || (iVar = this.presenter) == null) {
            return;
        }
        iVar.H3();
    }

    public final void bindItem(@NotNull f30 pin, int position, @NotNull wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        l21.d dVar = this.interactor;
        if (dVar == null || !((n21.i) dVar).D3(pin)) {
            this.presenter = createPresenter(pin, position);
            String str = this.uniqueId;
            if (str != null && !Intrinsics.d(str, pin.getUid())) {
                onViewRecycled();
            }
            this.uniqueId = pin.getUid();
        }
        startOrRestartViewModel(this.pinRep, pin, position, pinFeatureConfig);
        setPin(pin, position);
        applyFeatureConfig(pinFeatureConfig, pin);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    @NotNull
    public zy.m[] createImpressionLoggers(@NotNull pb0.a clock, nx.d0 pinalytics, @NotNull o0 pinalyticsManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return pinalytics != null ? new zy.m[]{new tq0.f(clock, pinalytics, null, getIndexTrackerView(), null, this.eventData)} : super.createImpressionLoggers(clock, pinalytics, pinalyticsManager);
    }

    @NotNull
    public n21.i createPresenter(@NotNull f30 f30Var, int i13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        n21.j singleColumnCarouselPinPresenterFactory = getSingleColumnCarouselPinPresenterFactory();
        uk1.e presenterPinalyticsFactory = getPresenterPinalyticsFactory();
        String uid = f30Var.getUid();
        nx.d0 d0Var = this.analytics;
        Intrinsics.f(uid);
        uk1.d f13 = ((uk1.a) presenterPinalyticsFactory).f(d0Var, uid);
        Boolean S4 = f30Var.S4();
        Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
        boolean booleanValue = S4.booleanValue();
        w8 w8Var = ((ib) singleColumnCarouselPinPresenterFactory).f113467a;
        m60.w wVar = (m60.w) w8Var.f114689b.f113885r0.get();
        oa oaVar = w8Var.f114689b;
        return new n21.i(f30Var, i13, f13, booleanValue, wVar, (uj2.q) oaVar.f113947u9.get(), (rg0.s) oaVar.Q5.get(), (j80.b) oaVar.O6.get(), ((jb) w8Var.f114692e).f(), (lh0.d) oaVar.Q6.get(), (es.a) oaVar.P6.get(), (ur.a) oaVar.Kb.get(), (es.h) oaVar.f113735i7.get());
    }

    @NotNull
    public final ur.a getAds() {
        ur.a aVar = this.ads;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("ads");
        throw null;
    }

    @NotNull
    public final fs.c getAdsSalesDealsDisplay() {
        fs.c cVar = this.adsSalesDealsDisplay;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("adsSalesDealsDisplay");
        throw null;
    }

    public /* bridge */ /* synthetic */ int getAllowedHeightChange(int i13) {
        return super.getAllowedHeightChange(i13);
    }

    @NotNull
    public final nx.d0 getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final GestaltText getCarouselBadgeView() {
        Object value = this.carouselBadgeView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    @NotNull
    public final PinCellClipRecyclerView getCarouselRecyclerView() {
        Object value = this.carouselRecyclerView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PinCellClipRecyclerView) value;
    }

    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    @NotNull
    public String getDebugTag() {
        return (String) this.debugTag.getValue();
    }

    @NotNull
    public final ro1.c getDeepLinkAdUtil() {
        ro1.c cVar = this.deepLinkAdUtil;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("deepLinkAdUtil");
        throw null;
    }

    @Override // com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView
    public int getIndexTrackerViewId() {
        return sy1.a.carouselIndexTrackerView;
    }

    @Override // qa2.f0
    @NotNull
    public h0 getInternalCell() {
        return this.pinRep;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public int getLayoutResourceId() {
        return sy1.b.view_simple_pin_image_carousel_lego;
    }

    @NotNull
    public final uj2.q<Boolean> getNetworkStateStream() {
        return this.networkStateStream;
    }

    /* renamed from: getNumColumns */
    public /* bridge */ /* synthetic */ int getZ0() {
        return 1;
    }

    @NotNull
    public final p2 getPinCarouselAdsLibraryExperiments() {
        p2 p2Var = this.pinCarouselAdsLibraryExperiments;
        if (p2Var != null) {
            return p2Var;
        }
        Intrinsics.r("pinCarouselAdsLibraryExperiments");
        throw null;
    }

    @NotNull
    public final j0 getPinGridCellFactory() {
        j0 j0Var = this.pinGridCellFactory;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("pinGridCellFactory");
        throw null;
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

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public int getPinterestRecyclerViewId() {
        return sy1.a.carouselRecyclerView;
    }

    public final n21.i getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final uk1.e getPresenterPinalyticsFactory() {
        uk1.e eVar = this.presenterPinalyticsFactory;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @NotNull
    public View getRoot() {
        return this;
    }

    @NotNull
    public final ao2.j0 getScope() {
        return this.scope;
    }

    public boolean getShouldShowTrackingDots() {
        return this.shouldShowTrackingDots;
    }

    @NotNull
    public final n21.j getSingleColumnCarouselPinPresenterFactory() {
        n21.j jVar = this.singleColumnCarouselPinPresenterFactory;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("singleColumnCarouselPinPresenterFactory");
        throw null;
    }

    @NotNull
    public final ni1.d0 getVmStateConverterFactory() {
        ni1.d0 d0Var = this.vmStateConverterFactory;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("vmStateConverterFactory");
        throw null;
    }

    /* renamed from: isDraggable, reason: from getter */
    public boolean getIsDraggable() {
        return this.isDraggable;
    }

    @Override // nx.v
    public Object markImpressionEnd() {
        BaseRecyclerContainerView.endImpressionsForCurrentChildImpressionViews$default(this, false, 1, null);
        onDeactivated();
        return this.pinRep.markImpressionEnd();
    }

    @Override // nx.v
    public Object markImpressionStart() {
        onActivated();
        startImpressionsForCurrentChildImpressionViews();
        return this.pinRep.markImpressionStart();
    }

    public /* bridge */ /* synthetic */ void mvpMaybeToggleOfflineEmptyStateVisibility() {
    }

    public void onAttached() {
        getInternalCell().onAttached();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n21.i iVar = this.presenter;
        if (iVar != null) {
            iVar.bind(this);
        }
    }

    public void onDeactivatedScrollAwareGridView() {
        getInternalCell().onDeactivated();
    }

    public void onDetached() {
        getInternalCell().onDetached();
    }

    @Override // com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView, com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        n21.i iVar = this.presenter;
        if (iVar != null) {
            iVar.unbind();
        }
        super.onDetachedFromWindow();
        o1 o1Var = this.experimentJob;
        if (o1Var != null) {
            o1Var.cancel((CancellationException) null);
        }
    }

    public void onInitialized() {
        getInternalCell().onInitialized();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l13, int t13, int r13, int b13) {
        super.onLayout(changed, l13, t13, r13, b13);
        ViewParent parent = getParent();
        while (!(parent instanceof PinterestRecyclerView)) {
            parent = parent.getParent();
        }
        ((PinterestRecyclerView) parent).b(new w());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.minLinesMeasured) {
            Rect rect = new Rect();
            Paint paint = new Paint();
            String str = this.longestTitleStr;
            if (str != null) {
                paint.getTextBounds(str, 0, str.length(), rect);
            }
            this.minLinesMeasured = true;
            measure(widthMeasureSpec, heightMeasureSpec);
            this.maxHeight = Math.max(this.maxHeight, getMeasuredHeight());
        }
        getIndexTrackerView().forceLayout();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        n21.i iVar = this.presenter;
        setMeasuredDimension(getMeasuredWidth(), (iVar == null || !iVar.f89023p) ? Math.max(getMeasuredHeight(), this.maxHeight) : getMeasuredHeight());
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(@NotNull f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        d0 d0Var = this.customPinActionHandler;
        if (d0Var != null) {
            d0Var.onOpenPinCloseup(pin);
        }
    }

    @Override // l21.e
    public void onPinClicked() {
        this.pinRepViewModel.c().a(new u1(new bk1.z(false)));
    }

    public void onScrollStarted() {
        getInternalCell().onScrollStarted();
    }

    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // qa2.f0, y92.i
    public void onViewRecycled() {
        this.pinRep.onViewRecycled();
        getCarouselViewWrapper().setForeground(null);
        this.maxHeight = 0;
        this.longestTitleStr = null;
        PinCellClipRecyclerView carouselRecyclerView = getCarouselRecyclerView();
        carouselRecyclerView.f47347m = false;
        carouselRecyclerView.o();
        bs1.c.U1(getCarouselBadgeViewBackground());
        CarouselIndexView indexTrackerView = getIndexTrackerView();
        ViewGroup.LayoutParams layoutParams = indexTrackerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = bs1.c.W(this, r0.lego_grid_cell_carousel_index_top_spacing);
        indexTrackerView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public void registerViewHolderCreators(@NotNull yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, new q(this, 6));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, new q(this, 7));
    }

    @Override // l21.e
    public void resetImageOnly(@NotNull f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        getIndexTrackerView().setVisibility(checkOrganicCarouselExpGroupForScrollingDots(pin) ? 8 : 0);
        bs1.c.U1(this.pinRep.asView());
    }

    @Override // y92.g
    public boolean resizable() {
        return false;
    }

    @Override // l21.e
    public void rotateAndScale() {
        setElevation(1.0f);
        Context context = getContext();
        int i13 = s0.lego_pin_rounded_rect;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
        animate().rotation(-3.0f).scaleX(1.1f).scaleY(1.1f).setDuration(300L).start();
    }

    public final void setAds(@NotNull ur.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.ads = aVar;
    }

    public final void setAdsSalesDealsDisplay(@NotNull fs.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.adsSalesDealsDisplay = cVar;
    }

    @Override // l21.e
    @SuppressLint({"SetTextI18n"})
    public void setBadge(int currentIndex, int count) {
        pk.a0.q(getCarouselBadgeView(), bs1.c.h2((currentIndex + 1) + "/" + count));
    }

    @Override // l21.e
    public void setCarouselContainerInteractor(@NotNull l21.d interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
    }

    @Override // l21.e
    public void setCarouselRatio(float carouselSizeRatio) {
        PinCellClipRecyclerView carouselRecyclerView = getCarouselRecyclerView();
        carouselRecyclerView.f47348n = carouselSizeRatio;
        carouselRecyclerView.requestLayout();
    }

    public final void setDeepLinkAdUtil(@NotNull ro1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.deepLinkAdUtil = cVar;
    }

    public /* bridge */ /* synthetic */ void setLoadState(yk1.i iVar) {
    }

    public void setLongestTitle(@NotNull String titleStr) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        this.longestTitleStr = titleStr;
        this.minLinesMeasured = false;
    }

    public void setPin(@NotNull f30 latestPin, int modelGridPosition) {
        Intrinsics.checkNotNullParameter(latestPin, "latestPin");
        l21.d dVar = this.interactor;
        if (dVar == null || !((n21.i) dVar).D3(latestPin)) {
            loadContentDescription(latestPin);
            this.eventData = bs1.c.q0(latestPin, getAds());
        }
        getCarouselRecyclerView().bringToFront();
        if (!latestPin.d5().booleanValue()) {
            getPinCarouselAdsLibraryExperiments().a();
        }
        if (shouldApplyCardCounterRemovalExperiment(latestPin)) {
            getCarouselBadgeView().setVisibility(8);
            getCarouselBadgeViewBackground().setVisibility(8);
        } else {
            getCarouselBadgeViewBackground().bringToFront();
            getCarouselBadgeView().bringToFront();
        }
        getIndexTrackerView().setVisibility(checkOrganicCarouselExpGroupForScrollingDots(latestPin) ? 8 : 0);
    }

    public final void setPinCarouselAdsLibraryExperiments(@NotNull p2 p2Var) {
        Intrinsics.checkNotNullParameter(p2Var, "<set-?>");
        this.pinCarouselAdsLibraryExperiments = p2Var;
    }

    public final void setPinGridCellFactory(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.pinGridCellFactory = j0Var;
    }

    public final void setPinRepViewModelFactory(@NotNull t2 t2Var) {
        Intrinsics.checkNotNullParameter(t2Var, "<set-?>");
        this.pinRepViewModelFactory = t2Var;
    }

    @Override // l21.e
    public void setPinStats(@NotNull f30 pin) {
        String str;
        Intrinsics.checkNotNullParameter(pin, "pin");
        CarouselPinStatsView carouselPinStats = getCarouselPinStats();
        bs1.c.U1(carouselPinStats);
        carouselPinStats.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        s30 s30Var = (s30) k3.j0(pin).get("30d_realtime");
        if (s30Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (cr0.f fVar : ua2.z.a()) {
            if (fVar instanceof cr0.e) {
                str = qb0.j.b(s30Var.getImpressionCount());
            } else if (fVar instanceof cr0.d) {
                str = qb0.j.b(s30Var.getSaveCount());
            } else if (fVar instanceof cr0.b) {
                Integer clickthroughCount = s30Var.getClickthroughCount();
                Intrinsics.f(clickthroughCount);
                str = qb0.j.b(clickthroughCount.intValue());
            } else {
                str = null;
            }
            arrayList.add(new ua2.b(fVar.a(), str));
        }
        carouselPinStats.f52551e.i(arrayList);
        carouselPinStats.requestLayout();
    }

    public final void setPresenter(n21.i iVar) {
        this.presenter = iVar;
    }

    public final void setPresenterPinalyticsFactory(@NotNull uk1.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.presenterPinalyticsFactory = eVar;
    }

    public final void setSingleColumnCarouselPinPresenterFactory(@NotNull n21.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.singleColumnCarouselPinPresenterFactory = jVar;
    }

    @Override // l21.e
    public void setVisibleCarouselIndex(int visibleIndex) {
        this.pinRepViewModel.c().a(new p1(visibleIndex));
    }

    public final void setVmStateConverterFactory(@NotNull ni1.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.vmStateConverterFactory = d0Var;
    }

    @Override // l21.e
    public void showImageOnly(boolean showTrackingDots) {
        k3.R1(getIndexTrackerView(), showTrackingDots);
        bs1.c.X0(this.pinRep.asView());
    }

    public /* bridge */ /* synthetic */ void triggerEmptyStateCheck() {
    }

    public /* bridge */ /* synthetic */ void triggerLoadMoreCheck() {
    }

    @Override // y92.g
    /* renamed from: uid, reason: from getter */
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override // l21.c
    public void updatePinGridTitle(@NotNull f30 pin, int gridPosition) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wa2.m mVar = this.boundPinFeatureConfig;
        if (mVar != null) {
            this.pinRepViewModel.c().a(new h1(wa2.m.a(mVar, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, pin.r4(), null, false, -1, -1, 895)));
        }
    }
}
