package nd2;

import ae2.d;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import de2.f;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCalls;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig;
import io.embrace.android.embracesdk.internal.payload.UserInfo;
import java.io.File;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.a0;
import kh2.d1;
import kh2.i1;
import kh2.l3;
import kh2.m3;
import ki2.i;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kv0.p;
import mc2.k;
import okhttp3.Headers;
import okhttp3.Response;
import qg2.e;
import qg2.g;
import qg2.j;
import qg2.m;
import ue.c;
import ve.h;
import xk2.q;
import xk2.r;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90424i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f90425j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(0);
        this.f90424i = i13;
        this.f90425j = obj;
    }

    public final String b() {
        int i13 = this.f90424i;
        Object obj = this.f90425j;
        switch (i13) {
            case 9:
                return "Swap buffer error: " + ((f) obj).f54694a;
            case 10:
                return HiddenActivity$$ExternalSyntheticOutline0.m((Exception) obj, new StringBuilder("glError: "));
            case 15:
                int i14 = bg2.a.f22784h;
                ((bg2.a) obj).getClass();
                try {
                    q qVar = xk2.s.f135225b;
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                                return nextElement.getHostAddress();
                            }
                        }
                    }
                    Unit unit = Unit.f80348a;
                    q qVar2 = xk2.s.f135225b;
                } catch (Throwable th3) {
                    q qVar3 = xk2.s.f135225b;
                    c.m(th3);
                }
                return null;
            default:
                return ((uh2.a) ((uh2.b) obj)).a();
        }
    }

    public final Map e() {
        Headers headers;
        Map m13;
        int i13 = this.f90424i;
        Object obj = this.f90425j;
        switch (i13) {
            case 16:
                uh2.a aVar = (uh2.a) ((ig2.a) obj).f72243a;
                Map map = null;
                String string = aVar.f122252a.getString("io.embrace.session.properties", null);
                if (string != null) {
                    Object f13 = aVar.f122254c.f(Map.class, string);
                    Intrinsics.g(f13, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                    map = (Map) f13;
                }
                return map != null ? new HashMap(map) : new HashMap();
            default:
                Response response = (Response) obj;
                return (response == null || (headers = response.f95725f) == null || (m13 = z0.m(headers)) == null) ? z0.d() : m13;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f90424i;
        Object obj = this.f90425j;
        switch (i13) {
            case 2:
                return Boolean.valueOf(EGL14.eglDestroyContext(xd2.b.f134641a, (EGLContext) ((k) obj).f86945b));
            case 3:
                g01.a aVar = (g01.a) obj;
                return Boolean.valueOf(EGL14.eglDestroySurface((EGLDisplay) aVar.f63224a, (EGLSurface) aVar.f63225b));
            default:
                return Boolean.valueOf(((AtomicBoolean) ((p) obj).f80996c).get());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2;
        r rVar;
        Iterable iterable;
        List split$default;
        Map map;
        Map map2;
        Object obj3;
        int i13 = this.f90424i;
        String str = null;
        PendingApiCalls pendingApiCalls = null;
        Long valueOf = null;
        Object obj4 = this.f90425j;
        switch (i13) {
            case 0:
                m192invoke();
                return Unit.f80348a;
            case 1:
                m192invoke();
                return Unit.f80348a;
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                m192invoke();
                return Unit.f80348a;
            case 5:
                m192invoke();
                return Unit.f80348a;
            case 6:
                Bitmap bitmap = (Bitmap) obj4;
                d dVar = new d(h.C(bitmap));
                dVar.a();
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                return dVar;
            case 7:
                m192invoke();
                return Unit.f80348a;
            case 8:
                m192invoke();
                return Unit.f80348a;
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                m192invoke();
                return Unit.f80348a;
            case 12:
                m192invoke();
                return Unit.f80348a;
            case 13:
                m192invoke();
                return Unit.f80348a;
            case 14:
                yf2.c cVar = (yf2.c) obj4;
                String buildId = cVar.f139000a.getProject().getBuildId();
                InstrumentedConfig instrumentedConfig = cVar.f139000a;
                String buildType = instrumentedConfig.getProject().getBuildType();
                String buildFlavor = instrumentedConfig.getProject().getBuildFlavor();
                nf2.c resources = cVar.f139001b;
                Intrinsics.checkNotNullParameter(resources, "resources");
                String packageName = cVar.f139002c;
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                Intrinsics.checkNotNullParameter("emb_rn_bundle_id", "buildProperty");
                try {
                    String string = resources.f90490a.getResources().getString(resources.f90490a.getResources().getIdentifier("emb_rn_bundle_id", "string", packageName));
                    Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(id)");
                    str = string;
                } catch (Resources.NotFoundException unused) {
                } catch (NullPointerException e13) {
                    throw new IllegalArgumentException("No resource found for emb_rn_bundle_id property. Failed to create build info.", e13);
                }
                return new yf2.a(buildId, buildType, buildFlavor, str);
            case 15:
                return b();
            case 16:
                return e();
            case 17:
                uh2.b bVar = ((mg2.a) obj4).f87151a;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                try {
                    c0.d.M2("load-user-info-from-pref");
                    String string2 = ((uh2.a) bVar).f122252a.getString("io.embrace.userid", null);
                    String string3 = ((uh2.a) bVar).f122252a.getString("io.embrace.username", null);
                    String string4 = ((uh2.a) bVar).f122252a.getString("io.embrace.useremail", null);
                    HashSet hashSet = new HashSet();
                    Set<String> stringSet = ((uh2.a) bVar).f122252a.getStringSet("io.embrace.userpersonas", null);
                    if (stringSet != null) {
                        hashSet.addAll(stringSet);
                    }
                    hashSet.remove("payer");
                    uh2.a aVar = (uh2.a) bVar;
                    if (aVar.f122252a.getBoolean("io.embrace.userispayer", false)) {
                        hashSet.add("payer");
                    }
                    hashSet.remove("first_day");
                    long j13 = aVar.f122252a.getLong("io.embrace.installtimestamp", -1L);
                    if (j13 != -1) {
                        valueOf = Long.valueOf(j13);
                    }
                    if (valueOf != null && aVar.f122253b.now() - valueOf.longValue() <= 86400000) {
                        hashSet.add("first_day");
                    }
                    return new UserInfo(string2, string4, string3, hashSet);
                } finally {
                }
            case 18:
                qg2.a aVar2 = ((g) ((j) obj4).f103872b).f103862a;
                try {
                    q qVar = xk2.s.f135225b;
                    obj = (PendingApiCalls) ((e) aVar2).d("failed_api_calls.json", PendingApiCalls.class);
                } catch (Throwable th3) {
                    q qVar2 = xk2.s.f135225b;
                    obj = c.m(th3);
                }
                boolean z13 = obj instanceof r;
                Object obj5 = obj;
                if (z13) {
                    obj5 = null;
                }
                PendingApiCalls pendingApiCalls2 = (PendingApiCalls) obj5;
                if (pendingApiCalls2 == null) {
                    try {
                        obj2 = ((e) aVar2).e();
                    } catch (Throwable th4) {
                        q qVar3 = xk2.s.f135225b;
                        obj2 = c.m(th4);
                    }
                    boolean z14 = obj2 instanceof r;
                    Object obj6 = obj2;
                    if (z14) {
                        obj6 = null;
                    }
                    List list = (List) obj6;
                    if (list != null) {
                        m mVar = new m(new PendingApiCalls(z0.d()));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            mVar.a((PendingApiCall) it.next());
                        }
                        pendingApiCalls = new PendingApiCalls(new HashMap(mVar.f103879a));
                    }
                    pendingApiCalls2 = pendingApiCalls == null ? new PendingApiCalls(z0.d()) : pendingApiCalls;
                }
                return new m(pendingApiCalls2);
            case 19:
                return b();
            case 20:
                vg2.a aVar3 = (vg2.a) obj4;
                try {
                    c0.d.M2("load-config-from-store");
                    return aVar3.f125788a.a();
                } finally {
                }
            case 21:
                return e();
            case 22:
                return (InputStream) obj4;
            case 23:
                dh2.d dVar2 = (dh2.d) obj4;
                try {
                    q qVar4 = xk2.s.f135225b;
                    rVar = ((File) dVar2.f55024d.getValue()).listFiles();
                } catch (Throwable th5) {
                    q qVar5 = xk2.s.f135225b;
                    rVar = c.m(th5);
                }
                boolean z15 = rVar instanceof r;
                Object obj7 = rVar;
                if (z15) {
                    obj7 = null;
                }
                File[] fileArr = (File[]) obj7;
                if (fileArr == null || (iterable = c0.b0(fileArr)) == null) {
                    iterable = q0.f80391a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String filename = ((File) it2.next()).getName();
                    Intrinsics.checkNotNullExpressionValue(filename, "it.name");
                    Intrinsics.checkNotNullParameter(filename, "filename");
                    split$default = StringsKt__StringsKt.split$default(filename, new String[]{"_"}, false, 0, 6, null);
                    if (split$default.size() != 7) {
                        q qVar6 = xk2.s.f135225b;
                        obj3 = c.m(new IllegalArgumentException(a.a.j("Invalid filename: ", filename)));
                    } else {
                        yg2.e eVar = yg2.f.Companion;
                        String priority = (String) split$default.get(0);
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(priority, "priority");
                        map = yg2.f.valueMap;
                        yg2.f fVar = (yg2.f) map.get(priority);
                        if (fVar == null) {
                            q qVar7 = xk2.s.f135225b;
                            obj3 = c.m(new IllegalArgumentException(a.a.j("Invalid priority: ", filename)));
                        } else {
                            Long h03 = StringsKt.h0((String) split$default.get(1));
                            if (h03 != null) {
                                long longValue = h03.longValue();
                                String str2 = (String) split$default.get(2);
                                String str3 = (String) split$default.get(3);
                                Boolean g03 = StringsKt.g0((String) split$default.get(4));
                                if (g03 != null) {
                                    boolean booleanValue = g03.booleanValue();
                                    yg2.a aVar4 = yg2.b.Companion;
                                    String component = (String) split$default.get(5);
                                    aVar4.getClass();
                                    Intrinsics.checkNotNullParameter(component, "component");
                                    map2 = yg2.b.filenameMap;
                                    yg2.b bVar2 = (yg2.b) map2.get(component);
                                    if (bVar2 == null) {
                                        bVar2 = yg2.b.UNKNOWN;
                                    }
                                    yg2.b bVar3 = bVar2;
                                    q qVar8 = xk2.s.f135225b;
                                    obj3 = new yg2.d(longValue, str2, str3, fVar, booleanValue, bVar3);
                                } else {
                                    q qVar9 = xk2.s.f135225b;
                                    obj3 = c.m(new IllegalArgumentException(a.a.j("Invalid completeness state: ", filename)));
                                }
                            } else {
                                q qVar10 = xk2.s.f135225b;
                                obj3 = c.m(new IllegalArgumentException(a.a.j("Invalid timestamp: ", filename)));
                            }
                        }
                    }
                    boolean z16 = obj3 instanceof r;
                    Object obj8 = obj3;
                    if (z16) {
                        obj8 = null;
                    }
                    yg2.d dVar3 = (yg2.d) obj8;
                    if (dVar3 != null) {
                        arrayList.add(dVar3);
                    }
                }
                return new CopyOnWriteArraySet(arrayList);
            case 24:
                kh2.m mVar2 = (kh2.m) obj4;
                mVar2.getClass();
                vg2.c cVar2 = (vg2.c) mVar2.f79611d.a(mVar2, kh2.m.f79607g[3]);
                if (cVar2 != null) {
                    return cVar2;
                }
                throw new IllegalStateException("Required value was null.".toString());
            case 25:
                a0 a0Var = (a0) obj4;
                a0Var.getClass();
                return (jg2.d) a0Var.f79422d.a(a0Var, a0.f79418i[3]);
            case 26:
                return ((m3) ((l3) obj4)).d(i.f79816b);
            case 27:
                return new gi2.a(((d1) obj4).f79457c);
            case 28:
                return invoke();
            default:
                i1 i1Var = (i1) obj4;
                return (rh2.f) i1Var.f79533b.a(i1Var, i1.f79531h[1]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m192invoke() {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nd2.a.m192invoke():void");
    }
}
