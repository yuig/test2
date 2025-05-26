package t5;

import a7.j;
import a7.n0;
import ab.f;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.e2;
import androidx.recyclerview.widget.e3;
import androidx.recyclerview.widget.q0;
import androidx.room.EmptyResultSetException;
import com.google.common.util.concurrent.w;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d9.i;
import g7.g;
import g8.c1;
import g8.d1;
import g8.m1;
import g8.s;
import java.io.EOFException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import l0.k;
import l7.h0;
import l8.y;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q8.j0;
import q8.t;
import r5.p;
import t7.n;
import ua.v;
import uj2.e0;
import x7.m;

/* loaded from: classes3.dex */
public final class e implements p, h0, m8.b, c1, m, y, w, e2, e3, e0, v, WebMessageListenerBoundaryInterface, bb.m, WebViewStartUpCallbackBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    public static Class f116422c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f116423d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f116424e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f116425f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f116426g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f116427h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116428a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f116429b;

    public e(int i13) {
        this.f116428a = i13;
        if (i13 == 15) {
            this.f116429b = new d0(10);
            return;
        }
        try {
            this.f116429b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e13) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e13);
        }
    }

    public static void r() {
        if (f116423d) {
            return;
        }
        try {
            f116422c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e13) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e13);
        }
        f116423d = true;
    }

    @Override // bb.m
    public final void a(f fVar, a8.v vVar) {
        ((WebViewProviderFactoryBoundaryInterface) this.f116429b).startUpWebView(new lp2.a(new bb.p(fVar, 0)), new lp2.a(new e(vVar, 29)));
    }

    @Override // x7.m
    public final void b(int i13, k7.c cVar, long j13, int i14) {
        ((MediaCodec) this.f116429b).queueSecureInputBuffer(i13, 0, cVar.f78450i, j13, i14);
    }

    @Override // x7.m
    public final void c(Bundle bundle) {
        ((MediaCodec) this.f116429b).setParameters(bundle);
    }

    @Override // bb.m
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) lp2.b.b(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f116429b).createWebView(webView));
    }

    @Override // x7.m
    public final void d(int i13, int i14, int i15, long j13) {
        ((MediaCodec) this.f116429b).queueInputBuffer(i13, 0, i14, j13, i15);
    }

    @Override // ua.v
    public final void f(View view, ViewGroup viewGroup) {
    }

    @Override // x7.m
    public final void flush() {
    }

    @Override // uj2.e0
    public final void g(kk2.a aVar) {
        try {
            aVar.b(((Callable) this.f116429b).call());
        } catch (EmptyResultSetException e13) {
            aVar.c(e13);
        }
    }

    @Override // bb.m
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) lp2.b.b(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f116429b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // x7.m
    public final void h() {
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        n nVar = (n) this.f116429b;
        nVar.f116541t.i(nVar);
    }

    @Override // l8.y
    public final Object k(Uri uri, g gVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f116429b).newPullParser();
            newPullParser.setInput(gVar, null);
            return (e8.c) new e8.g(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e13) {
            throw ParserException.b(null, e13);
        }
    }

    @Override // r5.p
    public final boolean l(View view) {
        ((DrawerLayout) this.f116429b).getClass();
        if (!DrawerLayout.k(view) || ((DrawerLayout) this.f116429b).g(view) == 2) {
            return false;
        }
        ((DrawerLayout) this.f116429b).b(view, true);
        return true;
    }

    @Override // androidx.recyclerview.widget.e2
    public final int n(int i13, int i14) {
        q0 q0Var = (q0) this.f116429b;
        View view = q0Var.f19590v;
        if (view == null) {
            return i14;
        }
        int i15 = q0Var.f19591w;
        if (i15 == -1) {
            i15 = q0Var.f19585q.indexOfChild(view);
            ((q0) this.f116429b).f19591w = i15;
        }
        return i14 == i13 + (-1) ? i15 : i14 < i15 ? i14 : i14 + 1;
    }

    @Override // bb.m
    public final String[] o() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f116429b).getSupportedFeatures();
    }

    @Override // com.google.common.util.concurrent.w
    public final void onFailure(Throwable th3) {
        ((s) this.f116429b).getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = lp2.b.b(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            t5.e[] r1 = new t5.e[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L1f
            t5.e r3 = new t5.e
            r4 = r0[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1f:
            bb.b r0 = bb.k.f22453a
            boolean r0 = r0.b()
            if (r0 == 0) goto L54
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = lp2.b.b(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L4a
            r1 = 1
            if (r0 == r1) goto L3f
            r9 = 0
            r3 = r9
            goto L5e
        L3f:
            ab.b r0 = new ab.b
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L48:
            r3 = r0
            goto L5e
        L4a:
            ab.b r0 = new ab.b
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L48
        L54:
            ab.b r0 = new ab.b
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L48
        L5e:
            if (r3 == 0) goto L80
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = lp2.b.b(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            a.k1 r12 = new a.k1
            r0 = 3
            r12.<init>(r9, r0)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            bb.f r6 = (bb.f) r6
            java.lang.Object r9 = r7.f116429b
            r1 = r9
            ads_mobile_sdk.j21 r1 = (ads_mobile_sdk.j21) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.e.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public final void onSuccess(InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) lp2.b.b(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        ((ab.d) this.f116429b).onSuccess(new bb.n(webViewStartUpResultBoundaryInterface));
    }

    public final void p(int i13, int i14, t tVar) {
        h9.c cVar;
        h9.c cVar2;
        h9.c cVar3;
        long j13;
        int i15;
        int i16;
        int i17;
        h9.d dVar = (h9.d) this.f116429b;
        SparseArray sparseArray = dVar.f68201c;
        int i18 = 4;
        int i19 = 1;
        int i23 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 165) {
                if (dVar.f68196J != 2) {
                    return;
                }
                h9.c cVar4 = (h9.c) sparseArray.get(dVar.P);
                if (dVar.S != 4 || !"V_VP9".equals(cVar4.f68166c)) {
                    tVar.p(i14);
                    return;
                }
                d0 d0Var = dVar.f68217p;
                d0Var.H(i14);
                tVar.readFully(d0Var.f53806a, 0, i14);
                return;
            }
            if (i13 == 16877) {
                dVar.e(i13);
                h9.c cVar5 = dVar.f68225x;
                int i24 = cVar5.f68171h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    tVar.p(i14);
                    return;
                }
                byte[] bArr = new byte[i14];
                cVar5.P = bArr;
                tVar.readFully(bArr, 0, i14);
                return;
            }
            if (i13 == 16981) {
                dVar.e(i13);
                h9.c cVar6 = dVar.f68225x;
                byte[] bArr2 = new byte[i14];
                cVar6.f68173j = bArr2;
                tVar.readFully(bArr2, 0, i14);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr3 = new byte[i14];
                tVar.readFully(bArr3, 0, i14);
                dVar.e(i13);
                dVar.f68225x.f68174k = new j0(1, 0, 0, bArr3);
                return;
            }
            if (i13 == 21419) {
                d0 d0Var2 = dVar.f68212k;
                Arrays.fill(d0Var2.f53806a, (byte) 0);
                tVar.readFully(d0Var2.f53806a, 4 - i14, i14);
                d0Var2.K(0);
                dVar.f68227z = (int) d0Var2.A();
                return;
            }
            if (i13 == 25506) {
                dVar.e(i13);
                h9.c cVar7 = dVar.f68225x;
                byte[] bArr4 = new byte[i14];
                cVar7.f68175l = bArr4;
                tVar.readFully(bArr4, 0, i14);
                return;
            }
            if (i13 != 30322) {
                throw ParserException.a("Unexpected id: " + i13, null);
            }
            dVar.e(i13);
            h9.c cVar8 = dVar.f68225x;
            byte[] bArr5 = new byte[i14];
            cVar8.f68187x = bArr5;
            tVar.readFully(bArr5, 0, i14);
            return;
        }
        int i25 = dVar.f68196J;
        d0 d0Var3 = dVar.f68210i;
        if (i25 == 0) {
            h9.e eVar = dVar.f68199b;
            dVar.P = (int) eVar.c(tVar, false, true, 8);
            dVar.Q = eVar.f68231c;
            dVar.L = -9223372036854775807L;
            dVar.f68196J = 1;
            d0Var3.H(0);
        }
        h9.c cVar9 = (h9.c) sparseArray.get(dVar.P);
        if (cVar9 == null) {
            tVar.p(i14 - dVar.Q);
            dVar.f68196J = 0;
            return;
        }
        cVar9.Z.getClass();
        if (dVar.f68196J == 1) {
            dVar.k(tVar, 3);
            int i26 = (d0Var3.f53806a[2] & 6) >> 1;
            byte b13 = 255;
            if (i26 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i14 - dVar.Q) - 3;
            } else {
                dVar.k(tVar, 4);
                int i27 = (d0Var3.f53806a[3] & 255) + 1;
                dVar.N = i27;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                dVar.O = iArr2;
                if (i26 == 2) {
                    int i28 = (i14 - dVar.Q) - 4;
                    int i29 = dVar.N;
                    Arrays.fill(iArr2, 0, i29, i28 / i29);
                } else {
                    if (i26 != 1) {
                        if (i26 != 3) {
                            throw ParserException.a("Unexpected lacing value: " + i26, null);
                        }
                        int i33 = 0;
                        int i34 = 0;
                        while (true) {
                            int i35 = dVar.N - i19;
                            if (i33 >= i35) {
                                cVar2 = cVar9;
                                dVar.O[i35] = ((i14 - dVar.Q) - i18) - i34;
                                break;
                            }
                            dVar.O[i33] = i23;
                            int i36 = i18 + 1;
                            dVar.k(tVar, i36);
                            if (d0Var3.f53806a[i18] == 0) {
                                throw ParserException.a("No valid varint length mask found", null);
                            }
                            int i37 = i23;
                            while (true) {
                                if (i37 >= 8) {
                                    cVar3 = cVar9;
                                    j13 = 0;
                                    i18 = i36;
                                    break;
                                }
                                int i38 = i19 << (7 - i37);
                                if ((d0Var3.f53806a[i18] & i38) != 0) {
                                    int i39 = i36 + i37;
                                    dVar.k(tVar, i39);
                                    cVar3 = cVar9;
                                    j13 = d0Var3.f53806a[i18] & b13 & (~i38);
                                    while (i36 < i39) {
                                        j13 = (j13 << 8) | (d0Var3.f53806a[i36] & 255);
                                        i36++;
                                        i39 = i39;
                                    }
                                    int i43 = i39;
                                    if (i33 > 0) {
                                        j13 -= (1 << ((i37 * 7) + 6)) - 1;
                                    }
                                    i18 = i43;
                                } else {
                                    i37++;
                                    b13 = 255;
                                    i19 = 1;
                                }
                            }
                            if (j13 < -2147483648L || j13 > 2147483647L) {
                                break;
                            }
                            int i44 = (int) j13;
                            int[] iArr3 = dVar.O;
                            if (i33 != 0) {
                                i44 += iArr3[i33 - 1];
                            }
                            iArr3[i33] = i44;
                            i34 += i44;
                            i33++;
                            cVar9 = cVar3;
                            b13 = 255;
                            i19 = 1;
                            i23 = 0;
                        }
                        throw ParserException.a("EBML lacing sample size out of range.", null);
                    }
                    int i45 = 0;
                    int i46 = 0;
                    while (true) {
                        i15 = dVar.N - 1;
                        if (i45 >= i15) {
                            break;
                        }
                        dVar.O[i45] = 0;
                        while (true) {
                            i16 = i18 + 1;
                            dVar.k(tVar, i16);
                            int i47 = d0Var3.f53806a[i18] & 255;
                            int[] iArr4 = dVar.O;
                            i17 = iArr4[i45] + i47;
                            iArr4[i45] = i17;
                            if (i47 != 255) {
                                break;
                            } else {
                                i18 = i16;
                            }
                        }
                        i46 += i17;
                        i45++;
                        i18 = i16;
                    }
                    dVar.O[i15] = ((i14 - dVar.Q) - i18) - i46;
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = d0Var3.f53806a;
            dVar.K = dVar.m((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.E;
            cVar = cVar2;
            dVar.R = (cVar.f68168e == 2 || (i13 == 163 && (d0Var3.f53806a[2] & 128) == 128)) ? 1 : 0;
            dVar.f68196J = 2;
            dVar.M = 0;
        } else {
            cVar = cVar9;
        }
        if (i13 == 163) {
            while (true) {
                int i48 = dVar.M;
                if (i48 >= dVar.N) {
                    dVar.f68196J = 0;
                    return;
                }
                dVar.g(cVar, ((dVar.M * cVar.f68169f) / 1000) + dVar.K, dVar.R, dVar.n(tVar, cVar, dVar.O[i48], false), 0);
                dVar.M++;
                cVar = cVar;
            }
        } else {
            h9.c cVar10 = cVar;
            while (true) {
                int i49 = dVar.M;
                if (i49 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i49] = dVar.n(tVar, cVar10, iArr5[i49], true);
                dVar.M++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.e3
    public final long q(long j13) {
        switch (this.f116428a) {
            case 21:
                return -1L;
            default:
                return j13;
        }
    }

    public final void s(int i13, double d2) {
        h9.d dVar = (h9.d) this.f116429b;
        if (i13 == 181) {
            dVar.e(i13);
            dVar.f68225x.S = (int) d2;
        }
        if (i13 == 17545) {
            dVar.f68222u = (long) d2;
            return;
        }
        switch (i13) {
            case 21969:
                dVar.e(i13);
                dVar.f68225x.F = (float) d2;
                break;
            case 21970:
                dVar.e(i13);
                dVar.f68225x.G = (float) d2;
                break;
            case 21971:
                dVar.e(i13);
                dVar.f68225x.H = (float) d2;
                break;
            case 21972:
                dVar.e(i13);
                dVar.f68225x.I = (float) d2;
                break;
            case 21973:
                dVar.e(i13);
                dVar.f68225x.f68162J = (float) d2;
                break;
            case 21974:
                dVar.e(i13);
                dVar.f68225x.K = (float) d2;
                break;
            case 21975:
                dVar.e(i13);
                dVar.f68225x.L = (float) d2;
                break;
            case 21976:
                dVar.e(i13);
                dVar.f68225x.M = (float) d2;
                break;
            case 21977:
                dVar.e(i13);
                dVar.f68225x.N = (float) d2;
                break;
            case 21978:
                dVar.e(i13);
                dVar.f68225x.O = (float) d2;
                break;
            default:
                switch (i13) {
                    case 30323:
                        dVar.e(i13);
                        dVar.f68225x.f68184u = (float) d2;
                        break;
                    case 30324:
                        dVar.e(i13);
                        dVar.f68225x.f68185v = (float) d2;
                        break;
                    case 30325:
                        dVar.e(i13);
                        dVar.f68225x.f68186w = (float) d2;
                        break;
                    default:
                        dVar.getClass();
                        break;
                }
        }
    }

    @Override // ua.v
    public final void setVisibility(int i13) {
        ((View) this.f116429b).setVisibility(i13);
    }

    @Override // x7.m
    public final void shutdown() {
    }

    @Override // x7.m
    public final void start() {
    }

    public final int t(int i13) {
        ((h9.d) this.f116429b).getClass();
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
            case RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER /* 215 */:
            case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL /* 134 */:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE /* 166 */:
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP /* 183 */:
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD /* 187 */:
            case RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL /* 224 */:
            case RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER /* 161 */:
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM /* 163 */:
            case RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final void u(int i13, long j13) {
        h9.d dVar = (h9.d) this.f116429b;
        dVar.getClass();
        if (i13 == 20529) {
            if (j13 == 0) {
                return;
            }
            throw ParserException.a("ContentEncodingOrder " + j13 + " not supported", null);
        }
        if (i13 == 20530) {
            if (j13 == 1) {
                return;
            }
            throw ParserException.a("ContentEncodingScope " + j13 + " not supported", null);
        }
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL /* 131 */:
                dVar.e(i13);
                dVar.f68225x.f68168e = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL /* 136 */:
                dVar.e(i13);
                dVar.f68225x.X = j13 == 1;
                return;
            case RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER /* 155 */:
                dVar.L = dVar.m(j13);
                return;
            case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER /* 159 */:
                dVar.e(i13);
                dVar.f68225x.Q = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN /* 176 */:
                dVar.e(i13);
                dVar.f68225x.f68177n = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN /* 179 */:
                dVar.c(i13);
                dVar.F.g(dVar.m(j13));
                return;
            case RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE /* 186 */:
                dVar.e(i13);
                dVar.f68225x.f68178o = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER /* 215 */:
                dVar.e(i13);
                dVar.f68225x.f68167d = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER /* 231 */:
                dVar.E = dVar.m(j13);
                return;
            case RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER /* 238 */:
                dVar.S = (int) j13;
                return;
            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM /* 241 */:
                if (dVar.H) {
                    return;
                }
                dVar.c(i13);
                dVar.G.g(j13);
                dVar.H = true;
                return;
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE /* 251 */:
                dVar.T = true;
                return;
            case 16871:
                dVar.e(i13);
                dVar.f68225x.f68171h = (int) j13;
                return;
            case 16980:
                if (j13 == 3) {
                    return;
                }
                throw ParserException.a("ContentCompAlgo " + j13 + " not supported", null);
            case 17029:
                if (j13 < 1 || j13 > 2) {
                    throw ParserException.a("DocTypeReadVersion " + j13 + " not supported", null);
                }
                return;
            case 17143:
                if (j13 == 1) {
                    return;
                }
                throw ParserException.a("EBMLReadVersion " + j13 + " not supported", null);
            case 18401:
                if (j13 == 5) {
                    return;
                }
                throw ParserException.a("ContentEncAlgo " + j13 + " not supported", null);
            case 18408:
                if (j13 == 1) {
                    return;
                }
                throw ParserException.a("AESSettingsCipherMode " + j13 + " not supported", null);
            case 21420:
                dVar.A = j13 + dVar.f68220s;
                return;
            case 21432:
                int i14 = (int) j13;
                dVar.e(i13);
                if (i14 == 0) {
                    dVar.f68225x.f68188y = 0;
                    return;
                }
                if (i14 == 1) {
                    dVar.f68225x.f68188y = 2;
                    return;
                } else if (i14 == 3) {
                    dVar.f68225x.f68188y = 1;
                    return;
                } else {
                    if (i14 != 15) {
                        return;
                    }
                    dVar.f68225x.f68188y = 3;
                    return;
                }
            case 21680:
                dVar.e(i13);
                dVar.f68225x.f68180q = (int) j13;
                return;
            case 21682:
                dVar.e(i13);
                dVar.f68225x.f68182s = (int) j13;
                return;
            case 21690:
                dVar.e(i13);
                dVar.f68225x.f68181r = (int) j13;
                return;
            case 21930:
                dVar.e(i13);
                dVar.f68225x.W = j13 == 1;
                return;
            case 21938:
                dVar.e(i13);
                h9.c cVar = dVar.f68225x;
                cVar.f68189z = true;
                cVar.f68179p = (int) j13;
                return;
            case 21998:
                dVar.e(i13);
                dVar.f68225x.f68170g = (int) j13;
                return;
            case 22186:
                dVar.e(i13);
                dVar.f68225x.T = j13;
                return;
            case 22203:
                dVar.e(i13);
                dVar.f68225x.U = j13;
                return;
            case 25188:
                dVar.e(i13);
                dVar.f68225x.R = (int) j13;
                return;
            case 30114:
                dVar.U = j13;
                return;
            case 30321:
                dVar.e(i13);
                int i15 = (int) j13;
                if (i15 == 0) {
                    dVar.f68225x.f68183t = 0;
                    return;
                }
                if (i15 == 1) {
                    dVar.f68225x.f68183t = 1;
                    return;
                } else if (i15 == 2) {
                    dVar.f68225x.f68183t = 2;
                    return;
                } else {
                    if (i15 != 3) {
                        return;
                    }
                    dVar.f68225x.f68183t = 3;
                    return;
                }
            case 2352003:
                dVar.e(i13);
                dVar.f68225x.f68169f = (int) j13;
                return;
            case 2807729:
                dVar.f68221t = j13;
                return;
            default:
                switch (i13) {
                    case 21945:
                        dVar.e(i13);
                        int i16 = (int) j13;
                        if (i16 == 1) {
                            dVar.f68225x.C = 2;
                            return;
                        } else {
                            if (i16 != 2) {
                                return;
                            }
                            dVar.f68225x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.e(i13);
                        int i17 = j.i((int) j13);
                        if (i17 != -1) {
                            dVar.f68225x.B = i17;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.e(i13);
                        dVar.f68225x.f68189z = true;
                        int h10 = j.h((int) j13);
                        if (h10 != -1) {
                            dVar.f68225x.A = h10;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.e(i13);
                        dVar.f68225x.D = (int) j13;
                        return;
                    case 21949:
                        dVar.e(i13);
                        dVar.f68225x.E = (int) j13;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void v() {
        long j13;
        p7.j jVar = (p7.j) this.f116429b;
        synchronized (m8.c.f86527b) {
            try {
                j13 = m8.c.f86528c ? m8.c.f86529d : -9223372036854775807L;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int i13 = p7.j.R;
        jVar.M = j13;
        jVar.C(true);
    }

    public final void w() {
        Object obj = this.f116429b;
        n nVar = (n) obj;
        int i13 = nVar.f116542u - 1;
        nVar.f116542u = i13;
        if (i13 > 0) {
            return;
        }
        int i14 = 0;
        for (t7.t tVar : ((n) obj).f116544w) {
            tVar.i();
            i14 += tVar.I.f64348a;
        }
        a7.c1[] c1VarArr = new a7.c1[i14];
        int i15 = 0;
        for (t7.t tVar2 : ((n) this.f116429b).f116544w) {
            tVar2.i();
            int i16 = tVar2.I.f64348a;
            int i17 = 0;
            while (i17 < i16) {
                tVar2.i();
                c1VarArr[i15] = tVar2.I.a(i17);
                i17++;
                i15++;
            }
        }
        ((n) this.f116429b).f116543v = new m1(c1VarArr);
        Object obj2 = this.f116429b;
        ((n) obj2).f116541t.e((n) obj2);
    }

    public final n0 x(t tVar, a.e eVar) {
        n0 n0Var = null;
        int i13 = 0;
        while (true) {
            try {
                tVar.s(((d0) this.f116429b).f53806a, 0, 10);
                ((d0) this.f116429b).K(0);
                if (((d0) this.f116429b).B() != 4801587) {
                    break;
                }
                ((d0) this.f116429b).L(3);
                int x13 = ((d0) this.f116429b).x();
                int i14 = x13 + 10;
                if (n0Var == null) {
                    byte[] bArr = new byte[i14];
                    System.arraycopy(((d0) this.f116429b).f53806a, 0, bArr, 0, 10);
                    tVar.s(bArr, 10, x13);
                    n0Var = new i(eVar).c3(i14, bArr);
                } else {
                    tVar.m(x13);
                }
                i13 += i14;
            } catch (EOFException unused) {
            }
        }
        tVar.g();
        tVar.m(i13);
        return n0Var;
    }

    public final void y(int i13, long j13, long j14) {
        h9.d dVar = (h9.d) this.f116429b;
        bf.b.w(dVar.f68206e0);
        if (i13 == 160) {
            dVar.T = false;
            dVar.U = 0L;
            return;
        }
        if (i13 != 174) {
            if (i13 == 187) {
                dVar.H = false;
                return;
            }
            if (i13 == 19899) {
                dVar.f68227z = -1;
                dVar.A = -1L;
                return;
            }
            if (i13 == 20533) {
                dVar.e(i13);
                dVar.f68225x.f68172i = true;
                return;
            }
            if (i13 == 21968) {
                dVar.e(i13);
                dVar.f68225x.f68189z = true;
                return;
            }
            if (i13 == 408125543) {
                long j15 = dVar.f68220s;
                if (j15 != -1 && j15 != j13) {
                    throw ParserException.a("Multiple Segment elements not supported", null);
                }
                dVar.f68220s = j13;
                dVar.f68219r = j14;
                return;
            }
            if (i13 == 475249515) {
                dVar.F = new k(1);
                dVar.G = new k(1);
                return;
            } else {
                if (i13 == 524531317 && !dVar.f68226y) {
                    if (dVar.f68203d && dVar.C != -1) {
                        dVar.B = true;
                        return;
                    } else {
                        dVar.f68206e0.j(new q8.w(dVar.f68223v));
                        dVar.f68226y = true;
                        return;
                    }
                }
                return;
            }
        }
        h9.c cVar = new h9.c();
        cVar.f68177n = -1;
        cVar.f68178o = -1;
        cVar.f68179p = -1;
        cVar.f68180q = -1;
        cVar.f68181r = -1;
        cVar.f68182s = 0;
        cVar.f68183t = -1;
        cVar.f68184u = 0.0f;
        cVar.f68185v = 0.0f;
        cVar.f68186w = 0.0f;
        cVar.f68187x = null;
        cVar.f68188y = -1;
        cVar.f68189z = false;
        cVar.A = -1;
        cVar.B = -1;
        cVar.C = -1;
        cVar.D = 1000;
        cVar.E = 200;
        cVar.F = -1.0f;
        cVar.G = -1.0f;
        cVar.H = -1.0f;
        cVar.I = -1.0f;
        cVar.f68162J = -1.0f;
        cVar.K = -1.0f;
        cVar.L = -1.0f;
        cVar.M = -1.0f;
        cVar.N = -1.0f;
        cVar.O = -1.0f;
        cVar.Q = 1;
        cVar.R = -1;
        cVar.S = 8000;
        cVar.T = 0L;
        cVar.U = 0L;
        cVar.X = true;
        cVar.Y = "eng";
        dVar.f68225x = cVar;
        cVar.f68163a = dVar.f68224w;
    }

    public final void z(int i13, String str) {
        h9.d dVar = (h9.d) this.f116429b;
        dVar.getClass();
        if (i13 == 134) {
            dVar.e(i13);
            dVar.f68225x.f68166c = str;
            return;
        }
        if (i13 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                dVar.f68224w = str.equals("webm");
                return;
            }
            throw ParserException.a("DocType " + str + " not supported", null);
        }
        if (i13 == 21358) {
            dVar.e(i13);
            dVar.f68225x.f68165b = str;
        } else {
            if (i13 != 2274716) {
                return;
            }
            dVar.e(i13);
            dVar.f68225x.Y = str;
        }
    }

    @Override // com.google.common.util.concurrent.w
    public final void onSuccess(Object obj) {
        ((s) this.f116429b).getClass();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h9.d dVar) {
        this(dVar, 16);
        this.f116428a = 16;
    }

    public /* synthetic */ e(Object obj, int i13) {
        this.f116428a = i13;
        this.f116429b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar) {
        this(nVar, 9);
        this.f116428a = 9;
    }

    public e() {
        this.f116428a = 8;
        this.f116429b = new t7.e(5);
    }

    public e(InvocationHandler invocationHandler) {
        this.f116428a = 26;
        this.f116429b = (WebMessagePortBoundaryInterface) lp2.b.b(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
