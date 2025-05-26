package qq2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.u;
import df.j1;
import ja.c0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.f0;
import m7.i;
import m7.i0;
import nd.l;
import nd.o;
import nl.g;
import nx.z0;
import o7.j;
import org.json.JSONException;
import org.json.JSONObject;
import pd.d0;
import pd.s;
import q5.a2;
import q5.v;
import q5.v0;
import qm2.q;
import rm2.l0;
import t3.s1;
import tb0.h;
import x02.x0;

/* loaded from: classes2.dex */
public final class c implements v, o, xg.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104882a;

    /* renamed from: b, reason: collision with root package name */
    public Object f104883b;

    /* renamed from: c, reason: collision with root package name */
    public Object f104884c;

    public c() {
        ih.c cVar = ih.c.f72257d;
        this.f104882a = 10;
        this.f104883b = new SparseIntArray();
        this.f104884c = cVar;
    }

    public final void a(Enum r23, Object obj) {
        ((Map) this.f104883b).put(r23, obj);
        ((Map) this.f104884c).put(obj, r23);
    }

    public final d0 b() {
        return new d0(Collections.unmodifiableMap((Map) this.f104883b), Collections.unmodifiableMap((Map) this.f104884c));
    }

    public final void c() {
        this.f104883b = null;
        this.f104884c = null;
    }

    public final void d(i iVar) {
        synchronized (iVar) {
        }
        Object obj = this.f104883b;
        if (((Handler) obj) != null) {
            ((Handler) obj).post(new j(this, iVar, 1));
        }
    }

    @Override // nd.o
    public final nd.c e(l lVar) {
        return ((o) this.f104884c).e(lVar);
    }

    public final boolean f() {
        return ((File) this.f104883b).exists() || ((File) this.f104884c).exists();
    }

    public final void g(String name, Function1 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Map map = ((c0) this.f104884c).f75176a;
        qm2.o oVar = new qm2.o(this, name);
        block.invoke(oVar);
        String internalName = (String) this.f104883b;
        ArrayList arrayList = oVar.f104435b;
        ArrayList parameters = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parameters.add((String) ((Pair) it.next()).f80346a);
        }
        String ret = (String) oVar.f104436c.f80346a;
        String name2 = oVar.f104434a;
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ret, "ret");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(name2);
        sb3.append('(');
        sb3.append(CollectionsKt.Z(parameters, "", null, null, 0, null, l0.f108751i, 30));
        sb3.append(')');
        if (ret.length() > 1) {
            ret = s1.b("L", ret, ';');
        }
        sb3.append(ret);
        String jvmDescriptor = sb3.toString();
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        String str = internalName + '.' + jvmDescriptor;
        q qVar = (q) oVar.f104436c.f80347b;
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((q) ((Pair) it2.next()).f80347b);
        }
        map.put(str, new qm2.j(qVar, arrayList2));
    }

    public final File h() {
        if (((File) this.f104883b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f104883b) == null) {
                        g gVar = (g) this.f104884c;
                        gVar.b();
                        this.f104883b = new File(gVar.f91217a.getFilesDir(), "PersistedInstallation." + ((g) this.f104884c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f104883b;
    }

    public final synchronized List i(String str) {
        List list;
        try {
            if (!((List) this.f104883b).contains(str)) {
                ((List) this.f104883b).add(str);
            }
            list = (List) ((Map) this.f104884c).get(str);
            if (list == null) {
                list = new ArrayList();
                ((Map) this.f104884c).put(str, list);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return list;
    }

    public final synchronized ArrayList j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f104883b).iterator();
        while (it.hasNext()) {
            List<ce.c> list = (List) ((Map) this.f104884c).get((String) it.next());
            if (list != null) {
                for (ce.c cVar : list) {
                    if (cVar.f27579a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f27580b) && !arrayList.contains(cVar.f27580b)) {
                        arrayList.add(cVar.f27580b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        a2 j13 = v0.j(view, a2Var);
        if (j13.f102400a.m()) {
            return j13;
        }
        Rect rect = (Rect) this.f104883b;
        rect.left = j13.c();
        rect.top = j13.e();
        rect.right = j13.d();
        rect.bottom = j13.b();
        int childCount = ((ViewPager) this.f104884c).getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            a2 c13 = v0.c(((ViewPager) this.f104884c).getChildAt(i13), j13);
            rect.left = Math.min(c13.c(), rect.left);
            rect.top = Math.min(c13.e(), rect.top);
            rect.right = Math.min(c13.d(), rect.right);
            rect.bottom = Math.min(c13.b(), rect.bottom);
        }
        return j13.g(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // nd.d
    public final boolean l(Object obj, File file, l lVar) {
        return ((o) this.f104884c).l(new wd.c(((BitmapDrawable) ((pd.g0) obj).get()).getBitmap(), (qd.d) this.f104883b), file, lVar);
    }

    public final void m(em.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f59571a);
            jSONObject.put("Status", aVar.f59572b.ordinal());
            jSONObject.put("AuthToken", aVar.f59573c);
            jSONObject.put("RefreshToken", aVar.f59574d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f59576f);
            jSONObject.put("ExpiresInSecs", aVar.f59575e);
            jSONObject.put("FisError", aVar.f59577g);
            g gVar = (g) this.f104884c;
            gVar.b();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f91217a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(h())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // xg.d
    public final void n(wg.c cVar, TaskCompletionSource taskCompletionSource) {
        cVar.u((Bundle) this.f104884c, new xg.l((xg.e) this.f104883b, taskCompletionSource));
    }

    public final void o(Uri uri, List segments, x0 boardRepository, qr.d loadBoardObserver) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(loadBoardObserver, "loadBoardObserver");
        ArrayList H0 = CollectionsKt.H0(segments);
        if (Intrinsics.d(H0.get(0), "amp")) {
            H0.remove(0);
        }
        String boardId = H0.size() == 1 ? (String) H0.get(0) : j1.V("%s/%s", H0.get(0), H0.get(1));
        HashSet hashSet = h.f117076w;
        tb0.g.f117075a.h("Board DL Uri: " + uri);
        if (!((b60.d) ((b60.b) this.f104884c)).i()) {
            sr.d dVar = ((qr.h) this.f104883b).f104944e;
            dVar.f115045b.a("unauth_board_deeplink");
            Context context = kb0.a.f79058b;
            Intent i13 = ((lu1.c) dVar.f115046c).i(f0.W());
            i13.putExtra("com.pinterest.EXTRA_BOARD_ID", boardId);
            i13.putExtra("com.pinterest.EXTRA_CONTEXTUAL_LOGIN", uri.toString());
            dVar.f115044a.startActivity(i13);
            ((qr.h) this.f104883b).q();
            return;
        }
        if (StringsKt.h0(boardId) == null) {
            boardRepository.Q(boardId).s().p(loadBoardObserver);
            return;
        }
        qr.h hVar = (qr.h) this.f104883b;
        boolean f13 = hVar.f104943d.f();
        boolean T0 = j1.T0(uri);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        sr.d dVar2 = hVar.f104944e;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        dVar2.a(boardId, f13, T0, false, false);
        ((qr.h) this.f104883b).a(false);
        ((qr.h) this.f104883b).q();
    }

    public final FileInputStream p() {
        if (((File) this.f104884c).exists()) {
            ((File) this.f104883b).delete();
            ((File) this.f104884c).renameTo((File) this.f104883b);
        }
        return new FileInputStream((File) this.f104883b);
    }

    public final em.a q() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(h());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        em.c cVar = em.c.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", cVar.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i13 = em.a.f59570h;
        s sVar = new s();
        sVar.f99752f = 0L;
        sVar.k(cVar);
        sVar.f99751e = 0L;
        sVar.f99747a = optString;
        sVar.k(em.c.values()[optInt]);
        sVar.f99749c = optString2;
        sVar.f99750d = optString3;
        sVar.f99752f = Long.valueOf(optLong);
        sVar.f99751e = Long.valueOf(optLong2);
        sVar.f99753g = optString4;
        return sVar.g();
    }

    public final void r(String str) {
        rd.d dVar;
        synchronized (this) {
            try {
                Object obj = ((Map) this.f104883b).get(str);
                d7.b.p(obj, "Argument must not be null");
                dVar = (rd.d) obj;
                int i13 = dVar.f107496b;
                if (i13 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + dVar.f107496b);
                }
                int i14 = i13 - 1;
                dVar.f107496b = i14;
                if (i14 == 0) {
                    rd.d dVar2 = (rd.d) ((Map) this.f104883b).remove(str);
                    if (!dVar2.equals(dVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + dVar + ", but actually removed: " + dVar2 + ", safeKey: " + str);
                    }
                    rd.e eVar = (rd.e) this.f104884c;
                    synchronized (eVar.f107497a) {
                        try {
                            if (eVar.f107497a.size() < 10) {
                                eVar.f107497a.offer(dVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        dVar.f107495a.unlock();
    }

    public final d7.a s() {
        if (((File) this.f104883b).exists()) {
            if (((File) this.f104884c).exists()) {
                ((File) this.f104883b).delete();
            } else if (!((File) this.f104883b).renameTo((File) this.f104884c)) {
                u.g("AtomicFile", "Couldn't rename file " + ((File) this.f104883b) + " to backup file " + ((File) this.f104884c));
            }
        }
        try {
            return new d7.a((File) this.f104883b);
        } catch (FileNotFoundException e13) {
            File parentFile = ((File) this.f104883b).getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + ((File) this.f104883b), e13);
            }
            try {
                return new d7.a((File) this.f104883b);
            } catch (FileNotFoundException e14) {
                throw new IOException("Couldn't create " + ((File) this.f104883b), e14);
            }
        }
    }

    public final int t(Context context, com.google.android.gms.common.api.c cVar) {
        com.bumptech.glide.d.t(context);
        com.bumptech.glide.d.t(cVar);
        int i13 = 0;
        if (!cVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = cVar.getMinApkVersion();
        int i14 = ((SparseIntArray) this.f104883b).get(minApkVersion, -1);
        if (i14 == -1) {
            int i15 = 0;
            while (true) {
                if (i15 >= ((SparseIntArray) this.f104883b).size()) {
                    i13 = -1;
                    break;
                }
                int keyAt = ((SparseIntArray) this.f104883b).keyAt(i15);
                if (keyAt > minApkVersion && ((SparseIntArray) this.f104883b).get(keyAt) == 0) {
                    break;
                }
                i15++;
            }
            i14 = i13 == -1 ? ((ih.d) this.f104884c).c(context, minApkVersion) : i13;
            ((SparseIntArray) this.f104883b).put(minApkVersion, i14);
        }
        return i14;
    }

    public final String toString() {
        switch (this.f104882a) {
            case 11:
                return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", (List) this.f104883b, (List) this.f104884c);
            default:
                return super.toString();
        }
    }

    public final void u() {
        ((SparseIntArray) this.f104883b).clear();
    }

    public c(int i13) {
        this.f104882a = i13;
        if (i13 == 6) {
            this.f104883b = new HashMap();
            this.f104884c = new rd.e(0);
        } else if (i13 == 8) {
            this.f104883b = new ArrayList();
            this.f104884c = new HashMap();
        } else {
            if (i13 != 12) {
                return;
            }
            this.f104883b = new HashMap();
            this.f104884c = new HashMap();
        }
    }

    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        this.f104882a = i13;
        this.f104883b = obj;
        this.f104884c = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(n60.o oVar) {
        this(12);
        this.f104882a = 12;
    }

    public /* synthetic */ c(tb.l lVar) {
        this.f104882a = 11;
        this.f104883b = new ArrayList((List) lVar.f116986b);
        this.f104884c = new ArrayList((List) lVar.f116987c);
    }

    public c(z0 auxData, String str) {
        this.f104882a = 15;
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f104883b = auxData;
        this.f104884c = str;
    }

    public c(lb0.q prefsManagerPersisted, m60.e applicationInfo) {
        this.f104882a = 16;
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f104883b = prefsManagerPersisted;
        this.f104884c = applicationInfo;
    }

    public c(Object obj) {
        this.f104882a = 18;
        this.f104883b = obj;
        this.f104884c = Thread.currentThread();
    }

    public c(qr.h webhookDeepLinkUtil, b60.b activeUserManager) {
        this.f104882a = 14;
        Intrinsics.checkNotNullParameter(webhookDeepLinkUtil, "webhookDeepLinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f104883b = webhookDeepLinkUtil;
        this.f104884c = activeUserManager;
    }

    public c(File file) {
        this.f104882a = 1;
        this.f104883b = file;
        this.f104884c = new File(file.getPath() + ".bak");
    }

    public c(g gVar) {
        this.f104882a = 13;
        this.f104884c = gVar;
    }

    public c(Handler handler, i0 i0Var) {
        this.f104882a = 3;
        this.f104883b = handler;
        this.f104884c = i0Var;
    }

    public c(c0 c0Var, String className) {
        this.f104882a = 17;
        Intrinsics.checkNotNullParameter(className, "className");
        this.f104884c = c0Var;
        this.f104883b = className;
    }

    public c(ViewPager viewPager) {
        this.f104882a = 4;
        this.f104884c = viewPager;
        this.f104883b = new Rect();
    }

    public c(pd.o oVar, nd.a aVar) {
        this.f104882a = 5;
        this.f104884c = oVar;
        this.f104883b = aVar;
    }
}
