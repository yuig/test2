package com.pinterest.featurelibrary.pingridcell.sba.view;

import a11.e;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.or;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import ek1.c2;
import ek1.l;
import ek1.o;
import ek1.z;
import es.a;
import es.h;
import ey.g3;
import ff0.j;
import h32.a4;
import h32.e4;
import h32.g0;
import h32.z1;
import hs1.q;
import i1.a1;
import ij1.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kh2.c3;
import kh2.m0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;
import lh0.z3;
import m60.w;
import ni1.a3;
import ni1.b3;
import ni1.e0;
import ni1.g1;
import ni1.h0;
import ni1.i0;
import ni1.j0;
import ni1.k0;
import ni1.l0;
import ni1.n0;
import ni1.n1;
import ni1.o0;
import ni1.q1;
import ni1.q2;
import ni1.r0;
import ni1.r1;
import ni1.t0;
import ni1.u0;
import ni1.u1;
import ni1.v0;
import ni1.w0;
import ni1.x0;
import ni1.x1;
import ni1.y1;
import ni1.z0;
import ni1.z2;
import nx.b0;
import nx.c0;
import org.jetbrains.annotations.NotNull;
import ow.p0;
import qa2.c1;
import qa2.d0;
import qa2.m;
import qa2.m1;
import qa2.s0;
import qa2.v1;
import qa2.w1;
import si1.c;
import si1.d;
import t3.s1;
import ti1.b;
import ti1.f;
import ti1.p;
import ti1.t;
import ti1.u;
import ti1.v;
import ti1.x;
import ti1.y;
import u50.n;
import u50.r;
import ua2.f1;
import ua2.i1;
import xk2.k;
import y92.g;
import yi1.a0;
import yi1.s;

@Metadata(d1 = {"\u0000ú\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ³\u00052\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002´\u0005B\u0015\b\u0016\u0012\b\u0010«\u0005\u001a\u00030ª\u0005¢\u0006\u0006\b¬\u0005\u0010\u00ad\u0005B!\b\u0016\u0012\b\u0010«\u0005\u001a\u00030ª\u0005\u0012\n\u0010¯\u0005\u001a\u0005\u0018\u00010®\u0005¢\u0006\u0006\b¬\u0005\u0010°\u0005B(\b\u0016\u0012\b\u0010«\u0005\u001a\u00030ª\u0005\u0012\b\u0010¯\u0005\u001a\u00030®\u0005\u0012\u0007\u0010±\u0005\u001a\u00020\n¢\u0006\u0006\b¬\u0005\u0010²\u0005J?\u0010\u0012\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!J/\u0010&\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b&\u0010'J7\u0010-\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0018J\u0017\u00108\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010A\u001a\u00020\u00112\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010F\u001a\u00020\u00112\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00112\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010TJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0011\u0010^\u001a\u0004\u0018\u00010]H\u0017¢\u0006\u0004\b^\u0010_J\u0011\u0010`\u001a\u0004\u0018\u00010]H\u0016¢\u0006\u0004\b`\u0010_J\u0011\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bb\u0010cJ\u0011\u0010d\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bd\u0010cJ\u0011\u0010e\u001a\u0004\u0018\u00010CH\u0017¢\u0006\u0004\be\u0010fJ\u0019\u0010i\u001a\u00020\u00112\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u00112\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\nH\u0016¢\u0006\u0004\bt\u0010TJ\u000f\u0010u\u001a\u00020\nH\u0016¢\u0006\u0004\bu\u0010TJ\u000f\u0010v\u001a\u00020\u0011H\u0016¢\u0006\u0004\bv\u0010\u0018J\u000f\u0010w\u001a\u00020\u0011H\u0016¢\u0006\u0004\bw\u0010\u0018J\u000f\u0010x\u001a\u00020\u0007H\u0016¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u000eH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\n2\u0006\u0010|\u001a\u00020\nH\u0016¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u007f\u0010{J\u0011\u0010\u0080\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0080\u0001\u0010TJ\u0011\u0010\u0081\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0081\u0001\u0010TJ\u0011\u0010\u0082\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0082\u0001\u0010TJ\u0011\u0010\u0083\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0083\u0001\u0010TJ\u0011\u0010\u0084\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0084\u0001\u0010yJ\u0013\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001e\u0010\u0088\u0001\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u008a\u0001\u0010{J \u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\u00112\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\u00112\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0093\u0001\u00109J\u001c\u0010\u0094\u0001\u001a\u00020\u00112\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0094\u0001\u00109J#\u0010\u0098\u0001\u001a\u00020\u00112\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0018J\u001c\u0010\u009d\u0001\u001a\u00020\u00112\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001b\u0010 \u0001\u001a\u00020\n2\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b¢\u0001\u0010\u0018J\u001b\u0010£\u0001\u001a\u00020\u00112\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0013\u0010¦\u0001\u001a\u00030¥\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0013\u0010©\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0013\u0010¬\u0001\u001a\u00030«\u0001H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0013\u0010¯\u0001\u001a\u00030®\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0013\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0019\u0010´\u0001\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0005\b´\u0001\u0010=J\u001e\u0010·\u0001\u001a\u00020\u00112\n\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001a\u0010¹\u0001\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001c\u0010½\u0001\u001a\u00020\u00112\b\u0010¼\u0001\u001a\u00030»\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001c\u0010Á\u0001\u001a\u00020\u00112\b\u0010À\u0001\u001a\u00030¿\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001c\u0010Å\u0001\u001a\u00020\u00112\b\u0010Ä\u0001\u001a\u00030Ã\u0001H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u0014\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001c\u0010Ë\u0001\u001a\u00020\u00112\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Î\u0001\u001a\u00020\u00112\b\u0010Ê\u0001\u001a\u00030Í\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001c\u0010Ò\u0001\u001a\u00020\u00112\b\u0010Ñ\u0001\u001a\u00030Ð\u0001H\u0002¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001c\u0010Ö\u0001\u001a\u00020\u00112\b\u0010Õ\u0001\u001a\u00030Ô\u0001H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u0011\u0010Ø\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bØ\u0001\u0010\u0018J\u0011\u0010Ù\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÙ\u0001\u0010\u0018J\u0011\u0010Ú\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÚ\u0001\u0010\u0018J\u0011\u0010Û\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÛ\u0001\u0010\u0018J\u0011\u0010Ü\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bÜ\u0001\u0010\u0018J\u001c\u0010ß\u0001\u001a\u00020\u00112\b\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0002¢\u0006\u0006\bß\u0001\u0010à\u0001J\u001a\u0010á\u0001\u001a\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bá\u0001\u00109J\u0011\u0010â\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bâ\u0001\u0010\u0018J\u001a\u0010ä\u0001\u001a\u00020\u00112\u0007\u0010ã\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bä\u0001\u00109J\u0011\u0010å\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bå\u0001\u0010\u0018J-\u0010é\u0001\u001a\u00020\u00112\u0007\u0010æ\u0001\u001a\u00020q2\u0010\b\u0002\u0010è\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110ç\u0001H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0011\u0010ë\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\bë\u0001\u0010\u0018J\u001c\u0010í\u0001\u001a\u00020\u00112\t\b\u0002\u0010ì\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\bí\u0001\u00109J\u001c\u0010ï\u0001\u001a\u00020q2\b\u0010æ\u0001\u001a\u00030î\u0001H\u0002¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u0019\u0010ñ\u0001\u001a\u00020\u00112\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0005\bñ\u0001\u0010jJ\u001b\u0010ò\u0001\u001a\u00020\u00112\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\bò\u0001\u0010¤\u0001J&\u0010ô\u0001\u001a\u00020\u00112\t\u0010ó\u0001\u001a\u0004\u0018\u00010L2\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u001b\u0010ö\u0001\u001a\u00020\u00112\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\bö\u0001\u0010¤\u0001J\u0015\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J*\u0010û\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0ú\u00012\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J5\u0010ÿ\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0ú\u00012\t\u0010ý\u0001\u001a\u0004\u0018\u00010C2\u0007\u0010þ\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001b\u0010\u0081\u0002\u001a\u00020\n2\u0007\u0010æ\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001b\u0010\u0083\u0002\u001a\u00020\u000e2\u0007\u0010þ\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u001b\u0010\u0085\u0002\u001a\u00020\u00112\u0007\u0010\u009f\u0001\u001a\u00020CH\u0002¢\u0006\u0006\b\u0085\u0002\u0010¤\u0001R\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0086\u0002R\u001a\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0087\u0002R!\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0088\u0002R\u001c\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u0089\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001c\u0010\u008c\u0002\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001a\u0010\u008f\u0002\u001a\u00030\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0019\u0010\u0091\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R$\u0010\u0010\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0005\b\u0010\u0010\u0092\u0002\u001a\u0004\b\u0010\u0010{\"\u0005\b\u0093\u0002\u00109R,\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0094\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0017\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0092\u0002R\u0019\u0010\u009b\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u0092\u0002R\u0019\u0010\u009c\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u0092\u0002R\u001a\u0010\u009d\u0002\u001a\u00030É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0019\u0010\u009f\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u0092\u0002R\u001a\u0010¡\u0002\u001a\u00030 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u001c\u0010¤\u0002\u001a\u0005\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010¦\u0002R\"\u0010§\u0002\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b§\u0002\u0010¨\u0002\u0012\u0005\b©\u0002\u0010\u0018R'\u0010ª\u0002\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\bª\u0002\u0010\u0092\u0002\u001a\u0005\b«\u0002\u0010{\"\u0005\b¬\u0002\u00109R'\u0010\u00ad\u0002\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u00ad\u0002\u0010\u0092\u0002\u001a\u0005\b®\u0002\u0010{\"\u0005\b¯\u0002\u00109R'\u0010°\u0002\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b°\u0002\u0010\u0092\u0002\u001a\u0005\b±\u0002\u0010{\"\u0005\b²\u0002\u00109R'\u0010³\u0002\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b³\u0002\u0010\u0092\u0002\u001a\u0005\b´\u0002\u0010{\"\u0005\bµ\u0002\u00109R)\u0010·\u0002\u001a\u00020\n2\u0007\u0010¶\u0002\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\b·\u0002\u0010¸\u0002\"\u0005\b¹\u0002\u00101R\u0019\u0010º\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010¸\u0002R\u0019\u0010»\u0002\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0002\u0010¸\u0002R'\u0010¼\u0002\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b¼\u0002\u0010¸\u0002\u001a\u0005\b½\u0002\u0010T\"\u0005\b¾\u0002\u00101R\u0019\u0010¿\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010\u0092\u0002R'\u0010À\u0002\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\bÀ\u0002\u0010¸\u0002\u001a\u0005\bÁ\u0002\u0010T\"\u0005\bÂ\u0002\u00101R!\u0010Ä\u0002\u001a\n\u0012\u0005\u0012\u00030Ã\u00020\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010\u0088\u0002R\u0019\u0010Å\u0002\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010\u0086\u0002R\u0019\u0010Æ\u0002\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010\u0086\u0002R*\u0010È\u0002\u001a\u00030Ç\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÈ\u0002\u0010É\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R*\u0010Ï\u0002\u001a\u00030Î\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÏ\u0002\u0010Ð\u0002\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R*\u0010Ö\u0002\u001a\u00030Õ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÖ\u0002\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002\"\u0006\bÚ\u0002\u0010Û\u0002R*\u0010Ý\u0002\u001a\u00030Ü\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÝ\u0002\u0010Þ\u0002\u001a\u0006\bß\u0002\u0010à\u0002\"\u0006\bá\u0002\u0010â\u0002R*\u0010ä\u0002\u001a\u00030ã\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002\"\u0006\bè\u0002\u0010é\u0002R*\u0010ë\u0002\u001a\u00030ê\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bë\u0002\u0010ì\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R*\u0010ò\u0002\u001a\u00030ñ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0002\u0010ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002\"\u0006\bö\u0002\u0010÷\u0002R*\u0010ù\u0002\u001a\u00030ø\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bù\u0002\u0010ú\u0002\u001a\u0006\bû\u0002\u0010ü\u0002\"\u0006\bý\u0002\u0010þ\u0002R*\u0010\u0080\u0003\u001a\u00030ÿ\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0003\u0010\u0081\u0003\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003\"\u0006\b\u0084\u0003\u0010\u0085\u0003R*\u0010\u0087\u0003\u001a\u00030\u0086\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0003\u0010\u0088\u0003\u001a\u0006\b\u0089\u0003\u0010\u008a\u0003\"\u0006\b\u008b\u0003\u0010\u008c\u0003R*\u0010\u008e\u0003\u001a\u00030\u008d\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0003\u0010\u008f\u0003\u001a\u0006\b\u0090\u0003\u0010\u0091\u0003\"\u0006\b\u0092\u0003\u0010\u0093\u0003R*\u0010\u0095\u0003\u001a\u00030\u0094\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0003\u0010\u0096\u0003\u001a\u0006\b\u0097\u0003\u0010\u0098\u0003\"\u0006\b\u0099\u0003\u0010\u009a\u0003R*\u0010\u009c\u0003\u001a\u00030\u009b\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009c\u0003\u0010\u009d\u0003\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003\"\u0006\b \u0003\u0010¡\u0003R*\u0010£\u0003\u001a\u00030¢\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b£\u0003\u0010¤\u0003\u001a\u0006\b¥\u0003\u0010¦\u0003\"\u0006\b§\u0003\u0010¨\u0003R \u0010©\u0003\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b©\u0003\u0010ª\u0003\u0012\u0005\b«\u0003\u0010\u0018R*\u0010\u00ad\u0003\u001a\u00030¬\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u00ad\u0003\u0010®\u0003\u001a\u0006\b¯\u0003\u0010°\u0003\"\u0006\b±\u0003\u0010²\u0003R*\u0010´\u0003\u001a\u00030³\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0003\u0010µ\u0003\u001a\u0006\b¶\u0003\u0010·\u0003\"\u0006\b¸\u0003\u0010¹\u0003R*\u0010»\u0003\u001a\u00030º\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b»\u0003\u0010¼\u0003\u001a\u0006\b½\u0003\u0010¾\u0003\"\u0006\b¿\u0003\u0010À\u0003R*\u0010Â\u0003\u001a\u00030Á\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0003\u0010Ã\u0003\u001a\u0006\bÄ\u0003\u0010Å\u0003\"\u0006\bÆ\u0003\u0010Ç\u0003R*\u0010É\u0003\u001a\u00030È\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÉ\u0003\u0010Ê\u0003\u001a\u0006\bË\u0003\u0010Ì\u0003\"\u0006\bÍ\u0003\u0010Î\u0003R*\u0010Ð\u0003\u001a\u00030Ï\u00038\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÐ\u0003\u0010Ñ\u0003\u001a\u0006\bÒ\u0003\u0010Ó\u0003\"\u0006\bÔ\u0003\u0010Õ\u0003R\u0018\u0010×\u0003\u001a\u00030Ö\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0003\u0010Ø\u0003R!\u0010Þ\u0003\u001a\u00030Ù\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÚ\u0003\u0010Û\u0003\u001a\u0006\bÜ\u0003\u0010Ý\u0003R!\u0010ã\u0003\u001a\u00030ß\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0003\u0010Û\u0003\u001a\u0006\bá\u0003\u0010â\u0003R\u001b\u0010ä\u0003\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0003\u0010å\u0003R*\u0010ç\u0003\u001a\u00030æ\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0003\u0010è\u0003\u001a\u0006\bé\u0003\u0010ê\u0003\"\u0006\bë\u0003\u0010ì\u0003R\u0019\u0010í\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0003\u0010\u0092\u0002R\u001c\u0010ï\u0003\u001a\u0005\u0018\u00010î\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0003\u0010ð\u0003R*\u0010ò\u0003\u001a\u00030ñ\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0003\u0010ó\u0003\u001a\u0006\bô\u0003\u0010õ\u0003\"\u0006\bö\u0003\u0010÷\u0003R\u001f\u0010I\u001a\u00020H8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\bI\u0010ø\u0003\u001a\u0006\bù\u0003\u0010ú\u0003R\u0017\u0010û\u0003\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0006\bû\u0003\u0010¸\u0002R\u0018\u0010ý\u0003\u001a\u00030ü\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0003\u0010þ\u0003R!\u0010\u0083\u0004\u001a\u00030ÿ\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0004\u0010Û\u0003\u001a\u0006\b\u0081\u0004\u0010\u0082\u0004R!\u0010\u0088\u0004\u001a\u00030\u0084\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0004\u0010Û\u0003\u001a\u0006\b\u0086\u0004\u0010\u0087\u0004R!\u0010\u008d\u0004\u001a\u00030\u0089\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0004\u0010Û\u0003\u001a\u0006\b\u008b\u0004\u0010\u008c\u0004R!\u0010\u0092\u0004\u001a\u00030\u008e\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0004\u0010Û\u0003\u001a\u0006\b\u0090\u0004\u0010\u0091\u0004R!\u0010\u0097\u0004\u001a\u00030\u0093\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0004\u0010Û\u0003\u001a\u0006\b\u0095\u0004\u0010\u0096\u0004R!\u0010\u009c\u0004\u001a\u00030\u0098\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0004\u0010Û\u0003\u001a\u0006\b\u009a\u0004\u0010\u009b\u0004R!\u0010¡\u0004\u001a\u00030\u009d\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0004\u0010Û\u0003\u001a\u0006\b\u009f\u0004\u0010 \u0004R!\u0010¦\u0004\u001a\u00030¢\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0004\u0010Û\u0003\u001a\u0006\b¤\u0004\u0010¥\u0004R!\u0010«\u0004\u001a\u00030§\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0004\u0010Û\u0003\u001a\u0006\b©\u0004\u0010ª\u0004R?\u0010\u00ad\u0004\u001a\u0005\u0018\u00010¬\u00042\n\u0010¶\u0002\u001a\u0005\u0018\u00010¬\u00048\u0006@FX\u0087\u000e¢\u0006\u001f\n\u0006\b\u00ad\u0004\u0010®\u0004\u0012\u0005\b³\u0004\u0010\u0018\u001a\u0006\b¯\u0004\u0010°\u0004\"\u0006\b±\u0004\u0010²\u0004R\u0018\u0010µ\u0004\u001a\u00030´\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0004\u0010¶\u0004R\u001c\u0010·\u0004\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0004\u0010¸\u0004R2\u0010¹\u0004\u001a\u000b\u0012\u0004\u0012\u00020\u0011\u0018\u00010ç\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¹\u0004\u0010º\u0004\u001a\u0006\b»\u0004\u0010¼\u0004\"\u0006\b½\u0004\u0010¾\u0004R&\u0010Â\u0004\u001a\u0011\u0012\u0005\u0012\u00030À\u0004\u0012\u0005\u0012\u00030Á\u00040¿\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0004\u0010Ã\u0004R!\u0010È\u0004\u001a\u00030Ä\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0004\u0010Û\u0003\u001a\u0006\bÆ\u0004\u0010Ç\u0004R!\u0010Í\u0004\u001a\u00030É\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0004\u0010Û\u0003\u001a\u0006\bË\u0004\u0010Ì\u0004R!\u0010Ò\u0004\u001a\u00030Î\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0004\u0010Û\u0003\u001a\u0006\bÐ\u0004\u0010Ñ\u0004R!\u0010×\u0004\u001a\u00030Ó\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0004\u0010Û\u0003\u001a\u0006\bÕ\u0004\u0010Ö\u0004R!\u0010Ü\u0004\u001a\u00030Ø\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0004\u0010Û\u0003\u001a\u0006\bÚ\u0004\u0010Û\u0004R!\u0010á\u0004\u001a\u00030Ý\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÞ\u0004\u0010Û\u0003\u001a\u0006\bß\u0004\u0010à\u0004R!\u0010æ\u0004\u001a\u00030â\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0004\u0010Û\u0003\u001a\u0006\bä\u0004\u0010å\u0004R!\u0010ë\u0004\u001a\u00030ç\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bè\u0004\u0010Û\u0003\u001a\u0006\bé\u0004\u0010ê\u0004R!\u0010ð\u0004\u001a\u00030ì\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0004\u0010Û\u0003\u001a\u0006\bî\u0004\u0010ï\u0004R\u001c\u0010ñ\u0004\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0004\u0010ò\u0004R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010ó\u0004R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010ô\u0004R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010õ\u0004R!\u0010ú\u0004\u001a\u00030ö\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0004\u0010Û\u0003\u001a\u0006\bø\u0004\u0010ù\u0004R!\u0010ÿ\u0004\u001a\u00030û\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0004\u0010Û\u0003\u001a\u0006\bý\u0004\u0010þ\u0004R!\u0010\u0084\u0005\u001a\u00030\u0080\u00058BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0005\u0010Û\u0003\u001a\u0006\b\u0082\u0005\u0010\u0083\u0005R\u0018\u0010\u0086\u0005\u001a\u00030\u0085\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0005\u0010\u0087\u0005R\u0019\u0010\u0088\u0005\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0005\u0010\u0092\u0002R\u001a\u0010\u008a\u0005\u001a\u00030\u0089\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0005\u0010\u008b\u0005R\u0019\u0010\u008c\u0005\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0005\u0010\u0092\u0002R\u001f\u0010\u008d\u0005\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0005\u0010\u008e\u0005\u001a\u0006\b\u008f\u0005\u0010\u0090\u0005R'\u0010\u0091\u0005\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0091\u0005\u0010\u0092\u0002\u001a\u0005\b\u0092\u0005\u0010{\"\u0005\b\u0093\u0005\u00109R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0094\u0005R\u0019\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0095\u0005R'\u0010\u0096\u0005\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0096\u0005\u0010¸\u0002\u001a\u0005\b\u0097\u0005\u0010T\"\u0005\b\u0098\u0005\u00101R'\u0010\u0099\u0005\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0099\u0005\u0010¸\u0002\u001a\u0005\b\u009a\u0005\u0010T\"\u0005\b\u009b\u0005\u00101R\u0018\u0010\u009f\u0005\u001a\u00030\u009c\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0005\u0010\u009e\u0005R\u0016\u0010¡\u0005\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0005\u0010{R\u0018\u0010£\u0005\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0005\u0010yR\u0016\u0010¥\u0005\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0005\u0010{R\u001a\u0010©\u0005\u001a\u0005\u0018\u00010¦\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0005\u0010¨\u0005¨\u0006µ\u0005"}, d2 = {"Lcom/pinterest/featurelibrary/pingridcell/sba/view/SbaPinRep;", "Lcom/pinterest/ui/grid/LegoPinGridCell;", "Lti1/f;", "Lqa2/v1;", "Lsi1/c;", "Lsi1/d;", "Lsi1/b;", "", "Lcom/pinterest/activity/pin/TrafficSource;", "trafficSource", "", "backgroundColorResId", "Lqa2/d0;", "pinActionHandler", "", "isProductTag", "isHideSupported", "", "applyUnMigratedPFCFields", "(Ljava/lang/String;ILqa2/d0;ZZ)V", "Lgk1/k;", "forceDrawOver", "(Lgk1/k;)V", "onAttachedToWindow", "()V", "onInitialized", "onAttached", "onDetached", "onScrollStarted", "onDeactivated", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onViewRecycled", "pressed", "setPressed", "(Z)V", "Lni1/u0;", "displayState", "bindDisplayState", "(Lni1/u0;)V", "Lu50/r;", "Lni1/z1;", "eventIntake", "setEventIntake", "(Lu50/r;)V", "Lcom/pinterest/api/model/f30;", "p", "pinGridPosition", "setPin", "(Lcom/pinterest/api/model/f30;I)V", "Lnx/d0;", "pinalytics", "setPinalytics", "(Lnx/d0;)V", "Lh32/z1;", "getPinImpression", "()Lh32/z1;", "Lh32/e4;", "visibleEvent", "addVisibilityEvent", "(Lh32/e4;)V", "getPinDrawableHeight", "()I", "Lwa2/a;", "getPinDrawable", "()Lwa2/a;", "getCornerRadius", "Landroid/view/MotionEvent;", "event", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Rect;", "getOverflowIconRect", "()Landroid/graphics/Rect;", "getFavoriteButtonRect", "Lnx/c0;", "markImpressionStart", "()Lnx/c0;", "markImpressionEnd", "getPin", "()Lcom/pinterest/api/model/f30;", "Lcom/pinterest/navigation/Navigation;", "navigation", "setNavigation", "(Lcom/pinterest/navigation/Navigation;)V", "setPinActionHandler", "(Lqa2/d0;)V", "Landroid/view/ViewGroup;", "parent", "addToView", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "getAnchorWidth", "getAnchorHeight", "onPulsarShow", "onPulsarHide", "uid", "()Ljava/lang/String;", "resizable", "()Z", "delta", "getAllowedHeightChange", "(I)I", "isPWTImageDrawn", "getPWTImageX", "getPWTImageY", "getPWTImageHeight", "getPWTImageWidth", "coexistId", "Lhk1/n;", "getViewBasedConstructorArgs", "()Lhk1/n;", "setTrafficSource", "(Ljava/lang/String;)V", "isPinMediaHalfVisible", "shouldTraverseParentView", "Lcom/pinterest/ui/grid/PinterestRecyclerView;", "getGridViewSafe", "(Z)Lcom/pinterest/ui/grid/PinterestRecyclerView;", "Lni1/t0;", "hidePieces", "(Lni1/t0;)V", "isFromScroll", "onAttachedFirstPageInclusive", "onDetachedInclusive", "", "Lua2/f1;", "pinRepPieces", "computeNonCompliantFields", "(Ljava/util/List;)V", "applyPinLeveling", "Lqa2/m;", "pinSpec", "updatePinImageForPinLevelingConstraints", "(Lqa2/m;)V", "pin", "measureSbaPieces", "(Lcom/pinterest/api/model/f30;)I", "unTouchAll", "maybeSetupAdsOpenMeasurement", "(Lcom/pinterest/api/model/f30;)V", "Lxi1/c;", "sbaChinCTA", "()Lxi1/c;", "Lsj1/a;", "directToSiteIndicator", "()Lsj1/a;", "Lvj1/a;", "inlineSaveIndicator", "()Lvj1/a;", "Lwj1/d;", "shoppingIndicator", "()Lwj1/d;", "Lcj1/a;", "pharmaAdDisclosure", "()Lcj1/a;", "cacheDisplayStateElements", "Lbb2/i;", "fixedHeightImageSpec", "copyFixedHeightSpecIntoPinSpec", "(Lbb2/i;)V", "tryToAvoidRedraw", "(Lni1/u0;)Z", "Lni1/l0;", "pinRepAction", "handlePgcAction", "(Lni1/l0;)V", "Lek1/q;", "mediaAction", "handleMediaZoneAction", "(Lek1/q;)V", "Lgk1/g;", "overlayZoneAction", "handleOverlayZoneAction", "(Lgk1/g;)V", "invalidateParent", "()Lkotlin/Unit;", "Lbk1/n;", "clickThroughAction", "handleClickThroughAction", "(Lbk1/n;)V", "Lbk1/c;", "processDeepLinkAttempt", "(Lbk1/c;)V", "Lni1/b3;", "requestLayout", "handleRequestLayout", "(Lni1/b3;)V", "Lni1/q0;", "backgroundOverride", "overrideBackground", "(Lni1/q0;)V", "registerMediaVisibilityListeners", "addMediaViewabilityScrollListener", "cancelOverlayAnimation", "setupOverlayAnimationAndStart", "resetOverlayIfNecessary", "Landroidx/recyclerview/widget/o2;", "mediaVisibilityScrollListener", "attachOrEnqueMediaScrollListener", "(Landroidx/recyclerview/widget/o2;)V", "sendMediaVisibilityEventIfNecessary", "addMediaViewabilityLayoutChangeListener", "impressionIsStarting", "updateDevToolsForImpressionStart", "playLongPressAnimation", "view", "Lkotlin/Function0;", "endAction", "expandAndTiltView", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "handleContextualMenuHidden", "isContextMenuBeingHidden", "resetTapState", "Landroid/view/ViewParent;", "getParentView", "(Landroid/view/ViewParent;)Landroid/view/View;", "addNavigationExtras", "devDisplayPinImpressionStart", "imp", "devDisplayPinImpressionEnded", "(Lh32/z1;Lcom/pinterest/api/model/f30;)V", "devTagForUiTest", "Lh32/a4;", "getViewParameterType", "()Lh32/a4;", "Lkotlin/Pair;", "navigateToCloseupDirectly", "(Lcom/pinterest/api/model/f30;)Lkotlin/Pair;", "pinToOpen", "isDeeplinkAlreadyTried", "openPinCloseup", "(Lcom/pinterest/api/model/f30;Z)Lkotlin/Pair;", "fallbackGetColumnIndex", "(Landroid/view/View;)I", "navigateToCloseupComprehensive", "(Z)Z", "goToAppInstall", "Ljava/lang/String;", "Lqa2/m;", "Ljava/util/List;", "Landroid/view/View$OnLayoutChangeListener;", "pinMediaVisibilityLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "pinMediaVisibilityScrollListener", "Landroidx/recyclerview/widget/o2;", "Lek1/l;", "priorMediaVisibility", "Lek1/l;", "isRTL", "Z", "setHideSupported", "Lqa2/m1;", "pinVideoGridCellControlsListener", "Lqa2/m1;", "getPinVideoGridCellControlsListener", "()Lqa2/m1;", "setPinVideoGridCellControlsListener", "(Lqa2/m1;)V", "isHandlingMediaAction", "isHandlingPgcAction", "lastProcessedClickthroughAction", "Lbk1/n;", "hasSetParentViewForegroundDrawable", "Lu50/n;", "appliedCornerRadius", "Lu50/n;", "Landroid/graphics/drawable/Drawable;", "backgroundBeforeOverride", "Landroid/graphics/drawable/Drawable;", "Lqa2/d0;", "deprecatedPin", "Lcom/pinterest/api/model/f30;", "getDeprecatedPin$annotations", "bottomVisible", "getBottomVisible", "setBottomVisible", "topVisible", "getTopVisible", "setTopVisible", "hasPinChips", "getHasPinChips", "setHasPinChips", "hasChin", "getHasChin", "setHasChin", "value", "columnIndexForLogging", "I", "setColumnIndexForLogging", "measuredHeight", "measuredWidth", "percentageVisible", "getPercentageVisible", "setPercentageVisible", "showOverFlow", "pinPosition", "getPinPosition", "setPinPosition", "Ljj1/e;", "piecesRequiringImageDimensions", "lastKnownParentView", "parentHierarchy", "Lpb0/a;", "clock", "Lpb0/a;", "getClock", "()Lpb0/a;", "setClock", "(Lpb0/a;)V", "Lhf0/c;", "deviceInfoProvider", "Lhf0/c;", "getDeviceInfoProvider", "()Lhf0/c;", "setDeviceInfoProvider", "(Lhf0/c;)V", "Laa2/a;", "scrollToTopEventManager", "Laa2/a;", "getScrollToTopEventManager", "()Laa2/a;", "setScrollToTopEventManager", "(Laa2/a;)V", "Lm60/w;", "eventManager", "Lm60/w;", "getEventManager", "()Lm60/w;", "setEventManager", "(Lm60/w;)V", "Ley/g3;", "perfLogApplicationUtils", "Ley/g3;", "getPerfLogApplicationUtils", "()Ley/g3;", "setPerfLogApplicationUtils", "(Ley/g3;)V", "Llh0/r2;", "experiments", "Llh0/r2;", "getExperiments", "()Llh0/r2;", "setExperiments", "(Llh0/r2;)V", "Lip1/b;", "prefetchManager", "Lip1/b;", "getPrefetchManager", "()Lip1/b;", "setPrefetchManager", "(Lip1/b;)V", "La11/d;", "clickThroughHelperFactory", "La11/d;", "getClickThroughHelperFactory", "()La11/d;", "setClickThroughHelperFactory", "(La11/d;)V", "Ljq/c;", "pinTrafficSourceMapper", "Ljq/c;", "getPinTrafficSourceMapper", "()Ljq/c;", "setPinTrafficSourceMapper", "(Ljq/c;)V", "Ljo1/c;", "baseGridActionUtils", "Ljo1/c;", "getBaseGridActionUtils", "()Ljo1/c;", "setBaseGridActionUtils", "(Ljo1/c;)V", "Lqc2/a;", "viewabilityCalculator", "Lqc2/a;", "getViewabilityCalculator", "()Lqc2/a;", "setViewabilityCalculator", "(Lqc2/a;)V", "Lni1/d;", "deepLinkHelper", "Lni1/d;", "getDeepLinkHelper", "()Lni1/d;", "setDeepLinkHelper", "(Lni1/d;)V", "Lzs1/a;", "impressionDebugUtils", "Lzs1/a;", "getImpressionDebugUtils", "()Lzs1/a;", "setImpressionDebugUtils", "(Lzs1/a;)V", "Les/a;", "adFormats", "Les/a;", "getAdFormats", "()Les/a;", "setAdFormats", "(Les/a;)V", "currentDisplayState", "Lni1/u0;", "getCurrentDisplayState$annotations", "Lbs/b;", "adsHandshakeQuarantine", "Lbs/b;", "getAdsHandshakeQuarantine", "()Lbs/b;", "setAdsHandshakeQuarantine", "(Lbs/b;)V", "Lnx/b0;", "pinAuxHelper", "Lnx/b0;", "getPinAuxHelper", "()Lnx/b0;", "setPinAuxHelper", "(Lnx/b0;)V", "Les/h;", "adsCommonDisplay", "Les/h;", "getAdsCommonDisplay", "()Les/h;", "setAdsCommonDisplay", "(Les/h;)V", "Lvr/a;", "adsCommonAnalytics", "Lvr/a;", "getAdsCommonAnalytics", "()Lvr/a;", "setAdsCommonAnalytics", "(Lvr/a;)V", "Lhs1/q;", "imageCache", "Lhs1/q;", "getImageCache", "()Lhs1/q;", "setImageCache", "(Lhs1/q;)V", "Low/a;", "adsOpenMeasurementManager", "Low/a;", "getAdsOpenMeasurementManager", "()Low/a;", "setAdsOpenMeasurementManager", "(Low/a;)V", "Lti1/p;", "legacyGestureContract", "Lti1/p;", "Lti1/q;", "legacyGestureListener$delegate", "Lxk2/k;", "getLegacyGestureListener", "()Lti1/q;", "legacyGestureListener", "Ly92/c;", "gestureDetector$delegate", "getGestureDetector", "()Ly92/c;", "gestureDetector", "collectionSelectedPosition", "Ljava/lang/Integer;", "Lh32/g0;", "componentType", "Lh32/g0;", "getComponentType", "()Lh32/g0;", "setComponentType", "(Lh32/g0;)V", "hasEndFrame", "", "maxVideoAdPinMediaWidthHeightRatio", "Ljava/lang/Float;", "", "chromeClickthroughStartTimeNs", "J", "getChromeClickthroughStartTimeNs", "()J", "setChromeClickthroughStartTimeNs", "(J)V", "Lnx/d0;", "getPinalytics", "()Lnx/d0;", "gridCardPadding", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Lyi1/s;", "pinImagePiece$delegate", "getPinImagePiece", "()Lyi1/s;", "pinImagePiece", "Lkj1/f;", "attributionBadgeIndicator$delegate", "getAttributionBadgeIndicator", "()Lkj1/f;", "attributionBadgeIndicator", "Lpj1/a;", "indicator$delegate", "getIndicator", "()Lpj1/a;", "indicator", "Luj1/a;", "fullscreenIndicator$delegate", "getFullscreenIndicator", "()Luj1/a;", "fullscreenIndicator", "Lqj1/a;", "audioIndicator$delegate", "getAudioIndicator", "()Lqj1/a;", "audioIndicator", "Lnj1/b;", "deletedIdeaPinPlaceholder$delegate", "getDeletedIdeaPinPlaceholder", "()Lnj1/b;", "deletedIdeaPinPlaceholder", "Ljj1/c;", "creatorStatsPiece$delegate", "getCreatorStatsPiece", "()Ljj1/c;", "creatorStatsPiece", "Lfj1/b;", "pinTextWithIcon$delegate", "getPinTextWithIcon", "()Lfj1/b;", "pinTextWithIcon", "Lgj1/a;", "promoText$delegate", "getPromoText", "()Lgj1/a;", "promoText", "Lrl1/c;", "userAttributionUserColorIndexForTesting", "Lrl1/c;", "getUserAttributionUserColorIndexForTesting", "()Lrl1/c;", "setUserAttributionUserColorIndexForTesting", "(Lrl1/c;)V", "getUserAttributionUserColorIndexForTesting$annotations", "Lij1/i;", "sbaUserAttribution", "Lij1/i;", "chinCTA", "Lxi1/c;", "onPinRepPiecesMeasured", "Lkotlin/jvm/functions/Function0;", "getOnPinRepPiecesMeasured", "()Lkotlin/jvm/functions/Function0;", "setOnPinRepPiecesMeasured", "(Lkotlin/jvm/functions/Function0;)V", "", "Lej1/d;", "Lej1/a;", "textPieces", "Ljava/util/Map;", "Lhj1/a;", "pinReactions$delegate", "getPinReactions", "()Lhj1/a;", "pinReactions", "Ldj1/b;", "sbaPinRating$delegate", "getSbaPinRating", "()Ldj1/b;", "sbaPinRating", "Lxj1/a;", "videoStatusOverlay$delegate", "getVideoStatusOverlay", "()Lxj1/a;", "videoStatusOverlay", "Lsa2/c;", "skinToneSignalOverlay$delegate", "getSkinToneSignalOverlay", "()Lsa2/c;", "skinToneSignalOverlay", "Loj1/b;", "endFrame$delegate", "getEndFrame", "()Loj1/b;", "endFrame", "Lyj1/a;", "favoriteButton$delegate", "getFavoriteButton", "()Lyj1/a;", "favoriteButton", "Lbj1/a;", "boardPinAttribution$delegate", "getBoardPinAttribution", "()Lbj1/a;", "boardPinAttribution", "Lzi1/b;", "pinChips$delegate", "getPinChips", "()Lzi1/b;", "pinChips", "Lzj1/a;", "overflow$delegate", "getOverflow", "()Lzj1/a;", "overflow", "animatedCtaOverlayIndicator", "Lsj1/a;", "Lvj1/a;", "Lwj1/d;", "Lcj1/a;", "Lrj1/a;", "dealBadgeCornerIndicator$delegate", "getDealBadgeCornerIndicator", "()Lrj1/a;", "dealBadgeCornerIndicator", "Ltj1/a;", "dynamicBadgeIndicator$delegate", "getDynamicBadgeIndicator", "()Ltj1/a;", "dynamicBadgeIndicator", "Llj1/a;", "dlAdCloseupOverlay$delegate", "getDlAdCloseupOverlay", "()Llj1/a;", "dlAdCloseupOverlay", "La11/e;", "clickThroughHelper", "La11/e;", "attachedFlag", "Laz/b;", "impressionDisplayState", "Laz/b;", "ignoreNextRequestLayoutOneShot", "internalCell", "Lcom/pinterest/featurelibrary/pingridcell/sba/view/SbaPinRep;", "getInternalCell", "()Lcom/pinterest/featurelibrary/pingridcell/sba/view/SbaPinRep;", "shouldTrackPWT", "getShouldTrackPWT", "setShouldTrackPWT", "Lu50/r;", "Lcom/pinterest/navigation/Navigation;", "chipsHeight", "getChipsHeight", "setChipsHeight", "chinHeight", "getChinHeight", "setChinHeight", "Lyi1/q;", "getImageEdges", "()Lyi1/q;", "imageEdges", "getImageLoaded", "imageLoaded", "getPinUid", "pinUid", "getHasParentView", "hasParentView", "Lnl1/d;", "getCoreFragment", "()Lnl1/d;", "coreFragment", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ti1/t", "pinGridCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SbaPinRep extends b implements f, v1, c, d, si1.b {

    @NotNull
    public static final String AUXDATA_IS_LEAD_AD = "is_lead_ad";

    @NotNull
    public static final String AUXDATA_IS_LEAD_AD_TRUE = "1";

    @NotNull
    public static final String AUXDATA_LEADAD_FORM_ID = "lead_form_id";

    @NotNull
    public static final String AUX_DATA_BADGE_LABEL_ENUM = "badge_label_enum";

    @NotNull
    public static final String AUX_DATA_IS_MDL_AD = "is_mdl_ad";

    @NotNull
    public static final String AUX_DATA_VIDEO_ID = "video_id";

    @NotNull
    public static final String CLOSEUP_NAVIGATION_TYPE_CLICK = "click";

    @NotNull
    public static final t Companion = new t();
    public static final int DEFAULT_COL_INDEX = -1;
    public static final int LONG_PRESS_TIMEOUT = 200;
    private static final int PIN_MEDIA_HALF_VISIBLE_PERCENT = 50;
    private static boolean hasMissingEventIntakeErrorBeenLogged;
    public a adFormats;
    public vr.a adsCommonAnalytics;
    public h adsCommonDisplay;
    public bs.b adsHandshakeQuarantine;
    public ow.a adsOpenMeasurementManager;
    private sj1.a animatedCtaOverlayIndicator;

    @NotNull
    private n appliedCornerRadius;
    private boolean attachedFlag;

    /* renamed from: attributionBadgeIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k attributionBadgeIndicator;

    /* renamed from: audioIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k audioIndicator;
    private Drawable backgroundBeforeOverride;

    @NotNull
    private final Paint backgroundPaint;
    public jo1.c baseGridActionUtils;

    /* renamed from: boardPinAttribution$delegate, reason: from kotlin metadata */
    @NotNull
    private final k boardPinAttribution;
    private boolean bottomVisible;
    private xi1.c chinCTA;
    private int chinHeight;
    private int chipsHeight;
    private long chromeClickthroughStartTimeNs;

    @NotNull
    private final e clickThroughHelper;
    public a11.d clickThroughHelperFactory;
    public pb0.a clock;
    private Integer collectionSelectedPosition;
    private int columnIndexForLogging;

    @NotNull
    private g0 componentType;

    /* renamed from: creatorStatsPiece$delegate, reason: from kotlin metadata */
    @NotNull
    private final k creatorStatsPiece;

    @NotNull
    private u0 currentDisplayState;

    /* renamed from: dealBadgeCornerIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k dealBadgeCornerIndicator;
    public ni1.d deepLinkHelper;

    /* renamed from: deletedIdeaPinPlaceholder$delegate, reason: from kotlin metadata */
    @NotNull
    private final k deletedIdeaPinPlaceholder;
    private f30 deprecatedPin;
    public hf0.c deviceInfoProvider;

    /* renamed from: dlAdCloseupOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final k dlAdCloseupOverlay;

    /* renamed from: dynamicBadgeIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k dynamicBadgeIndicator;

    /* renamed from: endFrame$delegate, reason: from kotlin metadata */
    @NotNull
    private final k endFrame;

    @NotNull
    private r eventIntake;
    public w eventManager;
    public r2 experiments;

    /* renamed from: favoriteButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final k favoriteButton;

    /* renamed from: fullscreenIndicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k fullscreenIndicator;

    /* renamed from: gestureDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final k gestureDetector;
    private final int gridCardPadding;
    private boolean hasChin;
    private boolean hasEndFrame;
    private boolean hasPinChips;
    private boolean hasSetParentViewForegroundDrawable;
    private boolean ignoreNextRequestLayoutOneShot;
    public q imageCache;
    public zs1.a impressionDebugUtils;

    @NotNull
    private az.b impressionDisplayState;

    /* renamed from: indicator$delegate, reason: from kotlin metadata */
    @NotNull
    private final k indicator;
    private vj1.a inlineSaveIndicator;

    @NotNull
    private final SbaPinRep internalCell;
    private boolean isHandlingMediaAction;
    private boolean isHandlingPgcAction;
    private boolean isHideSupported;
    private boolean isProductTag;
    private boolean isRTL;

    @NotNull
    private String lastKnownParentView;

    @NotNull
    private bk1.n lastProcessedClickthroughAction;

    @NotNull
    private final p legacyGestureContract;

    /* renamed from: legacyGestureListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final k legacyGestureListener;
    private Float maxVideoAdPinMediaWidthHeightRatio;
    private int measuredHeight;
    private int measuredWidth;
    private Navigation navigation;
    private Function0<Unit> onPinRepPiecesMeasured;

    /* renamed from: overflow$delegate, reason: from kotlin metadata */
    @NotNull
    private final k overflow;

    @NotNull
    private String parentHierarchy;
    private int percentageVisible;
    public g3 perfLogApplicationUtils;
    private cj1.a pharmaAdDisclosure;

    @NotNull
    private List<? extends jj1.e> piecesRequiringImageDimensions;
    private d0 pinActionHandler;
    public b0 pinAuxHelper;

    /* renamed from: pinChips$delegate, reason: from kotlin metadata */
    @NotNull
    private final k pinChips;

    /* renamed from: pinImagePiece$delegate, reason: from kotlin metadata */
    @NotNull
    private final k pinImagePiece;
    private View.OnLayoutChangeListener pinMediaVisibilityLayoutChangeListener;
    private o2 pinMediaVisibilityScrollListener;
    private int pinPosition;

    /* renamed from: pinReactions$delegate, reason: from kotlin metadata */
    @NotNull
    private final k pinReactions;

    @NotNull
    private List<? extends f1> pinRepPieces;

    @NotNull
    private m pinSpec;

    /* renamed from: pinTextWithIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final k pinTextWithIcon;
    public jq.c pinTrafficSourceMapper;
    private m1 pinVideoGridCellControlsListener;

    @NotNull
    private nx.d0 pinalytics;
    public ip1.b prefetchManager;

    @NotNull
    private l priorMediaVisibility;

    /* renamed from: promoText$delegate, reason: from kotlin metadata */
    @NotNull
    private final k promoText;

    /* renamed from: sbaPinRating$delegate, reason: from kotlin metadata */
    @NotNull
    private final k sbaPinRating;

    @NotNull
    private final i sbaUserAttribution;
    public aa2.a scrollToTopEventManager;
    private wj1.d shoppingIndicator;
    private boolean shouldTrackPWT;
    private boolean showOverFlow;

    /* renamed from: skinToneSignalOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final k skinToneSignalOverlay;

    @NotNull
    private final Map<ej1.d, ej1.a> textPieces;
    private boolean topVisible;

    @NotNull
    private String trafficSource;
    private rl1.c userAttributionUserColorIndexForTesting;

    /* renamed from: videoStatusOverlay$delegate, reason: from kotlin metadata */
    @NotNull
    private final k videoStatusOverlay;
    public qc2.a viewabilityCalculator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaPinRep(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.trafficSource = "unknown";
        this.pinSpec = new m(0, 0, 0, 0, (c1) null, 63);
        this.pinRepPieces = new ArrayList();
        this.priorMediaVisibility = l.LessThan50PercentVisible;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.isRTL = j1.Y0(context2);
        this.isHideSupported = true;
        this.lastProcessedClickthroughAction = bk1.k.f23247a;
        this.appliedCornerRadius = new u50.b0(eo1.c.lego_corner_radius_medium);
        this.columnIndexForLogging = -1;
        this.pinPosition = -1;
        this.piecesRequiringImageDimensions = q0.f80391a;
        this.lastKnownParentView = "";
        this.parentHierarchy = "";
        this.currentDisplayState = new u0(null, 0, null, 2097151);
        this.legacyGestureContract = new y(this);
        this.legacyGestureListener = xk2.m.b(new v(this, 14));
        this.gestureDetector = xk2.m.b(new v(this, 11));
        this.componentType = g0.FLOWED_PIN;
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.pinalytics = a13;
        int i13 = e0.f90644c;
        this.gridCardPadding = i13;
        Paint paint = new Paint();
        Context context3 = getContext();
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context3.getColor(i14));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        setClickable(true);
        xk2.n nVar = xk2.n.NONE;
        this.pinImagePiece = s1.i(this, 17, nVar);
        this.attributionBadgeIndicator = s1.i(this, 0, nVar);
        this.indicator = s1.i(this, 13, nVar);
        this.fullscreenIndicator = s1.i(this, 10, nVar);
        this.audioIndicator = s1.i(this, 1, nVar);
        this.deletedIdeaPinPlaceholder = s1.i(this, 5, nVar);
        this.creatorStatsPiece = s1.i(this, 3, nVar);
        this.pinTextWithIcon = s1.i(this, 19, nVar);
        this.promoText = s1.i(this, 20, nVar);
        this.sbaUserAttribution = new i(this, getResources().getDimensionPixelSize(i13));
        this.textPieces = new LinkedHashMap();
        this.pinReactions = s1.i(this, 18, nVar);
        this.sbaPinRating = s1.i(this, 21, nVar);
        this.videoStatusOverlay = s1.i(this, 23, nVar);
        this.skinToneSignalOverlay = s1.i(this, 22, nVar);
        this.endFrame = s1.i(this, 8, nVar);
        this.favoriteButton = s1.i(this, 9, nVar);
        this.boardPinAttribution = s1.i(this, 2, nVar);
        this.pinChips = s1.i(this, 16, nVar);
        this.overflow = s1.i(this, 15, nVar);
        this.dealBadgeCornerIndicator = s1.i(this, 4, nVar);
        this.dynamicBadgeIndicator = s1.i(this, 7, nVar);
        this.dlAdCloseupOverlay = s1.i(this, 6, nVar);
        this.clickThroughHelper = getClickThroughHelperFactory().a(getPinalytics());
        this.impressionDisplayState = new az.b();
        this.internalCell = this;
        this.shouldTrackPWT = true;
        this.eventIntake = new q2(this, 1);
    }

    private final void addMediaViewabilityLayoutChangeListener() {
        androidx.media3.ui.h hVar = new androidx.media3.ui.h(this, 5);
        addOnLayoutChangeListener(hVar);
        this.pinMediaVisibilityLayoutChangeListener = hVar;
    }

    public static final void addMediaViewabilityLayoutChangeListener$lambda$74(SbaPinRep this$0, View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sendMediaVisibilityEventIfNecessary(this$0.isPinMediaHalfVisible());
    }

    private final void addMediaViewabilityScrollListener() {
        cc1.c cVar = new cc1.c(this, 5);
        attachOrEnqueMediaScrollListener(cVar);
        this.pinMediaVisibilityScrollListener = cVar;
    }

    private final void addNavigationExtras(Navigation navigation) {
        ph.a.h(navigation, this.trafficSource, getG(), getViewParameterType());
    }

    private final void applyPinLeveling() {
        if (getLayoutParams() instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams");
            this.pinSpec = w1.a(this.pinSpec, (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams, this.measuredWidth);
            return;
        }
        if (getParent() instanceof s0) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            Object layoutParams2 = view != null ? view.getLayoutParams() : null;
            this.pinSpec = w1.a(this.pinSpec, layoutParams2 instanceof PinterestStaggeredGridLayoutManager.LayoutParams ? (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams2 : null, this.measuredWidth);
            return;
        }
        if ((getParent() instanceof g) && getExperiments().Y()) {
            Object parent2 = getParent();
            View view2 = parent2 instanceof View ? (View) parent2 : null;
            Object layoutParams3 = view2 != null ? view2.getLayoutParams() : null;
            this.pinSpec = w1.a(this.pinSpec, layoutParams3 instanceof PinterestStaggeredGridLayoutManager.LayoutParams ? (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams3 : null, this.measuredWidth);
        }
    }

    private final void attachOrEnqueMediaScrollListener(o2 mediaVisibilityScrollListener) {
        PinterestRecyclerView gridViewSafe$default = getGridViewSafe$default(this, false, 1, null);
        if (gridViewSafe$default != null) {
            gridViewSafe$default.b(mediaVisibilityScrollListener);
        } else {
            addOnLayoutChangeListener(new n5.h(9, this, mediaVisibilityScrollListener));
        }
    }

    public static final boolean bindDisplayState$lambda$64$lambda$51(SbaPinRep this$0, View view, r5.h hVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        this$0.eventIntake.a(new y1(new hk1.l(this$0.getViewBasedConstructorArgs())));
        return true;
    }

    private final void cacheDisplayStateElements(u0 displayState) {
        this.componentType = displayState.f90815i;
        copyFixedHeightSpecIntoPinSpec(displayState.f90810d);
        this.showOverFlow = displayState.f90811e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setContentDescription(displayState.f90813g.a(context));
        this.appliedCornerRadius = displayState.f90814h;
        ek1.r rVar = displayState.f90820n;
        List list = rVar.f59328a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zi1.c) {
                arrayList.add(obj);
            }
        }
        setHasPinChips(!arrayList.isEmpty());
        List list2 = rVar.f59328a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof xi1.a) {
                arrayList2.add(obj2);
            }
        }
        setHasChin(!arrayList2.isEmpty());
        this.pinSpec = rVar.f59332e;
        this.impressionDisplayState = rVar.f59329b;
    }

    public final void cancelOverlayAnimation() {
        xi1.c cVar = this.chinCTA;
        if (cVar != null && cVar.f135042n && !cVar.f135041m) {
            AnimatorSet animatorSet = cVar.f135043o;
            if (!animatorSet.isRunning()) {
                c3.m0(animatorSet);
                cVar.f135041m = false;
            }
        }
        sj1.a aVar = this.animatedCtaOverlayIndicator;
        if (aVar != null) {
            aVar.H();
        }
        wj1.d dVar = this.shoppingIndicator;
        if (dVar != null) {
            dVar.G();
        }
    }

    private final void computeNonCompliantFields(List<? extends f1> pinRepPieces) {
        List<? extends f1> list = pinRepPieces;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zi1.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((zi1.b) it.next()).w();
        }
        setChipsHeight(i13);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof xi1.c) {
                arrayList2.add(obj2);
            }
        }
        xi1.c cVar = (xi1.c) CollectionsKt.firstOrNull(arrayList2);
        setChinHeight(cVar != null ? cVar.w() : 0);
    }

    private final void copyFixedHeightSpecIntoPinSpec(bb2.i fixedHeightImageSpec) {
        if (fixedHeightImageSpec != null) {
            m mVar = this.pinSpec;
            float b13 = fixedHeightImageSpec.b();
            n c13 = fixedHeightImageSpec.c();
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            this.pinSpec = mVar.a(b13, c13.a(r2).intValue());
        }
    }

    private final void devDisplayPinImpressionEnded(z1 imp, f30 pin) {
        getImpressionDebugUtils().getClass();
    }

    private final void devDisplayPinImpressionStart(f30 pin) {
        getImpressionDebugUtils().getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
    }

    private final void devTagForUiTest(f30 pin) {
        if (j.b()) {
            setTag(pin.getUid());
        }
    }

    private final sj1.a directToSiteIndicator() {
        if (this.animatedCtaOverlayIndicator == null) {
            this.animatedCtaOverlayIndicator = new sj1.a(this, getViewabilityCalculator(), this);
        }
        sj1.a aVar = this.animatedCtaOverlayIndicator;
        Intrinsics.f(aVar);
        return aVar;
    }

    private final void expandAndTiltView(View view, Function0<Unit> endAction) {
        if (getHasParentView()) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            view = getParentView(parent);
        }
        view.setElevation(1.0f);
        view.animate().rotation(-3.0f).scaleX(1.1f).scaleY(1.1f).setDuration(300L).withEndAction(new p4.a(7, endAction)).start();
        View rootView = view.getRootView();
        Intrinsics.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        viewGroup.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void expandAndTiltView$default(SbaPinRep sbaPinRep, View view, Function0 function0, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function0 = x.f117758i;
        }
        sbaPinRep.expandAndTiltView(view, function0);
    }

    public static final void expandAndTiltView$lambda$78$lambda$76(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final int fallbackGetColumnIndex(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i13 = (rect.right + rect.left) / 2;
        float f13 = hf0.b.f69002b;
        int i14 = hf0.b.f69004d;
        int i15 = (int) (f13 / i14);
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 < i15) {
                return i16;
            }
            i15 += i15;
        }
        return -1;
    }

    private final kj1.f getAttributionBadgeIndicator() {
        return (kj1.f) this.attributionBadgeIndicator.getValue();
    }

    private final qj1.a getAudioIndicator() {
        return (qj1.a) this.audioIndicator.getValue();
    }

    private final bj1.a getBoardPinAttribution() {
        return (bj1.a) this.boardPinAttribution.getValue();
    }

    private final nl1.d getCoreFragment() {
        Activity m03 = bs1.c.m0(this);
        if (!(m03 instanceof cp1.p)) {
            return null;
        }
        nl1.d f52740f = ((cp1.p) m03).getF52740f();
        m0.J0(f52740f);
        return f52740f;
    }

    private final jj1.c getCreatorStatsPiece() {
        return (jj1.c) this.creatorStatsPiece.getValue();
    }

    @xk2.d
    private static /* synthetic */ void getCurrentDisplayState$annotations() {
    }

    private final rj1.a getDealBadgeCornerIndicator() {
        return (rj1.a) this.dealBadgeCornerIndicator.getValue();
    }

    private final nj1.b getDeletedIdeaPinPlaceholder() {
        return (nj1.b) this.deletedIdeaPinPlaceholder.getValue();
    }

    @xk2.d
    private static /* synthetic */ void getDeprecatedPin$annotations() {
    }

    private final lj1.a getDlAdCloseupOverlay() {
        return (lj1.a) this.dlAdCloseupOverlay.getValue();
    }

    private final tj1.a getDynamicBadgeIndicator() {
        return (tj1.a) this.dynamicBadgeIndicator.getValue();
    }

    private final oj1.b getEndFrame() {
        return (oj1.b) this.endFrame.getValue();
    }

    private final yj1.a getFavoriteButton() {
        return (yj1.a) this.favoriteButton.getValue();
    }

    private final uj1.a getFullscreenIndicator() {
        return (uj1.a) this.fullscreenIndicator.getValue();
    }

    private final y92.c getGestureDetector() {
        return (y92.c) this.gestureDetector.getValue();
    }

    private final PinterestRecyclerView getGridViewSafe(boolean shouldTraverseParentView) {
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        this.parentHierarchy = "";
        this.lastKnownParentView = "";
        while (!(parent instanceof PinterestRecyclerView)) {
            if (shouldTraverseParentView) {
                this.parentHierarchy = a.a.D(this.parentHierarchy, parent.getClass().getSimpleName(), "-");
                String simpleName = parent.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                this.lastKnownParentView = simpleName;
            }
            if (parent.getParent() == null) {
                return null;
            }
            parent = parent.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        }
        if (shouldTraverseParentView) {
            this.parentHierarchy = a.a.D(this.parentHierarchy, parent.getClass().getSimpleName(), "-");
            String simpleName2 = parent.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            this.lastKnownParentView = simpleName2;
        }
        return (PinterestRecyclerView) parent;
    }

    public static /* synthetic */ PinterestRecyclerView getGridViewSafe$default(SbaPinRep sbaPinRep, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return sbaPinRep.getGridViewSafe(z13);
    }

    private final boolean getHasParentView() {
        return (getParent() == null || (getParent() instanceof RecyclerView)) ? false : true;
    }

    private final pj1.a getIndicator() {
        return (pj1.a) this.indicator.getValue();
    }

    public final ti1.q getLegacyGestureListener() {
        return (ti1.q) this.legacyGestureListener.getValue();
    }

    private final zj1.a getOverflow() {
        return (zj1.a) this.overflow.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getParentView(ViewParent view) {
        if (view.getParent() != null && !(view.getParent() instanceof RecyclerView)) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            return getParentView(parent);
        }
        return (View) view;
    }

    private final zi1.b getPinChips() {
        return (zi1.b) this.pinChips.getValue();
    }

    public final s getPinImagePiece() {
        return (s) this.pinImagePiece.getValue();
    }

    private final hj1.a getPinReactions() {
        return (hj1.a) this.pinReactions.getValue();
    }

    private final fj1.b getPinTextWithIcon() {
        return (fj1.b) this.pinTextWithIcon.getValue();
    }

    private final nx.d0 getPinalytics() {
        return this.pinalytics;
    }

    private final gj1.a getPromoText() {
        return (gj1.a) this.promoText.getValue();
    }

    private final dj1.b getSbaPinRating() {
        return (dj1.b) this.sbaPinRating.getValue();
    }

    private final sa2.c getSkinToneSignalOverlay() {
        return (sa2.c) this.skinToneSignalOverlay.getValue();
    }

    public static /* synthetic */ void getUserAttributionUserColorIndexForTesting$annotations() {
    }

    private final xj1.a getVideoStatusOverlay() {
        return (xj1.a) this.videoStatusOverlay.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hk1.n getViewBasedConstructorArgs() {
        nl1.d coreFragment = getCoreFragment();
        ta2.a aVar = coreFragment instanceof ta2.a ? (ta2.a) coreFragment : null;
        getBaseGridActionUtils().getClass();
        return new hk1.n(jo1.c.a(coreFragment), coreFragment != 0 ? coreFragment.H7() : false, aVar != null ? aVar.D() : null, aVar != null ? aVar.t6() : null);
    }

    private final a4 getViewParameterType() {
        nl1.d coreFragment = getCoreFragment();
        if (coreFragment != null) {
            return coreFragment.getF47730r2();
        }
        return null;
    }

    private final void goToAppInstall(f30 pin) {
        ni1.d deepLinkHelper = getDeepLinkHelper();
        deepLinkHelper.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        gp1.a.a(pin, deepLinkHelper.f90630c, true, deepLinkHelper.f90631d, deepLinkHelper.f90633f, deepLinkHelper.f90634g);
    }

    private final void handleClickThroughAction(final bk1.n clickThroughAction) {
        if (Intrinsics.d(this.lastProcessedClickthroughAction, clickThroughAction)) {
            return;
        }
        this.lastProcessedClickthroughAction = clickThroughAction;
        final int i13 = 1;
        if (clickThroughAction instanceof bk1.i) {
            this.eventIntake.a(new u1(new bk1.q(navigateToCloseupComprehensive(true), ((bk1.i) clickThroughAction).a())));
            return;
        }
        if (clickThroughAction instanceof bk1.c) {
            processDeepLinkAttempt((bk1.c) clickThroughAction);
            return;
        }
        if (clickThroughAction instanceof bk1.l) {
            final int i14 = 0;
            postDelayed(new Runnable(this) { // from class: ti1.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbaPinRep f117750b;

                {
                    this.f117750b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i14;
                    bk1.n nVar = clickThroughAction;
                    SbaPinRep sbaPinRep = this.f117750b;
                    switch (i15) {
                        case 0:
                            SbaPinRep.handleClickThroughAction$lambda$70(sbaPinRep, nVar);
                            break;
                        default:
                            SbaPinRep.handleClickThroughAction$lambda$71(sbaPinRep, nVar);
                            break;
                    }
                }
            }, zn2.b.e(((bk1.l) clickThroughAction).b()));
            return;
        }
        boolean z13 = clickThroughAction instanceof bk1.g;
        bk1.p pVar = bk1.p.f23276a;
        if (z13) {
            this.eventIntake.a(new u1(pVar));
            goToAppInstall(((bk1.g) clickThroughAction).a());
            return;
        }
        if (clickThroughAction instanceof bk1.j) {
            bk1.j jVar = (bk1.j) clickThroughAction;
            this.collectionSelectedPosition = jVar.a();
            Pair<Boolean, Boolean> navigateToCloseupDirectly = navigateToCloseupDirectly(jVar.b());
            this.eventIntake.a(new u1(new bk1.q(((Boolean) navigateToCloseupDirectly.f80346a).booleanValue(), jVar.c(), jVar.d(), Intrinsics.d((Boolean) navigateToCloseupDirectly.f80347b, Boolean.TRUE))));
            return;
        }
        if (clickThroughAction instanceof bk1.h) {
            this.eventIntake.a(new u1(pVar));
            getDeepLinkHelper().c(((bk1.h) clickThroughAction).a());
            return;
        }
        if (clickThroughAction instanceof bk1.m) {
            this.eventIntake.a(new u1(pVar));
            bk1.m mVar = (bk1.m) clickThroughAction;
            getDeepLinkHelper().d(mVar.d(), getAdsCommonDisplay(), getAdFormats(), mVar.e(), mVar.f(), mVar.b(), mVar.a(), mVar.c());
        } else if (clickThroughAction instanceof bk1.f) {
            navigateToCloseupComprehensive(true);
            postDelayed(new Runnable(this) { // from class: ti1.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SbaPinRep f117750b;

                {
                    this.f117750b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i13;
                    bk1.n nVar = clickThroughAction;
                    SbaPinRep sbaPinRep = this.f117750b;
                    switch (i15) {
                        case 0:
                            SbaPinRep.handleClickThroughAction$lambda$70(sbaPinRep, nVar);
                            break;
                        default:
                            SbaPinRep.handleClickThroughAction$lambda$71(sbaPinRep, nVar);
                            break;
                    }
                }
            }, zn2.b.e(((bk1.f) clickThroughAction).b()));
        } else {
            if (!(clickThroughAction instanceof bk1.e)) {
                Intrinsics.d(clickThroughAction, bk1.k.f23247a);
                return;
            }
            bk1.e eVar = (bk1.e) clickThroughAction;
            postDelayed(new sq0.a(this, 2), zn2.b.e(eVar.b()));
            boolean a13 = getDeepLinkHelper().a(eVar.a().c(), eVar.a().c().getUid(), eVar.a().b(), eVar.a().a(), null, eVar.a().d(), eVar.a().e(), getAdFormats());
            r rVar = this.eventIntake;
            eVar.a().getClass();
            rVar.a(new u1(new bk1.r(a13, true, null, 12)));
        }
    }

    public static final void handleClickThroughAction$lambda$70(SbaPinRep this$0, bk1.n clickThroughAction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(clickThroughAction, "$clickThroughAction");
        this$0.processDeepLinkAttempt(((bk1.l) clickThroughAction).a());
    }

    public static final void handleClickThroughAction$lambda$71(SbaPinRep this$0, bk1.n clickThroughAction) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(clickThroughAction, "$clickThroughAction");
        bk1.f fVar = (bk1.f) clickThroughAction;
        boolean a13 = this$0.getDeepLinkHelper().a(fVar.a().c(), fVar.a().c().getUid(), fVar.a().b(), fVar.a().a(), null, fVar.a().d(), fVar.a().e(), this$0.getAdFormats());
        r rVar = this$0.eventIntake;
        fVar.a().getClass();
        rVar.a(new u1(new bk1.r(a13, true, null, 12)));
    }

    public static final void handleClickThroughAction$lambda$72(SbaPinRep this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.eventIntake.a(new x1(new gk1.q(true, true)));
    }

    public final void handleContextualMenuHidden() {
        resetTapState(true);
    }

    private final void handleMediaZoneAction(ek1.q mediaAction) {
        ek1.n nVar = ek1.n.f59285a;
        if (Intrinsics.d(mediaAction, nVar) || !this.isHandlingMediaAction) {
            this.isHandlingMediaAction = !Intrinsics.d(mediaAction, nVar);
            boolean z13 = mediaAction instanceof ek1.p;
            ek1.s sVar = ek1.s.f59365a;
            if (z13) {
                updateDevToolsForImpressionStart(((ek1.p) mediaAction).f59311a);
                this.eventIntake.a(new ni1.v1(sVar));
                return;
            }
            if (!(mediaAction instanceof ek1.m)) {
                if (!Intrinsics.d(mediaAction, o.f59293a)) {
                    Intrinsics.d(mediaAction, nVar);
                    return;
                } else {
                    registerMediaVisibilityListeners();
                    this.eventIntake.a(new ni1.v1(sVar));
                    return;
                }
            }
            z1 z1Var = ((ek1.m) mediaAction).f59274a;
            f30 f30Var = this.deprecatedPin;
            if (z1Var == null || f30Var == null) {
                this.eventIntake.a(new ni1.v1(sVar));
            } else {
                devDisplayPinImpressionEnded(z1Var, f30Var);
                this.eventIntake.a(new ni1.v1(sVar));
            }
        }
    }

    private final void handleOverlayZoneAction(gk1.g overlayZoneAction) {
        boolean z13 = overlayZoneAction instanceof gk1.f;
        gk1.m mVar = gk1.m.f65243a;
        if (z13) {
            m1 pinVideoGridCellControlsListener = getPinVideoGridCellControlsListener();
            if (pinVideoGridCellControlsListener != null) {
                pinVideoGridCellControlsListener.onUserUpdatedMuteState(((gk1.f) overlayZoneAction).a());
            }
            this.eventIntake.a(new x1(mVar));
            return;
        }
        if (!Intrinsics.d(overlayZoneAction, gk1.d.f65225a)) {
            Intrinsics.d(overlayZoneAction, gk1.e.f65226a);
        } else {
            invalidateParent();
            this.eventIntake.a(new x1(mVar));
        }
    }

    private final void handlePgcAction(l0 pinRepAction) {
        ni1.g0 g0Var = ni1.g0.f90685a;
        if (Intrinsics.d(pinRepAction, g0Var) || !this.isHandlingPgcAction) {
            this.isHandlingPgcAction = !Intrinsics.d(pinRepAction, g0Var);
            boolean z13 = pinRepAction instanceof i0;
            w0 w0Var = w0.f90834a;
            if (z13) {
                this.eventIntake.a(w0Var);
                playSoundEffect(((i0) pinRepAction).a());
                return;
            }
            if (Intrinsics.d(pinRepAction, j0.f90713a)) {
                this.eventIntake.a(w0Var);
                resetTapState$default(this, false, 1, null);
                return;
            }
            if (Intrinsics.d(pinRepAction, k0.f90730a)) {
                this.eventIntake.a(w0Var);
                this.eventIntake.a(r1.f90787a);
                handleContextualMenuHidden();
            } else {
                if (!Intrinsics.d(pinRepAction, h0.f90696a)) {
                    Intrinsics.d(pinRepAction, g0Var);
                    return;
                }
                this.eventIntake.a(w0Var);
                this.eventIntake.a(n1.f90744a);
                playLongPressAnimation();
            }
        }
    }

    private final void handleRequestLayout(b3 requestLayout) {
        if (requestLayout instanceof z2) {
            this.ignoreNextRequestLayoutOneShot = false;
        } else {
            if (!(requestLayout instanceof a3) || this.ignoreNextRequestLayoutOneShot) {
                return;
            }
            this.ignoreNextRequestLayoutOneShot = true;
            this.eventIntake.a(x0.f90839a);
            requestLayout();
        }
    }

    private final void hidePieces(t0 hidePieces) {
        if (!(hidePieces instanceof r0)) {
            Intrinsics.d(hidePieces, ni1.s0.f90792a);
            return;
        }
        this.eventIntake.a(z0.f90930a);
        for (oi1.a aVar : ((r0) hidePieces).f90786a) {
            if (Intrinsics.d(aVar, oi1.f.f95306a)) {
                List<? extends f1> list = this.pinRepPieces;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof qj1.a) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((qj1.a) it.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.g.f95307a)) {
                List<? extends f1> list2 = this.pinRepPieces;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof pj1.a) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((pj1.a) it2.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.j.f95310a)) {
                List<? extends f1> list3 = this.pinRepPieces;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (obj3 instanceof rj1.a) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ((rj1.a) it3.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.l.f95312a)) {
                List<? extends f1> list4 = this.pinRepPieces;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list4) {
                    if (obj4 instanceof sj1.a) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((sj1.a) it4.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.n.f95314a)) {
                List<? extends f1> list5 = this.pinRepPieces;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list5) {
                    if (obj5 instanceof uj1.a) {
                        arrayList5.add(obj5);
                    }
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ((uj1.a) it5.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.o.f95315a)) {
                List<? extends f1> list6 = this.pinRepPieces;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list6) {
                    if (obj6 instanceof s) {
                        arrayList6.add(obj6);
                    }
                }
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    ((s) it6.next()).f139158k.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.q.f95317a)) {
                List<? extends f1> list7 = this.pinRepPieces;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : list7) {
                    if (obj7 instanceof wj1.d) {
                        arrayList7.add(obj7);
                    }
                }
                Iterator it7 = arrayList7.iterator();
                while (it7.hasNext()) {
                    ((wj1.d) it7.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.m.f95313a)) {
                List<? extends f1> list8 = this.pinRepPieces;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : list8) {
                    if (obj8 instanceof tj1.a) {
                        arrayList8.add(obj8);
                    }
                }
                Iterator it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    ((tj1.a) it8.next()).f100282f.f128846i = true;
                }
            } else if (Intrinsics.d(aVar, oi1.h.f95308a)) {
                List<? extends f1> list9 = this.pinRepPieces;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj9 : list9) {
                    if (obj9 instanceof lj1.a) {
                        arrayList9.add(obj9);
                    }
                }
                Iterator it9 = arrayList9.iterator();
                while (it9.hasNext()) {
                    ((lj1.a) it9.next()).D();
                }
            } else if (Intrinsics.d(aVar, oi1.p.f95316a)) {
                List<? extends f1> list10 = this.pinRepPieces;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj10 : list10) {
                    if (obj10 instanceof vj1.a) {
                        arrayList10.add(obj10);
                    }
                }
                Iterator it10 = arrayList10.iterator();
                while (it10.hasNext()) {
                    ((vj1.a) it10.next()).f100282f.f128846i = true;
                }
            }
        }
        invalidate();
    }

    private final vj1.a inlineSaveIndicator() {
        if (this.inlineSaveIndicator == null) {
            this.inlineSaveIndicator = new vj1.a(this);
        }
        vj1.a aVar = this.inlineSaveIndicator;
        Intrinsics.f(aVar);
        return aVar;
    }

    private final Unit invalidateParent() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return null;
        }
        view.invalidate();
        return Unit.f80348a;
    }

    public final boolean isPinMediaHalfVisible() {
        float f13;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            qc2.a viewabilityCalculator = getViewabilityCalculator();
            yi1.q imageEdges = getImageEdges();
            int i13 = imageEdges.f139141c - imageEdges.f139139a;
            yi1.q imageEdges2 = getImageEdges();
            f13 = ((qc2.d) viewabilityCalculator).c(this, 0, 0, i13, imageEdges2.f139142d - imageEdges2.f139140b, view);
        } else {
            f13 = 0.0f;
        }
        return f13 >= 50.0f;
    }

    private final void maybeSetupAdsOpenMeasurement(f30 pin) {
        if (u.f117753b[((vr.b) getAdsCommonAnalytics()).d(pin).ordinal()] == 1 && ((p0) getAdsOpenMeasurementManager()).n()) {
            p0 p0Var = (p0) getAdsOpenMeasurementManager();
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(this, "view");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.f(p0Var, pin, this, null), 3);
        }
    }

    private final int measureSbaPieces(f30 pin) {
        Float f13;
        int i13;
        int dimensionPixelSize;
        Object obj;
        wa2.l k13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean Q5 = pin.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        if ((Q5.booleanValue() || b40.T0(pin)) && (f13 = this.maxVideoAdPinMediaWidthHeightRatio) != null) {
            copyFixedHeightSpecIntoPinSpec(new bb2.i(f13.floatValue(), new u50.x(0), bb2.f.FIT, 8));
        }
        applyPinLeveling();
        updatePinImageForPinLevelingConstraints(this.pinSpec);
        this.measuredHeight = 0;
        getEndFrame().f95397f = 0;
        getDlAdCloseupOverlay().f83615h = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (f1 f1Var : this.pinRepPieces) {
            int i18 = f1Var instanceof cj1.a ? 0 : i14;
            if (this.isRTL && i18 != 0 && (k13 = f1Var.k()) != null) {
                tb.f.l0(k13, i14);
            }
            ua2.z0 v13 = f1Var.v(f1Var instanceof xi1.c ? this.measuredWidth : f1Var instanceof pj1.e ? ((this.measuredWidth - i16) - i17) - (getResources().getDimensionPixelSize(this.gridCardPadding) * 2) : this.measuredWidth - i18, this.measuredHeight);
            int i19 = v13.f121640a;
            if (f1Var instanceof s) {
                Iterator<T> it = this.piecesRequiringImageDimensions.iterator();
                while (it.hasNext()) {
                    s sVar = (s) f1Var;
                    ((jj1.e) it.next()).b(sVar.k().f128841d, sVar.k().f128842e, sVar.k().f128840c);
                }
            }
            if (f1Var instanceof pj1.e) {
                boolean z13 = (f1Var instanceof uj1.a) && ((uj1.a) f1Var).H();
                if (!z13) {
                    pj1.e eVar = (pj1.e) f1Var;
                    if (eVar.C() == pj1.c.START) {
                        eVar.F(i16);
                        i16 += getResources().getDimensionPixelSize(this.gridCardPadding) + f1Var.s();
                    }
                }
                if (!z13 && !(f1Var instanceof vj1.a)) {
                    ((pj1.e) f1Var).F(i17);
                    i17 += getResources().getDimensionPixelSize(this.gridCardPadding) + f1Var.s();
                }
            }
            if (f1Var instanceof kj1.f) {
                ((kj1.f) f1Var).D(i17);
                i17 = getResources().getDimensionPixelSize(this.gridCardPadding) + f1Var.s() + i17;
            }
            boolean z14 = f1Var instanceof zj1.a;
            Object obj2 = null;
            int i23 = v13.f121641b;
            if (z14) {
                va2.k kVar = ((zj1.a) f1Var).f142058j;
                if (kVar == null) {
                    Intrinsics.r("overflowDrawable");
                    throw null;
                }
                i14 = kVar.f125398n.getIntrinsicWidth() + getResources().getDimensionPixelSize(this.gridCardPadding);
                i13 = this.measuredHeight + i23;
                dimensionPixelSize = getResources().getDimensionPixelSize(this.gridCardPadding);
            } else if (f1Var instanceof yj1.a) {
                i14 = f1Var.s() + getResources().getDimensionPixelSize(this.gridCardPadding);
                i13 = this.measuredHeight + i23;
                dimensionPixelSize = getResources().getDimensionPixelSize(this.gridCardPadding);
            } else {
                if (f1Var instanceof wi1.a) {
                    getDlAdCloseupOverlay().f83615h += i23;
                    if (this.hasEndFrame) {
                        oj1.b endFrame = getEndFrame();
                        endFrame.f95397f = endFrame.C() + i23;
                    }
                }
                int i24 = u.f117752a[f1Var.f121493b.ordinal()];
                if (i24 == 1) {
                    this.measuredHeight += i23;
                } else if (i24 == 2) {
                    int i25 = this.measuredWidth;
                    if (i25 >= i19) {
                        i19 = i25;
                    }
                    this.measuredWidth = i19;
                    int i26 = this.measuredHeight;
                    if (i26 >= i23) {
                        i23 = i26;
                    }
                    this.measuredHeight = i23;
                }
                ej1.a aVar = f1Var instanceof ej1.a ? (ej1.a) f1Var : null;
                if ((aVar != null ? aVar.f59097i : null) == ej1.c.ID_CATALOG_CAROUSEL_DUMMY_LBL) {
                    ej1.c cVar = ej1.c.ID_PRODUCT_TITLE;
                    ej1.c cVar2 = ej1.c.ID_PRODUCT_PRICE;
                    Iterator<T> it2 = this.pinRepPieces.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        f1 f1Var2 = (f1) obj;
                        if ((f1Var2 instanceof ej1.a) && ((ej1.a) f1Var2).f59097i == cVar) {
                            break;
                        }
                    }
                    f1 f1Var3 = (f1) obj;
                    Iterator<T> it3 = this.pinRepPieces.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        f1 f1Var4 = (f1) next;
                        if ((f1Var4 instanceof ej1.a) && ((ej1.a) f1Var4).f59097i == cVar2) {
                            obj2 = next;
                            break;
                        }
                    }
                    f1 f1Var5 = (f1) obj2;
                    if (f1Var3 != null && f1Var5 != null && f1Var3.w() > f1Var5.w() * 1.5d) {
                        this.measuredHeight -= f1Var.w();
                    }
                }
            }
            i15 = i13 + dimensionPixelSize;
        }
        Function0<Unit> onPinRepPiecesMeasured = getOnPinRepPiecesMeasured();
        if (onPinRepPiecesMeasured != null) {
            onPinRepPiecesMeasured.invoke();
        }
        return i15;
    }

    private final boolean navigateToCloseupComprehensive(boolean isDeeplinkAlreadyTried) {
        f30 f30Var = this.deprecatedPin;
        Intrinsics.f(f30Var);
        if (((Boolean) openPinCloseup(f30Var, isDeeplinkAlreadyTried).f80346a).booleanValue()) {
            return false;
        }
        getPrefetchManager().a();
        getPerfLogApplicationUtils().getClass();
        g3.a(f30Var);
        Navigation navigation = this.navigation;
        if (navigation == null) {
            navigation = Navigation.r0(com.pinterest.screens.z2.a(), f30Var);
        }
        addNavigationExtras(navigation);
        getScrollToTopEventManager().a(getPinPosition(), navigation.getF49944f());
        getEventManager().d(navigation);
        return false;
    }

    private final Pair<Boolean, Boolean> navigateToCloseupDirectly(f30 pin) {
        return openPinCloseup(pin, false);
    }

    private final void onAttachedFirstPageInclusive(boolean isFromScroll) {
        ((hf0.b) getDeviceInfoProvider()).getClass();
        double d2 = hf0.b.f69002b;
        ((hf0.b) getDeviceInfoProvider()).getClass();
        i1 i1Var = new i1(d2, hf0.b.f69003c - hf0.b.f());
        ViewParent parent = getParent();
        if (parent != null) {
            parent.getParent();
        }
        this.eventIntake.a(new g1(i1Var, isFromScroll));
    }

    public static /* synthetic */ void onAttachedFirstPageInclusive$default(SbaPinRep sbaPinRep, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        sbaPinRep.onAttachedFirstPageInclusive(z13);
    }

    private final void onDetachedInclusive(boolean isFromScroll) {
        this.eventIntake.a(new ni1.j1(isFromScroll));
    }

    public static /* synthetic */ void onDetachedInclusive$default(SbaPinRep sbaPinRep, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        sbaPinRep.onDetachedInclusive(z13);
    }

    private final Pair<Boolean, Boolean> openPinCloseup(f30 pinToOpen, boolean isDeeplinkAlreadyTried) {
        Boolean bool;
        f30 f30Var;
        boolean a13;
        if (pinToOpen == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (((es.c) getAdFormats()).U(pinToOpen) || ((es.c) getAdFormats()).x(pinToOpen)) {
            e eVar = this.clickThroughHelper;
            String D = com.bumptech.glide.c.D(pinToOpen);
            if (D == null) {
                D = "";
            }
            e.b(eVar, pinToOpen, D, true, -1, null, null, null, null, null, 496);
        }
        boolean z13 = this.currentDisplayState.f90818l;
        if (!z13) {
            if (this.pinActionHandler == null) {
                return new Pair<>(Boolean.FALSE, null);
            }
            getPrefetchManager().a();
            d0 d0Var = this.pinActionHandler;
            Intrinsics.f(d0Var);
            d0Var.onOpenPinCloseup(pinToOpen);
            return new Pair<>(Boolean.TRUE, null);
        }
        f30 f30Var2 = this.deprecatedPin;
        if (f30Var2 != null) {
            bool = Boolean.valueOf(!((es.v) getAdsCommonDisplay()).M(f30Var2) || (z13 && ((es.v) getAdsCommonDisplay()).L(f30Var2, ((es.v) getAdsCommonDisplay()).M(f30Var2))));
        } else {
            bool = null;
        }
        String uid = pinToOpen.getUid();
        f30 f30Var3 = this.deprecatedPin;
        Integer num = this.collectionSelectedPosition;
        boolean z14 = this.isProductTag;
        String uid2 = f30Var3 != null ? f30Var3.getUid() : null;
        Short o13 = ((es.v) getAdsCommonDisplay()).o(this.deprecatedPin);
        r2 experiments = getExperiments();
        experiments.getClass();
        z3 z3Var = lh0.a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
        Boolean bool2 = bool;
        h32.c1 a14 = c2.a(uid, f30Var3, pinToOpen, true, num, z14, uid2, o13, false, false, getAdFormats(), false, g1Var.o("android_dco_cpd", "enabled", z3Var) || g1Var.l("android_dco_cpd"), getExperiments().b0(), getAdsCommonDisplay(), getAdsCommonAnalytics());
        if (isDeeplinkAlreadyTried) {
            f30Var = pinToOpen;
        } else {
            f30Var = pinToOpen;
            if (!getAdsHandshakeQuarantine().b(f30Var)) {
                Boolean bool3 = Boolean.TRUE;
                if (Intrinsics.d(bool2, bool3)) {
                    ni1.d deepLinkHelper = getDeepLinkHelper();
                    f30 f30Var4 = this.deprecatedPin;
                    a13 = deepLinkHelper.a(pinToOpen, f30Var4 != null ? f30Var4.getUid() : null, a14, this.collectionSelectedPosition, null, (r19 & 32) != 0 ? false : false, (r19 & 64) != 0 ? false : false, getAdFormats());
                    if (a13) {
                        return new Pair<>(bool3, bool3);
                    }
                }
            }
        }
        this.eventIntake.a(new u1(new bk1.d0(f30Var)));
        return new Pair<>(Boolean.TRUE, Boolean.FALSE);
    }

    private final void overrideBackground(ni1.q0 backgroundOverride) {
        View view;
        boolean z13 = backgroundOverride instanceof o0;
        v0 v0Var = v0.f90829a;
        if (z13) {
            this.eventIntake.a(v0Var);
            this.backgroundBeforeOverride = getBackground();
            Context context = getContext();
            int a13 = ((o0) backgroundOverride).a();
            Object obj = d5.a.f53679a;
            setBackground(context.getDrawable(a13));
            return;
        }
        if (!(backgroundOverride instanceof ni1.m0)) {
            if (!(backgroundOverride instanceof ni1.p0)) {
                boolean z14 = backgroundOverride instanceof n0;
                return;
            } else {
                this.eventIntake.a(v0Var);
                setBackground(this.backgroundBeforeOverride);
                return;
            }
        }
        this.eventIntake.a(v0Var);
        this.backgroundBeforeOverride = getBackground();
        if (getHasParentView()) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            view = getParentView(parent);
        } else {
            view = this;
        }
        Context context2 = getContext();
        int a14 = ((ni1.m0) backgroundOverride).a();
        Object obj2 = d5.a.f53679a;
        view.setBackground(context2.getDrawable(a14));
    }

    private final cj1.a pharmaAdDisclosure() {
        if (this.pharmaAdDisclosure == null) {
            Intrinsics.checkNotNullParameter(this, "pinRepView");
            cj1.a aVar = new cj1.a(this);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            aVar.f27884h = new va2.o(context);
            this.pharmaAdDisclosure = aVar;
        }
        cj1.a aVar2 = this.pharmaAdDisclosure;
        Intrinsics.f(aVar2);
        return aVar2;
    }

    private final void playLongPressAnimation() {
        expandAndTiltView$default(this, this, null, 2, null);
    }

    private final void processDeepLinkAttempt(bk1.c clickThroughAction) {
        this.eventIntake.a(new u1(new bk1.r(getDeepLinkHelper().a(clickThroughAction.d(), clickThroughAction.c(), clickThroughAction.b(), clickThroughAction.a(), clickThroughAction.h(), clickThroughAction.f(), clickThroughAction.g(), getAdFormats()), clickThroughAction.e(), clickThroughAction.d(), 4)));
    }

    private final void registerMediaVisibilityListeners() {
        addMediaViewabilityLayoutChangeListener();
        addMediaViewabilityScrollListener();
    }

    public final void resetOverlayIfNecessary() {
        xi1.c cVar = this.chinCTA;
        if (cVar != null) {
            cVar.l();
        }
        sj1.a aVar = this.animatedCtaOverlayIndicator;
        if (aVar != null) {
            aVar.l();
        }
        wj1.d dVar = this.shoppingIndicator;
        if (dVar != null) {
            dVar.l();
        }
    }

    private final void resetTapState(boolean isContextMenuBeingHidden) {
        boolean z13;
        View view;
        try {
            r2 experiments = getExperiments();
            experiments.getClass();
            z3 z3Var = lh0.a4.f83297a;
            lh0.z0 z0Var = experiments.f83469a;
            if (!((lh0.g1) z0Var).o("android_ctx_long_press_cleanup_animation", "enabled", z3Var) && !((lh0.g1) z0Var).l("android_ctx_long_press_cleanup_animation")) {
                z13 = false;
                if (isContextMenuBeingHidden || !z13) {
                    if (getGestureDetector().b() || !z13) {
                        kg.a.e(this);
                    }
                    return;
                }
                if (getHasParentView()) {
                    ViewParent parent = getParent();
                    Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                    view = getParentView(parent);
                } else {
                    view = this;
                }
                kg.a.g(view);
                return;
            }
            z13 = true;
            if (isContextMenuBeingHidden) {
            }
            if (getGestureDetector().b()) {
            }
            kg.a.e(this);
        } catch (Exception e13) {
            vb0.j.f125466a.E("Animation error resetting tap state", e13);
        }
    }

    public static /* synthetic */ void resetTapState$default(SbaPinRep sbaPinRep, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        sbaPinRep.resetTapState(z13);
    }

    private final xi1.c sbaChinCTA() {
        if (this.chinCTA == null) {
            xi1.c cVar = new xi1.c(this, getImageCache(), getExperiments());
            cVar.f135037i = getViewabilityCalculator();
            this.chinCTA = cVar;
        }
        xi1.c cVar2 = this.chinCTA;
        Intrinsics.f(cVar2);
        return cVar2;
    }

    public final void sendMediaVisibilityEventIfNecessary(boolean isPinMediaHalfVisible) {
        l lVar = isPinMediaHalfVisible ? l.MoreThan50PercentVisible : l.LessThan50PercentVisible;
        if (this.priorMediaVisibility != lVar) {
            this.priorMediaVisibility = lVar;
            this.eventIntake.a(new ni1.v1(new z(lVar)));
        }
    }

    private final void setColumnIndexForLogging(int i13) {
        if (this.columnIndexForLogging != i13) {
            this.columnIndexForLogging = i13;
            this.eventIntake.a(new q1(i13));
        }
    }

    private final void setTrafficSource(String trafficSource) {
        nl1.d coreFragment;
        this.trafficSource = trafficSource;
        if (!Intrinsics.d(trafficSource, "unknown") || (coreFragment = getCoreFragment()) == null) {
            return;
        }
        jq.c pinTrafficSourceMapper = getPinTrafficSourceMapper();
        String name = coreFragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        pinTrafficSourceMapper.getClass();
        this.trafficSource = jq.c.a(name);
    }

    public final void setupOverlayAnimationAndStart() {
        xi1.c cVar = this.chinCTA;
        if (cVar != null) {
            cVar.D();
        }
        sj1.a aVar = this.animatedCtaOverlayIndicator;
        if (aVar != null) {
            aVar.n();
        }
        wj1.d dVar = this.shoppingIndicator;
        if (dVar != null) {
            dVar.n();
        }
    }

    private final wj1.d shoppingIndicator() {
        if (this.shoppingIndicator == null) {
            this.shoppingIndicator = new wj1.d(this, getViewabilityCalculator(), this);
        }
        wj1.d dVar = this.shoppingIndicator;
        Intrinsics.f(dVar);
        return dVar;
    }

    private final boolean tryToAvoidRedraw(u0 displayState) {
        u0 u0Var = this.currentDisplayState;
        this.currentDisplayState = displayState;
        if (u0Var.f90820n.f59328a.size() == displayState.f90820n.f59328a.size()) {
            gk1.l lVar = u0Var.f90821o;
            int size = lVar.f65239a.size();
            gk1.l lVar2 = displayState.f90821o;
            if (size == lVar2.f65239a.size() && u0Var.f90823q.f62348a.size() == displayState.f90823q.f62348a.size() && u0Var.f90822p.f69351a.size() == displayState.f90822p.f69351a.size()) {
                ek1.r rVar = displayState.f90820n;
                ek1.q qVar = rVar.f59330c;
                ek1.r rVar2 = u0Var.f90820n;
                List list = rVar2.f59328a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                int i13 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    List list2 = rVar.f59328a;
                    if (hasNext) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            f0.p();
                            throw null;
                        }
                        ni1.f0 f0Var = (wi1.b) next;
                        wi1.b bVar = (wi1.b) list2.get(i13);
                        if ((f0Var instanceof yi1.l) && (bVar instanceof yi1.l)) {
                            f0Var = yi1.l.e((yi1.l) f0Var, ((yi1.l) bVar).f139112b);
                        }
                        arrayList.add(f0Var);
                        i13 = i14;
                    } else {
                        ek1.r e13 = ek1.r.e(rVar2, arrayList, rVar.f59329b, qVar, rVar.f59331d, null, 16);
                        gk1.k kVar = lVar2.f65240b;
                        if (Intrinsics.d(u0.e(u0Var, 0, null, null, false, displayState.f90812f, null, null, null, null, null, false, null, e13, gk1.l.e(lVar, null, kVar, null, 5), null, null, null, null, displayState.f90826t, null, 1548255), displayState)) {
                            handleMediaZoneAction(rVar.f59330c);
                            this.impressionDisplayState = rVar.f59329b;
                            forceDrawOver(kVar);
                            hidePieces(displayState.f90812f);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list2) {
                                if (obj instanceof yi1.l) {
                                    arrayList2.add(obj);
                                }
                            }
                            yi1.l lVar3 = (yi1.l) CollectionsKt.firstOrNull(arrayList2);
                            if (lVar3 != null) {
                                getPinImagePiece().A(lVar3);
                            }
                            handleRequestLayout(displayState.f90826t);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void unTouchAll() {
        resetTapState$default(this, false, 1, null);
        invalidate();
    }

    private final void updateDevToolsForImpressionStart(boolean impressionIsStarting) {
        f30 f30Var = this.deprecatedPin;
        if (f30Var != null && impressionIsStarting) {
            devDisplayPinImpressionStart(f30Var);
        }
    }

    private final void updatePinImageForPinLevelingConstraints(m pinSpec) {
        s sVar;
        yi1.l lVar;
        Iterator<T> it = this.pinRepPieces.iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            f1 f1Var = (f1) it.next();
            sVar = f1Var instanceof s ? (s) f1Var : null;
            if (sVar != null) {
                break;
            }
        }
        if (sVar == null || (lVar = sVar.f139156i) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(pinSpec, "pinSpec");
        yi1.h0 stateTransformerImageDS = lVar.f139111a;
        Intrinsics.checkNotNullParameter(stateTransformerImageDS, "stateTransformerImageDS");
        int i13 = pinSpec.f103314c;
        c1 c1Var = stateTransformerImageDS.f139101k;
        if (c1Var == null) {
            c1Var = pinSpec.f103316e;
        }
        c1 c1Var2 = c1Var;
        yi1.k fVar = c1Var2 == c1.SCALE_TO_FILL ? new yi1.f(stateTransformerImageDS.f139102l) : stateTransformerImageDS.f139100j;
        or orVar = c1Var2 == c1.NONE ? stateTransformerImageDS.f139096f : null;
        int i14 = pinSpec.f103315d + stateTransformerImageDS.f139103m.f120588a;
        if (fVar instanceof yi1.i) {
            i14 = Math.min(((yi1.i) fVar).f139104a, i14);
        }
        int i15 = pinSpec.f103315d;
        yi1.m0 displayState = new yi1.m0(i13, i15, i14, c1Var2, fVar, orVar);
        Intrinsics.checkNotNullParameter(displayState, "viewGeneratedImageDS");
        yi1.p pVar = sVar.f139158k;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        pVar.f139128p = i13;
        pVar.f139129q = i15;
        pVar.f139130r = i14;
        pVar.B = c1Var2;
        pVar.D = fVar;
    }

    @Override // qa2.b
    public void addToView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.addView(this);
    }

    @Override // qa2.b
    public void addVisibilityEvent(@NotNull e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        this.eventIntake.a(new ni1.v1(new ek1.f0(new a0(visibleEvent))));
    }

    @Override // qa2.v1
    public void applyUnMigratedPFCFields(@NotNull String trafficSource, int backgroundColorResId, d0 pinActionHandler, boolean isProductTag, boolean isHideSupported) {
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        setHideSupported(isHideSupported);
        this.isProductTag = isProductTag;
        if (pinActionHandler != null) {
            setPinActionHandler(pinActionHandler);
        }
        setTrafficSource(trafficSource);
        Paint paint = this.backgroundPaint;
        Context context = getContext();
        Object obj = d5.a.f53679a;
        paint.setColor(context.getColor(backgroundColorResId));
    }

    @Override // y92.l
    @NotNull
    public View asView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [lj1.a] */
    /* JADX WARN: Type inference failed for: r10v15, types: [tj1.a] */
    /* JADX WARN: Type inference failed for: r10v16, types: [rj1.a] */
    /* JADX WARN: Type inference failed for: r10v17, types: [cj1.a] */
    /* JADX WARN: Type inference failed for: r10v18, types: [vj1.a] */
    /* JADX WARN: Type inference failed for: r10v19, types: [sj1.a] */
    /* JADX WARN: Type inference failed for: r10v20, types: [bj1.a] */
    /* JADX WARN: Type inference failed for: r10v21, types: [sa2.c] */
    /* JADX WARN: Type inference failed for: r10v22, types: [hj1.a] */
    /* JADX WARN: Type inference failed for: r10v23, types: [yj1.a] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, ua2.f1, zj1.a] */
    /* JADX WARN: Type inference failed for: r10v27, types: [zi1.b] */
    /* JADX WARN: Type inference failed for: r10v28, types: [xi1.c] */
    /* JADX WARN: Type inference failed for: r10v29, types: [xj1.a] */
    /* JADX WARN: Type inference failed for: r10v30, types: [ak1.a, ua2.d1, ua2.f1] */
    /* JADX WARN: Type inference failed for: r10v31, types: [ij1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    @Override // ti1.f
    public void bindDisplayState(@NotNull u0 displayState) {
        boolean z13;
        int i13;
        ?? dlAdCloseupOverlay;
        String str;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.deprecatedPin = displayState.f90807a;
        setPinPosition(displayState.f90808b);
        int i14 = 2;
        if (b40.X0(this.deprecatedPin)) {
            setImportantForAccessibility(2);
        }
        Pair pair = displayState.f90809c;
        setTag(((Number) pair.f80346a).intValue(), pair.f80347b);
        if (tryToAvoidRedraw(displayState)) {
            return;
        }
        cacheDisplayStateElements(displayState);
        yk2.b bVar = new yk2.b();
        bVar.addAll(displayState.f90819m.f55161a);
        ek1.r rVar = displayState.f90820n;
        bVar.addAll(rVar.f59328a);
        gk1.l lVar = displayState.f90821o;
        bVar.addAll(lVar.f65239a);
        bVar.addAll(displayState.f90822p.f69351a);
        bVar.addAll(displayState.f90823q.f62348a);
        bVar.addAll(displayState.f90824r.f27906a);
        yk2.b a13 = kotlin.collections.e0.a(bVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(a13, 10));
        ListIterator listIterator = a13.listIterator(0);
        while (true) {
            s2.y yVar = (s2.y) listIterator;
            int i15 = 1;
            if (!yVar.hasNext()) {
                this.pinRepPieces = arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof jj1.e) {
                        arrayList2.add(obj);
                    }
                }
                this.piecesRequiringImageDimensions = arrayList2;
                List<? extends f1> list = this.pinRepPieces;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((f1) it.next()) instanceof oj1.b) {
                            z13 = true;
                            break;
                        }
                    }
                }
                z13 = false;
                this.hasEndFrame = z13;
                handlePgcAction(displayState.f90817k);
                handleMediaZoneAction(rVar.f59330c);
                handleOverlayZoneAction(lVar.f65241c);
                handleClickThroughAction(displayState.f90825s.f23274a);
                hidePieces(displayState.f90812f);
                forceDrawOver(lVar.f65240b);
                overrideBackground(displayState.f90816j);
                handleRequestLayout(displayState.f90826t);
                maybeSetupAdsOpenMeasurement(displayState.f90807a);
                return;
            }
            ni1.f0 f0Var = (ni1.f0) yVar.next();
            if (f0Var instanceof yi1.l) {
                s pinImagePiece = getPinImagePiece();
                pinImagePiece.A((yi1.l) f0Var);
                dlAdCloseupOverlay = pinImagePiece;
            } else if (f0Var instanceof kj1.a) {
                kj1.f attributionBadgeIndicator = getAttributionBadgeIndicator();
                attributionBadgeIndicator.A((kj1.a) f0Var);
                dlAdCloseupOverlay = attributionBadgeIndicator;
            } else if (f0Var instanceof nj1.a) {
                nj1.b deletedIdeaPinPlaceholder = getDeletedIdeaPinPlaceholder();
                deletedIdeaPinPlaceholder.A((nj1.a) f0Var);
                dlAdCloseupOverlay = deletedIdeaPinPlaceholder;
            } else if (f0Var instanceof oj1.a) {
                oj1.b endFrame = getEndFrame();
                endFrame.A((oj1.a) f0Var);
                dlAdCloseupOverlay = endFrame;
            } else if (f0Var instanceof jj1.b) {
                jj1.c creatorStatsPiece = getCreatorStatsPiece();
                creatorStatsPiece.A((jj1.b) f0Var);
                dlAdCloseupOverlay = creatorStatsPiece;
            } else if (f0Var instanceof pj1.f) {
                pj1.a indicator = getIndicator();
                indicator.A((pj1.f) f0Var);
                dlAdCloseupOverlay = indicator;
            } else if (f0Var instanceof uj1.b) {
                uj1.a fullscreenIndicator = getFullscreenIndicator();
                fullscreenIndicator.G((uj1.b) f0Var);
                dlAdCloseupOverlay = fullscreenIndicator;
            } else if (f0Var instanceof qj1.b) {
                qj1.a audioIndicator = getAudioIndicator();
                audioIndicator.G((qj1.b) f0Var);
                dlAdCloseupOverlay = audioIndicator;
            } else if (f0Var instanceof dj1.a) {
                dj1.b sbaPinRating = getSbaPinRating();
                sbaPinRating.A((dj1.a) f0Var);
                dlAdCloseupOverlay = sbaPinRating;
            } else if (f0Var instanceof gj1.b) {
                gj1.a promoText = getPromoText();
                promoText.C((gj1.b) f0Var);
                dlAdCloseupOverlay = promoText;
            } else if (f0Var instanceof ej1.d) {
                ej1.a aVar = this.textPieces.get(f0Var);
                ej1.a aVar2 = aVar;
                if (aVar == null) {
                    ej1.a aVar3 = new ej1.a(this);
                    this.textPieces.put(f0Var, aVar3);
                    aVar2 = aVar3;
                }
                aVar2.A((ej1.d) f0Var);
                dlAdCloseupOverlay = aVar2;
            } else if (f0Var instanceof fj1.c) {
                fj1.b pinTextWithIcon = getPinTextWithIcon();
                pinTextWithIcon.C((fj1.c) f0Var);
                dlAdCloseupOverlay = pinTextWithIcon;
            } else {
                if (f0Var instanceof ij1.o) {
                    dlAdCloseupOverlay = this.sbaUserAttribution;
                    ij1.o ds2 = (ij1.o) f0Var;
                    dlAdCloseupOverlay.getClass();
                    Intrinsics.checkNotNullParameter(ds2, "displayState");
                    boolean d2 = Intrinsics.d(dlAdCloseupOverlay.f72355j, ds2);
                    dlAdCloseupOverlay = dlAdCloseupOverlay;
                    if (!d2) {
                        dlAdCloseupOverlay.f72355j = ds2;
                        ij1.j jVar = dlAdCloseupOverlay.f72354i;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(ds2, "ds");
                        ij1.o oVar = jVar.f72359o;
                        jVar.f72359o = ds2;
                        if (ds2.f72380f) {
                            ij1.a aVar4 = oVar.f72376b;
                            ij1.a aVar5 = ds2.f72376b;
                            jVar.f72361q = dl2.b.F0(jVar.f72358n, aVar5.f72344d.getValue());
                            k kVar = jVar.f72362r;
                            ((GestaltAvatar) kVar.getValue()).H2(new u00.e(aVar5, 17));
                            boolean z14 = aVar4.f72343c instanceof ij1.b;
                            ij1.d dVar = aVar5.f72343c;
                            if (z14 && (dVar instanceof ij1.b) && Intrinsics.d(aVar4.f72342b, aVar5.f72342b)) {
                                i13 = 2;
                            } else {
                                if (dVar instanceof ij1.c) {
                                    i13 = 2;
                                    ((GestaltAvatar) kVar.getValue()).M2(new ps0.k(jVar, i13));
                                    str = ((ij1.c) dVar).f72346a;
                                } else {
                                    i13 = 2;
                                    str = "";
                                }
                                ((GestaltAvatar) kVar.getValue()).H2(new a1(str, aVar5, jVar, 11));
                            }
                        } else {
                            i13 = i14;
                        }
                        ij1.h hVar = ds2.f72375a;
                        jVar.f72363s.b(hVar.f72352d);
                        jVar.f72364t.b(hVar.f72352d);
                        jVar.f72360p = jVar.f128838a ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                } else {
                    i13 = i14;
                    if (f0Var instanceof ak1.b) {
                        Intrinsics.checkNotNullParameter(this, "pinRepView");
                        dlAdCloseupOverlay = new ak1.a(this);
                        ((Paint) dlAdCloseupOverlay.f121496e.getValue()).setColor(-65536);
                        ak1.b displayState2 = (ak1.b) f0Var;
                        Intrinsics.checkNotNullParameter(displayState2, "displayState");
                        n nVar = displayState2.f15465a;
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        dlAdCloseupOverlay.f15464h = nVar.a(context).intValue();
                    } else if (f0Var instanceof xj1.b) {
                        dlAdCloseupOverlay = getVideoStatusOverlay();
                        dlAdCloseupOverlay.A((xj1.b) f0Var);
                    } else if (f0Var instanceof xi1.a) {
                        dlAdCloseupOverlay = sbaChinCTA();
                        dlAdCloseupOverlay.A((xi1.a) f0Var);
                    } else if (f0Var instanceof zi1.c) {
                        dlAdCloseupOverlay = getPinChips();
                        dlAdCloseupOverlay.A((zi1.c) f0Var);
                    } else if (f0Var instanceof zj1.b) {
                        q5.v0.a(this, getResources().getString(bz1.c.overflow_menu_accessibility_label), new com.google.firebase.messaging.a0(this, 20));
                        dlAdCloseupOverlay = getOverflow();
                        zj1.b displayState3 = (zj1.b) f0Var;
                        dlAdCloseupOverlay.getClass();
                        Intrinsics.checkNotNullParameter(displayState3, "displayState");
                        if (!Intrinsics.d(dlAdCloseupOverlay.f142059k, displayState3) || dlAdCloseupOverlay.f142058j == null) {
                            dlAdCloseupOverlay.f142059k = displayState3;
                            Context context2 = dlAdCloseupOverlay.f121492a.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            dlAdCloseupOverlay.f142058j = new va2.k(context2, displayState3.f142060a);
                        }
                    } else if (f0Var instanceof yj1.b) {
                        dlAdCloseupOverlay = getFavoriteButton();
                        dlAdCloseupOverlay.A((yj1.b) f0Var);
                        dlAdCloseupOverlay.B(new ti1.w(this, i15));
                    } else if (f0Var instanceof hj1.b) {
                        dlAdCloseupOverlay = getPinReactions();
                        dlAdCloseupOverlay.A((hj1.b) f0Var);
                    } else if (f0Var instanceof jj1.f) {
                        dlAdCloseupOverlay = getSkinToneSignalOverlay();
                        dlAdCloseupOverlay.E((jj1.f) f0Var);
                    } else if (f0Var instanceof bj1.b) {
                        dlAdCloseupOverlay = getBoardPinAttribution();
                        dlAdCloseupOverlay.C((bj1.b) f0Var);
                    } else if (f0Var instanceof sj1.b) {
                        dlAdCloseupOverlay = directToSiteIndicator();
                        dlAdCloseupOverlay.G((sj1.b) f0Var);
                        dlAdCloseupOverlay.J(getPinImagePiece());
                    } else if (f0Var instanceof vj1.b) {
                        dlAdCloseupOverlay = inlineSaveIndicator();
                        dlAdCloseupOverlay.G((vj1.b) f0Var);
                    } else if (f0Var instanceof cj1.b) {
                        dlAdCloseupOverlay = pharmaAdDisclosure();
                        dlAdCloseupOverlay.A((cj1.b) f0Var);
                    } else if (f0Var instanceof rj1.b) {
                        dlAdCloseupOverlay = getDealBadgeCornerIndicator();
                        dlAdCloseupOverlay.G((rj1.b) f0Var);
                    } else if (f0Var instanceof tj1.b) {
                        dlAdCloseupOverlay = getDynamicBadgeIndicator();
                        dlAdCloseupOverlay.G((tj1.b) f0Var);
                    } else {
                        if (!(f0Var instanceof lj1.b)) {
                            throw new IllegalArgumentException("Unknown display state: " + f0Var);
                        }
                        dlAdCloseupOverlay = getDlAdCloseupOverlay();
                        dlAdCloseupOverlay.A((lj1.b) f0Var);
                    }
                }
                arrayList.add(dlAdCloseupOverlay);
                i14 = i13;
            }
            i13 = i14;
            arrayList.add(dlAdCloseupOverlay);
            i14 = i13;
        }
    }

    @Override // qy.a
    @NotNull
    public String coexistId() {
        String pinUid = getPinUid();
        return pinUid == null ? "" : pinUid;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = false;
        if (event.getAction() == 3) {
            if (!getGestureDetector().b()) {
                resetTapState$default(this, false, 1, null);
            }
            z13 = super.dispatchTouchEvent(event);
        }
        return getGestureDetector().c(event) | z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0521  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void forceDrawOver(@org.jetbrains.annotations.NotNull gk1.k r18) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep.forceDrawOver(gk1.k):void");
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
    public final bs.b getAdsHandshakeQuarantine() {
        bs.b bVar = this.adsHandshakeQuarantine;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("adsHandshakeQuarantine");
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

    @Override // y92.g
    public int getAllowedHeightChange(int delta) {
        if (!resizable()) {
            return 0;
        }
        f30 f30Var = this.deprecatedPin;
        boolean d2 = f30Var != null ? Intrinsics.d(f30Var.d5(), Boolean.TRUE) : false;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int pinDrawableHeight = getPinDrawableHeight() - delta;
        int i13 = wa2.s.f128899l0;
        if (pinDrawableHeight < bk.f.R(false, d2)) {
            return delta;
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        return getPinDrawableHeight() - bk.f.R(false, d2);
    }

    @Override // qa2.u1
    public int getAnchorHeight() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return getPinDrawableHeight();
    }

    @Override // qa2.u1
    @NotNull
    public View getAnchorView() {
        return this;
    }

    @Override // com.pinterest.ui.grid.LegoPinGridCell, qa2.u1
    public int getAnchorWidth() {
        return getWidth();
    }

    @NotNull
    public final jo1.c getBaseGridActionUtils() {
        jo1.c cVar = this.baseGridActionUtils;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("baseGridActionUtils");
        throw null;
    }

    @Override // qa2.b
    /* renamed from: getBottomVisible, reason: from getter */
    public boolean getG0() {
        return this.bottomVisible;
    }

    @Override // nx.v
    public /* bridge */ /* synthetic */ List getChildImpressionViews() {
        return null;
    }

    @Override // si1.c
    public int getChinHeight() {
        return this.chinHeight;
    }

    @Override // si1.c
    public int getChipsHeight() {
        return this.chipsHeight;
    }

    public final long getChromeClickthroughStartTimeNs() {
        return this.chromeClickthroughStartTimeNs;
    }

    @NotNull
    public final a11.d getClickThroughHelperFactory() {
        a11.d dVar = this.clickThroughHelperFactory;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("clickThroughHelperFactory");
        throw null;
    }

    @NotNull
    public final pb0.a getClock() {
        pb0.a aVar = this.clock;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("clock");
        throw null;
    }

    @NotNull
    public final g0 getComponentType() {
        return this.componentType;
    }

    @Override // qa2.b
    public int getCornerRadius() {
        n nVar = this.appliedCornerRadius;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return nVar.a(context).intValue();
    }

    @NotNull
    public final ni1.d getDeepLinkHelper() {
        ni1.d dVar = this.deepLinkHelper;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("deepLinkHelper");
        throw null;
    }

    @NotNull
    public final hf0.c getDeviceInfoProvider() {
        hf0.c cVar = this.deviceInfoProvider;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("deviceInfoProvider");
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

    @NotNull
    public final r2 getExperiments() {
        r2 r2Var = this.experiments;
        if (r2Var != null) {
            return r2Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // qa2.b
    public Rect getFavoriteButtonRect() {
        List<? extends f1> list = this.pinRepPieces;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof yj1.a) {
                arrayList.add(obj);
            }
        }
        yj1.a aVar = (yj1.a) CollectionsKt.firstOrNull(arrayList);
        if (aVar != null) {
            return aVar.f139205h.i();
        }
        return null;
    }

    @Override // si1.d
    public boolean getHasChin() {
        return this.hasChin;
    }

    @Override // si1.d
    public boolean getHasPinChips() {
        return this.hasPinChips;
    }

    @NotNull
    public final q getImageCache() {
        q qVar = this.imageCache;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("imageCache");
        throw null;
    }

    @Override // ti1.f
    @NotNull
    public yi1.q getImageEdges() {
        yi1.p pVar = getPinImagePiece().f139158k;
        int i13 = pVar.f128839b;
        int i14 = pVar.f128840c;
        return new yi1.q(i13, i14, pVar.f128841d + i13, pVar.f128842e + i14);
    }

    public boolean getImageLoaded() {
        return getPinImagePiece().f139157j;
    }

    @NotNull
    public final zs1.a getImpressionDebugUtils() {
        zs1.a aVar = this.impressionDebugUtils;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("impressionDebugUtils");
        throw null;
    }

    public Function0<Unit> getOnPinRepPiecesMeasured() {
        return this.onPinRepPiecesMeasured;
    }

    @Override // qa2.b
    public Rect getOverflowIconRect() {
        List<? extends f1> list = this.pinRepPieces;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof zj1.a) {
                arrayList.add(obj);
            }
        }
        zj1.a aVar = (zj1.a) CollectionsKt.firstOrNull(arrayList);
        if (aVar == null) {
            return null;
        }
        va2.k kVar = aVar.f142058j;
        if (kVar == null) {
            Intrinsics.r("overflowDrawable");
            throw null;
        }
        Rect bounds = kVar.f125398n.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return bounds;
    }

    @Override // qy.a
    public int getPWTImageHeight() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128842e;
        }
        return 0;
    }

    @Override // qy.a
    public int getPWTImageWidth() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128841d;
        }
        return 0;
    }

    @Override // qy.a
    public int getPWTImageX() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128839b;
        }
        return 0;
    }

    @Override // qy.a
    public int getPWTImageY() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128840c;
        }
        return 0;
    }

    @Override // qa2.b
    /* renamed from: getPercentageVisible, reason: from getter */
    public int getN0() {
        return this.percentageVisible;
    }

    @NotNull
    public final g3 getPerfLogApplicationUtils() {
        g3 g3Var = this.perfLogApplicationUtils;
        if (g3Var != null) {
            return g3Var;
        }
        Intrinsics.r("perfLogApplicationUtils");
        throw null;
    }

    @Override // qa2.b
    @xk2.d
    /* renamed from: getPin, reason: from getter */
    public f30 getC0() {
        return this.deprecatedPin;
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

    @Override // qa2.b
    @NotNull
    public wa2.a getPinDrawable() {
        return getPinImagePiece().f139158k;
    }

    @Override // qa2.b
    public int getPinDrawableHeight() {
        return getPinImagePiece().f139158k.f128842e;
    }

    @Override // qa2.b
    /* renamed from: getPinImpression */
    public z1 getE0() {
        return this.impressionDisplayState.f20694b;
    }

    public int getPinPosition() {
        return this.pinPosition;
    }

    @NotNull
    public final jq.c getPinTrafficSourceMapper() {
        jq.c cVar = this.pinTrafficSourceMapper;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("pinTrafficSourceMapper");
        throw null;
    }

    @Override // qa2.b
    public String getPinUid() {
        f30 f30Var = this.deprecatedPin;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        return null;
    }

    public m1 getPinVideoGridCellControlsListener() {
        return this.pinVideoGridCellControlsListener;
    }

    @NotNull
    public final ip1.b getPrefetchManager() {
        ip1.b bVar = this.prefetchManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("prefetchManager");
        throw null;
    }

    @NotNull
    public final aa2.a getScrollToTopEventManager() {
        aa2.a aVar = this.scrollToTopEventManager;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("scrollToTopEventManager");
        throw null;
    }

    @Override // qy.a
    /* renamed from: getShouldTrackPWT, reason: from getter */
    public boolean getF52578b() {
        return this.shouldTrackPWT;
    }

    @Override // qa2.b
    /* renamed from: getTopVisible, reason: from getter */
    public boolean getH0() {
        return this.topVisible;
    }

    public final rl1.c getUserAttributionUserColorIndexForTesting() {
        return this.userAttributionUserColorIndexForTesting;
    }

    @Override // qa2.b, y92.h
    public /* bridge */ /* synthetic */ int getViewHeight() {
        return super.getViewHeight();
    }

    @NotNull
    public final qc2.a getViewabilityCalculator() {
        qc2.a aVar = this.viewabilityCalculator;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("viewabilityCalculator");
        throw null;
    }

    @Override // qa2.b
    /* renamed from: isHideSupported, reason: from getter */
    public boolean getG() {
        return this.isHideSupported;
    }

    @Override // qy.a
    public boolean isPWTImageDrawn() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        return pinDrawable != null && pinDrawable.h();
    }

    @Override // com.pinterest.ui.grid.LegoPinGridCell, nx.v
    public c0 markImpressionStart() {
        setTopVisible(false);
        setBottomVisible(false);
        setPercentageVisible(0);
        r rVar = this.eventIntake;
        boolean isPinMediaHalfVisible = isPinMediaHalfVisible();
        ((pb0.g) getClock()).getClass();
        rVar.a(new ni1.v1(new ek1.y(System.currentTimeMillis(), isPinMediaHalfVisible)));
        az.b bVar = this.impressionDisplayState;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        z1 z1Var = bVar.f20694b;
        if (z1Var == null) {
            return null;
        }
        return new c0(z1Var, bVar.f20693a);
    }

    @Override // qa2.b, qa2.c0
    public void onAttached() {
        onAttachedFirstPageInclusive(true);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedFlag = true;
    }

    @Override // qa2.c0
    public void onDeactivated() {
        onDetachedInclusive$default(this, false, 1, null);
    }

    @Override // qa2.c0
    public void onDetached() {
        qa2.c cVar = getPinImagePiece().f139158k.f139134v;
        cVar.getClass();
        ((hs1.m) hs1.t.a()).h(cVar);
        onDetachedInclusive(true);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.deprecatedPin != null) {
            int i13 = 0;
            for (f1 f1Var : this.pinRepPieces) {
                boolean z13 = f1Var instanceof cj1.a;
                f1Var.r(canvas, (!z13 && this.isRTL) ? i13 : 0, 0, z13 ? this.measuredWidth : this.isRTL ? this.measuredWidth : this.measuredWidth - i13, this.measuredHeight);
                if (f1Var instanceof zj1.a) {
                    va2.k kVar = ((zj1.a) f1Var).f142058j;
                    if (kVar == null) {
                        Intrinsics.r("overflowDrawable");
                        throw null;
                    }
                    Rect bounds = kVar.f125398n.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    i13 = bounds.width() + getResources().getDimensionPixelSize(this.gridCardPadding);
                }
                if (f1Var instanceof yj1.a) {
                    i13 = getResources().getDimensionPixelSize(this.gridCardPadding) + f1Var.s();
                }
            }
            qb0.b.l(canvas);
            getImpressionDebugUtils().getClass();
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }
        super.onDraw(canvas);
    }

    @Override // qa2.b, qa2.c0
    public void onInitialized() {
        onAttachedFirstPageInclusive$default(this, false, 1, null);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        PinterestStaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams ? (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        Integer valueOf = layoutParams2 != null ? Integer.valueOf(layoutParams2.i()) : null;
        setColumnIndexForLogging((valueOf == null || valueOf.intValue() == -1) ? fallbackGetColumnIndex(getInternalCell()) : valueOf.intValue());
        setupOverlayAnimationAndStart();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.measuredWidth = View.MeasureSpec.getSize(widthMeasureSpec);
        f30 f30Var = this.deprecatedPin;
        if (f30Var == null || this.pinRepPieces.isEmpty()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(this.measuredWidth, this.measuredHeight);
            return;
        }
        int measureSbaPieces = measureSbaPieces(f30Var);
        computeNonCompliantFields(this.pinRepPieces);
        if (dl2.b.M1(f30Var)) {
            float height = getGridViewSafe$default(this, false, 1, null) != null ? r2.getHeight() * 0.8f : 0.0f;
            if (height < this.measuredHeight) {
                yi1.q imageEdges = getImageEdges();
                this.maxVideoAdPinMediaWidthHeightRatio = Float.valueOf((height - (r3 - (imageEdges.f139142d - imageEdges.f139140b))) / this.measuredWidth);
                measureSbaPieces = measureSbaPieces(f30Var);
            }
        }
        this.measuredHeight = Math.max(this.measuredHeight, measureSbaPieces);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.measuredWidth, this.measuredHeight);
    }

    @Override // qa2.u1
    public void onPulsarHide() {
    }

    @Override // qa2.u1
    public void onPulsarShow() {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        boolean z13 = layoutDirection == 1;
        if (this.isRTL != z13) {
            this.isRTL = z13;
            Iterator<T> it = this.pinRepPieces.iterator();
            while (it.hasNext()) {
                ((f1) it.next()).z(z13);
            }
        }
        super.onRtlPropertiesChanged(layoutDirection);
    }

    @Override // qa2.c0
    public void onScrollStarted() {
        unTouchAll();
    }

    @Override // android.view.View
    public void onSizeChanged(int w13, int h10, int oldw, int oldh) {
        super.onSizeChanged(w13, h10, oldw, oldh);
        this.eventIntake.a(new ni1.v1(new ek1.b0(this.measuredWidth, this.measuredHeight)));
    }

    @Override // qa2.f0, y92.i
    public /* bridge */ /* synthetic */ void onViewDetached() {
        super.onViewDetached();
    }

    @Override // qa2.f0, y92.i
    public void onViewRecycled() {
        this.currentDisplayState = new u0(null, 0, null, 2097151);
        this.navigation = null;
        removeOnLayoutChangeListener(this.pinMediaVisibilityLayoutChangeListener);
        Unit unit = Unit.f80348a;
        this.pinMediaVisibilityLayoutChangeListener = null;
        PinterestRecyclerView gridViewSafe$default = getGridViewSafe$default(this, false, 1, null);
        o2 o2Var = this.pinMediaVisibilityScrollListener;
        if (gridViewSafe$default != null && o2Var != null) {
            gridViewSafe$default.e(o2Var);
        }
        this.pinMediaVisibilityScrollListener = null;
        this.priorMediaVisibility = l.LessThan50PercentVisible;
        if (this.hasSetParentViewForegroundDrawable) {
            this.hasSetParentViewForegroundDrawable = false;
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setForeground(null);
            }
        }
        for (f1 f1Var : this.pinRepPieces) {
            wa2.l k13 = f1Var.k();
            if (k13 != null) {
                k13.c();
            }
            if (f1Var instanceof s) {
                ((s) f1Var).f139156i = null;
            }
        }
        this.ignoreNextRequestLayoutOneShot = false;
        this.lastProcessedClickthroughAction = bk1.k.f23247a;
        f30 f30Var = this.deprecatedPin;
        if (f30Var != null && ((vr.b) getAdsCommonAnalytics()).d(f30Var) == cs.d.IMAGE && ((p0) getAdsOpenMeasurementManager()).n()) {
            ow.a adsOpenMeasurementManager = getAdsOpenMeasurementManager();
            String pinId = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
            p0 p0Var = (p0) adsOpenMeasurementManager;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.h(p0Var, pinId, null), 3);
        }
    }

    @Override // y92.g
    public boolean resizable() {
        return bs1.c.m1(this.deprecatedPin, getAdFormats());
    }

    public final void setAdFormats(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adFormats = aVar;
    }

    public final void setAdsCommonAnalytics(@NotNull vr.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsCommonAnalytics = aVar;
    }

    public final void setAdsCommonDisplay(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.adsCommonDisplay = hVar;
    }

    public final void setAdsHandshakeQuarantine(@NotNull bs.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.adsHandshakeQuarantine = bVar;
    }

    public final void setAdsOpenMeasurementManager(@NotNull ow.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.adsOpenMeasurementManager = aVar;
    }

    public final void setBaseGridActionUtils(@NotNull jo1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.baseGridActionUtils = cVar;
    }

    @Override // qa2.b
    public void setBottomVisible(boolean z13) {
        this.bottomVisible = z13;
    }

    public void setChinHeight(int i13) {
        this.chinHeight = i13;
    }

    public void setChipsHeight(int i13) {
        this.chipsHeight = i13;
    }

    public final void setChromeClickthroughStartTimeNs(long j13) {
        this.chromeClickthroughStartTimeNs = j13;
    }

    public final void setClickThroughHelperFactory(@NotNull a11.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.clickThroughHelperFactory = dVar;
    }

    public final void setClock(@NotNull pb0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.clock = aVar;
    }

    public final void setComponentType(@NotNull g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<set-?>");
        this.componentType = g0Var;
    }

    public final void setDeepLinkHelper(@NotNull ni1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.deepLinkHelper = dVar;
    }

    public final void setDeviceInfoProvider(@NotNull hf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.deviceInfoProvider = cVar;
    }

    @Override // ti1.f
    public void setEventIntake(@NotNull r eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.eventIntake = eventIntake;
    }

    public final void setEventManager(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.eventManager = wVar;
    }

    public final void setExperiments(@NotNull r2 r2Var) {
        Intrinsics.checkNotNullParameter(r2Var, "<set-?>");
        this.experiments = r2Var;
    }

    public void setHasChin(boolean z13) {
        this.hasChin = z13;
    }

    public void setHasPinChips(boolean z13) {
        this.hasPinChips = z13;
    }

    public void setHideSupported(boolean z13) {
        this.isHideSupported = z13;
    }

    public final void setImageCache(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.imageCache = qVar;
    }

    public final void setImpressionDebugUtils(@NotNull zs1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.impressionDebugUtils = aVar;
    }

    @Override // yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(yk1.i iVar) {
    }

    @Override // qa2.b
    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    @Override // qa2.v1
    public void setOnPinRepPiecesMeasured(Function0<Unit> function0) {
        this.onPinRepPiecesMeasured = function0;
    }

    @Override // qa2.b
    public void setPercentageVisible(int i13) {
        this.percentageVisible = i13;
    }

    public final void setPerfLogApplicationUtils(@NotNull g3 g3Var) {
        Intrinsics.checkNotNullParameter(g3Var, "<set-?>");
        this.perfLogApplicationUtils = g3Var;
    }

    @Override // qa2.e0
    public void setPin(@NotNull f30 p13, int pinGridPosition) {
        Intrinsics.checkNotNullParameter(p13, "p");
    }

    @Override // qa2.b
    public void setPinActionHandler(d0 pinActionHandler) {
        this.pinActionHandler = pinActionHandler;
    }

    public final void setPinAuxHelper(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.pinAuxHelper = b0Var;
    }

    public void setPinPosition(int i13) {
        this.pinPosition = i13;
    }

    public final void setPinTrafficSourceMapper(@NotNull jq.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.pinTrafficSourceMapper = cVar;
    }

    @Override // qa2.b, si1.b
    public void setPinVideoGridCellControlsListener(m1 m1Var) {
        this.pinVideoGridCellControlsListener = m1Var;
    }

    @Override // qa2.b
    public void setPinalytics(@NotNull nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.pinalytics = pinalytics;
    }

    public final void setPrefetchManager(@NotNull ip1.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.prefetchManager = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        super.setPressed(pressed);
        if (pressed) {
            return;
        }
        unTouchAll();
    }

    public final void setScrollToTopEventManager(@NotNull aa2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.scrollToTopEventManager = aVar;
    }

    public void setShouldTrackPWT(boolean z13) {
        this.shouldTrackPWT = z13;
    }

    @Override // qa2.b
    public void setTopVisible(boolean z13) {
        this.topVisible = z13;
    }

    public final void setUserAttributionUserColorIndexForTesting(rl1.c cVar) {
        this.sbaUserAttribution.f72354i.f72357m = cVar;
        this.userAttributionUserColorIndexForTesting = cVar;
    }

    public final void setViewabilityCalculator(@NotNull qc2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.viewabilityCalculator = aVar;
    }

    @Override // y92.g
    @NotNull
    /* renamed from: uid */
    public String getUniqueId() {
        f30 f30Var = this.deprecatedPin;
        String uid = f30Var != null ? f30Var.getUid() : null;
        return uid == null ? String.valueOf(hashCode()) : uid;
    }

    @Override // qa2.f0
    @NotNull
    public SbaPinRep getInternalCell() {
        return this.internalCell;
    }

    @Override // com.pinterest.ui.grid.LegoPinGridCell, nx.v
    public c0 markImpressionEnd() {
        az.b bVar = this.impressionDisplayState;
        z1 z1Var = bVar.f20694b;
        if (z1Var == null) {
            return null;
        }
        if (bVar.f20695c != az.a.IMPRESSION_IN_PROGRESS) {
            return null;
        }
        z1 A0 = com.bumptech.glide.d.A0(z1Var, new u00.e(this, 15));
        nx.q qVar = this.impressionDisplayState.f20693a.f92380b;
        HashMap b13 = qVar != null ? qVar.b() : new HashMap();
        b0 pinAuxHelper = getPinAuxHelper();
        f30 f30Var = this.deprecatedPin;
        pinAuxHelper.getClass();
        b0.f(f30Var, b13);
        this.eventIntake.a(new ni1.v1(new ek1.x(A0)));
        c0 c0Var = new c0(A0, nx.c.a(this.impressionDisplayState.f20693a, bs1.c.o2(b13)));
        this.impressionDisplayState = new az.b();
        return c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaPinRep(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.trafficSource = "unknown";
        this.pinSpec = new m(0, 0, 0, 0, (c1) null, 63);
        this.pinRepPieces = new ArrayList();
        this.priorMediaVisibility = l.LessThan50PercentVisible;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.isRTL = j1.Y0(context2);
        this.isHideSupported = true;
        this.lastProcessedClickthroughAction = bk1.k.f23247a;
        this.appliedCornerRadius = new u50.b0(eo1.c.lego_corner_radius_medium);
        this.columnIndexForLogging = -1;
        this.pinPosition = -1;
        this.piecesRequiringImageDimensions = q0.f80391a;
        this.lastKnownParentView = "";
        this.parentHierarchy = "";
        this.currentDisplayState = new u0(null, 0, null, 2097151);
        this.legacyGestureContract = new y(this);
        this.legacyGestureListener = xk2.m.b(new v(this, 14));
        this.gestureDetector = xk2.m.b(new v(this, 11));
        this.componentType = g0.FLOWED_PIN;
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.pinalytics = a13;
        int i13 = e0.f90644c;
        this.gridCardPadding = i13;
        Paint paint = new Paint();
        Context context3 = getContext();
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context3.getColor(i14));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        setClickable(true);
        xk2.n nVar = xk2.n.NONE;
        this.pinImagePiece = s1.i(this, 17, nVar);
        this.attributionBadgeIndicator = s1.i(this, 0, nVar);
        this.indicator = s1.i(this, 13, nVar);
        this.fullscreenIndicator = s1.i(this, 10, nVar);
        this.audioIndicator = s1.i(this, 1, nVar);
        this.deletedIdeaPinPlaceholder = s1.i(this, 5, nVar);
        this.creatorStatsPiece = s1.i(this, 3, nVar);
        this.pinTextWithIcon = s1.i(this, 19, nVar);
        this.promoText = s1.i(this, 20, nVar);
        this.sbaUserAttribution = new i(this, getResources().getDimensionPixelSize(i13));
        this.textPieces = new LinkedHashMap();
        this.pinReactions = s1.i(this, 18, nVar);
        this.sbaPinRating = s1.i(this, 21, nVar);
        this.videoStatusOverlay = s1.i(this, 23, nVar);
        this.skinToneSignalOverlay = s1.i(this, 22, nVar);
        this.endFrame = s1.i(this, 8, nVar);
        this.favoriteButton = s1.i(this, 9, nVar);
        this.boardPinAttribution = s1.i(this, 2, nVar);
        this.pinChips = s1.i(this, 16, nVar);
        this.overflow = s1.i(this, 15, nVar);
        this.dealBadgeCornerIndicator = s1.i(this, 4, nVar);
        this.dynamicBadgeIndicator = s1.i(this, 7, nVar);
        this.dlAdCloseupOverlay = s1.i(this, 6, nVar);
        this.clickThroughHelper = getClickThroughHelperFactory().a(getPinalytics());
        this.impressionDisplayState = new az.b();
        this.internalCell = this;
        this.shouldTrackPWT = true;
        this.eventIntake = new q2(this, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbaPinRep(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.trafficSource = "unknown";
        this.pinSpec = new m(0, 0, 0, 0, (c1) null, 63);
        this.pinRepPieces = new ArrayList();
        this.priorMediaVisibility = l.LessThan50PercentVisible;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.isRTL = j1.Y0(context2);
        this.isHideSupported = true;
        this.lastProcessedClickthroughAction = bk1.k.f23247a;
        this.appliedCornerRadius = new u50.b0(eo1.c.lego_corner_radius_medium);
        this.columnIndexForLogging = -1;
        this.pinPosition = -1;
        this.piecesRequiringImageDimensions = q0.f80391a;
        this.lastKnownParentView = "";
        this.parentHierarchy = "";
        this.currentDisplayState = new u0(null, 0, null, 2097151);
        this.legacyGestureContract = new y(this);
        this.legacyGestureListener = xk2.m.b(new v(this, 14));
        this.gestureDetector = xk2.m.b(new v(this, 11));
        this.componentType = g0.FLOWED_PIN;
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.pinalytics = a13;
        int i14 = e0.f90644c;
        this.gridCardPadding = i14;
        Paint paint = new Paint();
        Context context3 = getContext();
        int i15 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context3.getColor(i15));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        setClickable(true);
        xk2.n nVar = xk2.n.NONE;
        this.pinImagePiece = s1.i(this, 17, nVar);
        this.attributionBadgeIndicator = s1.i(this, 0, nVar);
        this.indicator = s1.i(this, 13, nVar);
        this.fullscreenIndicator = s1.i(this, 10, nVar);
        this.audioIndicator = s1.i(this, 1, nVar);
        this.deletedIdeaPinPlaceholder = s1.i(this, 5, nVar);
        this.creatorStatsPiece = s1.i(this, 3, nVar);
        this.pinTextWithIcon = s1.i(this, 19, nVar);
        this.promoText = s1.i(this, 20, nVar);
        this.sbaUserAttribution = new i(this, getResources().getDimensionPixelSize(i14));
        this.textPieces = new LinkedHashMap();
        this.pinReactions = s1.i(this, 18, nVar);
        this.sbaPinRating = s1.i(this, 21, nVar);
        this.videoStatusOverlay = s1.i(this, 23, nVar);
        this.skinToneSignalOverlay = s1.i(this, 22, nVar);
        this.endFrame = s1.i(this, 8, nVar);
        this.favoriteButton = s1.i(this, 9, nVar);
        this.boardPinAttribution = s1.i(this, 2, nVar);
        this.pinChips = s1.i(this, 16, nVar);
        this.overflow = s1.i(this, 15, nVar);
        this.dealBadgeCornerIndicator = s1.i(this, 4, nVar);
        this.dynamicBadgeIndicator = s1.i(this, 7, nVar);
        this.dlAdCloseupOverlay = s1.i(this, 6, nVar);
        this.clickThroughHelper = getClickThroughHelperFactory().a(getPinalytics());
        this.impressionDisplayState = new az.b();
        this.internalCell = this;
        this.shouldTrackPWT = true;
        this.eventIntake = new q2(this, 1);
    }
}
