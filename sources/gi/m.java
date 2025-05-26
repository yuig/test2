package gi;

import a.cb;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.google.firebase.encoders.EncodingException;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.s2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public class m implements tj.h, ik.d, ik.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65092a;

    /* renamed from: b, reason: collision with root package name */
    public Object f65093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f65094c;

    /* renamed from: d, reason: collision with root package name */
    public Object f65095d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m() {
        this(10, (Object) null);
        this.f65092a = 10;
    }

    public static y22.f E(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        y22.f fVar = null;
        if (board.O0()) {
            y22.d dVar = y22.f.Companion;
            Integer N0 = board.N0();
            Intrinsics.checkNotNullExpressionValue(N0, "getCollaboratorPermissionsSetting(...)");
            int intValue = N0.intValue();
            dVar.getClass();
            if (intValue == 0) {
                fVar = y22.f.ALL;
            } else if (intValue == 1) {
                fVar = y22.f.SAVE_ONLY;
            } else if (intValue == 2) {
                fVar = y22.f.REACTION;
            }
        }
        return fVar == null ? y22.f.SAVE_ONLY : fVar;
    }

    public static Pair G(TypeAheadItem... contact) {
        String k13;
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact.length == 0) {
            kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
            return new Pair(q0Var, q0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TypeAheadItem typeAheadItem : contact) {
            String A = typeAheadItem.A();
            if ((A != null && A.length() != 0) || ((k13 = typeAheadItem.k()) != null && k13.length() != 0)) {
                String A2 = typeAheadItem.A();
                String k14 = (A2 == null || A2.length() == 0) ? typeAheadItem.k() : typeAheadItem.A();
                if (k14 != null) {
                    if (tr1.b.c(k14)) {
                        arrayList2.add(k14);
                    } else {
                        arrayList.add(k14);
                    }
                }
            }
        }
        return new Pair(arrayList2, arrayList);
    }

    public static void w(m mVar, com.google.android.gms.internal.measurement.x xVar) {
        el.a.q2((long[]) mVar.f65093b, (long[]) ((m) xVar.f31694b).f65093b, (long[]) xVar.f31695c);
        long[] jArr = (long[]) mVar.f65095d;
        m mVar2 = (m) xVar.f31694b;
        el.a.q2(jArr, (long[]) mVar2.f65095d, (long[]) mVar2.f65094c);
        el.a.q2((long[]) mVar.f65094c, (long[]) ((m) xVar.f31694b).f65094c, (long[]) xVar.f31695c);
    }

    public static String y(f30 f30Var) {
        Boolean O4 = f30Var.O4();
        Intrinsics.checkNotNullExpressionValue(O4, "getIsEligibleForPromotedPartnership(...)");
        if (!O4.booleanValue() || m2.v1(f30Var)) {
            wy0 N = b40.N(f30Var);
            String Z2 = N != null ? N.Z2() : null;
            if ((Z2 != null && Z2.length() != 0) || !n60.o.y(f30Var, "getIsThirdPartyAd(...)")) {
                wy0 N2 = b40.N(f30Var);
                if (N2 != null) {
                    return N2.Z2();
                }
                return null;
            }
        }
        return f30Var.X5();
    }

    public final String A() {
        Object obj = this.f65094c;
        if (((String) obj) != null) {
            return (String) obj;
        }
        Object obj2 = this.f65095d;
        String str = ((PackageInfo) obj2) == null ? "UNK" : ((PackageInfo) obj2).packageName;
        String str2 = ((PackageInfo) obj2) != null ? ((PackageInfo) obj2).versionName : "UNK";
        Locale locale = Locale.getDefault();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/");
        sb3.append(str2);
        sb3.append(" ChannelSDK/");
        sb3.append((String) this.f65093b);
        sb3.append(" (Linux; U; Android ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append("; ");
        sb3.append(locale.getLanguage());
        sb3.append("-");
        sb3.append(locale.getCountry());
        sb3.append("; ");
        sb3.append(Build.MODEL);
        sb3.append(" Build/");
        String p13 = a.a.p(sb3, Build.ID, ")");
        this.f65094c = p13;
        return p13;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(90:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(87:276|277|(1:24)|25|26|27|(1:29)|273|31|32|33|34|35|(78:252|(71:254|(1:256)|38|(1:40)|41|(1:43)|44|(62:46|(1:237)|50|(1:52)|53|(1:55)(2:227|(1:232)(1:231))|56|(1:58)|59|(1:61)(5:215|(1:217)|218|(1:220)(1:226)|(1:222)(2:223|(1:225)))|62|(1:64)(6:197|(4:200|(2:208|209)(1:206)|207|198)|210|211|(1:213)|214)|65|(1:67)(1:196)|(1:69)|70|(44:192|193|(1:76)|77|(1:79)|80|(38:183|(1:187)|(1:84)|85|(34:178|(1:182)|(1:89)|90|(30:175|(1:177)|(1:94)|95|(26:171|172|(1:99)|100|(3:161|162|(23:164|(1:166)|167|(1:104)|105|(4:146|147|148|(2:150|(17:152|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:145)|126|(4:134|135|(1:137)(1:140)|138)|128|129|(1:131)|132|133)(2:153|154))(2:155|156))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)(2:168|169))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|72|(44:188|189|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|238|(2:247|248)|(1:246)(1:245)|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|257|(74:259|(1:261)|38|(0)|41|(0)|44|(0)|238|(1:240)|247|248|(1:243)|246|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)(1:269)|262|(3:264|(1:266)(1:268)|267)|38|(0)|41|(0)|44|(0)|238|(0)|247|248|(0)|246|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|37|38|(0)|41|(0)|44|(0)|238|(0)|247|248|(0)|246|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133)|22|(0)|25|26|27|(0)|273|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)|238|(0)|247|248|(0)|246|50|(0)|53|(0)(0)|56|(0)|59|(0)(0)|62|(0)(0)|65|(0)(0)|(0)|70|(0)|72|(0)|74|(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|129|(0)|132|133) */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0200, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0201, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00c8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00c9, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0495 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: NameNotFoundException -> 0x00c8, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x00c8, blocks: (B:27:0x00bc, B:29:0x00c2), top: B:26:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04c3  */
    /* JADX WARN: Type inference failed for: r0v113, types: [int] */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v193 */
    /* JADX WARN: Type inference failed for: r0v194 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.m.B():boolean");
    }

    public final void C(String str, String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        fw.f37821a.getClass();
        v7 b13 = gw.b(boardId);
        if (b13 == null) {
            return;
        }
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        a13.b0(h32.u0.DECLINE_BUTTON, null, b13.getUid(), false);
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new lr.y(str, b13, (h12.a) this.f65093b));
        m60.u.f85943a.d(new pg0.a(b13.getUid(), false));
    }

    public final void D(dl1.s sVar) {
        ScreenLocation screenLocation = sVar instanceof v7 ? (ScreenLocation) s2.f51342a.getValue() : sVar instanceof f30 ? (ScreenLocation) s2.f51348g.getValue() : sVar instanceof wy0 ? (ScreenLocation) s2.f51351j.getValue() : sVar instanceof zs ? (ScreenLocation) s2.f51345d.getValue() : null;
        if (screenLocation != null) {
            ((m60.w) this.f65095d).d(Navigation.r0(screenLocation, sVar));
        }
    }

    public final uj2.b F(String boardId, TypeAheadItem[] contact, String str, boolean z13) {
        uj2.b bVar;
        Intrinsics.checkNotNullParameter(boardId, "boardUid");
        Intrinsics.checkNotNullParameter(contact, "contact");
        uj2.b bVar2 = fk2.m.f62459a;
        Intrinsics.checkNotNullExpressionValue(bVar2, "complete(...)");
        if (contact.length == 0) {
            return bVar2;
        }
        Pair G = G((TypeAheadItem[]) Arrays.copyOf(contact, contact.length));
        List emails = (List) G.first;
        List list = (List) G.second;
        Intrinsics.f(list);
        if (!(!list.isEmpty())) {
            bVar = bVar2;
        } else if (z13) {
            fw.f37821a.getClass();
            v7 b13 = gw.b(boardId);
            if (b13 != null) {
                return ((x92.b) this.f65095d).P((String) list.get(0), b13);
            }
            bVar = null;
        } else {
            bVar = ((x92.b) this.f65095d).I(boardId, str, list);
        }
        Intrinsics.f(emails);
        if (!emails.isEmpty()) {
            x92.b bVar3 = (x92.b) this.f65095d;
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            Intrinsics.checkNotNullParameter(emails, "emails");
            bVar2 = bVar3.J(emails, true, boardId, str);
        }
        List j13 = kotlin.collections.f0.j(bVar, bVar2);
        ck2.i.b(j13, "sources is null");
        fk2.e eVar = new fk2.e(j13, 1);
        Intrinsics.checkNotNullExpressionValue(eVar, "merge(...)");
        return eVar;
    }

    public final byte[] H() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        el.a.f2(jArr, (long[]) this.f65094c);
        el.a.q2(jArr2, (long[]) this.f65093b, jArr);
        el.a.q2(jArr3, (long[]) this.f65095d, jArr);
        byte[] u13 = el.a.u(jArr3);
        u13[31] = (byte) (((el.a.u(jArr2)[0] & 1) << 7) ^ u13[31]);
        return u13;
    }

    public final void I(Object obj, String str) {
        int i13 = 0;
        m mVar = new m(i13, i13);
        ((m) this.f65095d).f65094c = mVar;
        this.f65095d = mVar;
        mVar.f65095d = obj;
        mVar.f65093b = str;
    }

    public final Object J() {
        try {
            return ((Class) this.f65094c).cast(((Field) this.f65093b).get(this.f65095d));
        } catch (Exception e13) {
            String name = ((Field) this.f65093b).getName();
            String name2 = this.f65095d.getClass().getName();
            String name3 = ((Class) this.f65094c).getName();
            StringBuilder w13 = a.a.w("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            w13.append(name3);
            throw new zzbl(w13.toString(), e13);
        }
    }

    public final void K(Object obj) {
        try {
            ((Field) this.f65093b).set(this.f65095d, obj);
        } catch (Exception e13) {
            String name = ((Field) this.f65093b).getName();
            String name2 = this.f65095d.getClass().getName();
            String name3 = ((Class) this.f65094c).getName();
            StringBuilder w13 = a.a.w("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            w13.append(name3);
            throw new zzbl(w13.toString(), e13);
        }
    }

    @Override // tj.h
    public final int a() {
        return ((ExtendedFloatingActionButton) this.f65094c).B;
    }

    public final void b(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        fw.f37821a.getClass();
        v7 b13 = gw.b(boardId);
        if (b13 != null) {
            nx.d0 a13 = sh.f.a();
            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
            a13.b0(h32.u0.INVITE_BUTTON, null, b13.getUid(), false);
            h12.a aVar = (h12.a) this.f65093b;
            String uid = b13.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            fk2.c l13 = aVar.b(uid).h(wj2.c.a()).l(tk2.e.f118017c);
            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
            nl.b.r(l13, new k1.v0(26, b13, this), null, 2);
        }
    }

    @Override // ik.d
    public final void c(ZipFile zipFile, HashSet hashSet) {
        Set set = (Set) this.f65093b;
        ik.g gVar = (ik.g) this.f65094c;
        ik.b bVar = (ik.b) this.f65095d;
        Pattern pattern = ik.g.f72395b;
        HashSet hashSet2 = new HashSet();
        gVar.c(bVar, hashSet, new m(hashSet2, bVar, zipFile));
        set.addAll(hashSet2);
    }

    public final /* synthetic */ Object clone() {
        switch (this.f65092a) {
            case 2:
                m mVar = new m((com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) this.f65093b).clone());
                Iterator it = ((List) this.f65094c).iterator();
                while (it.hasNext()) {
                    ((List) mVar.f65094c).add((com.google.android.gms.internal.measurement.c) ((com.google.android.gms.internal.measurement.c) it.next()).clone());
                }
                return mVar;
            default:
                return super.clone();
        }
    }

    @Override // tj.h
    public final ViewGroup.LayoutParams d() {
        Object obj = this.f65094c;
        return new ViewGroup.LayoutParams(((ExtendedFloatingActionButton) obj).G == 0 ? -2 : ((ExtendedFloatingActionButton) obj).G, ((ExtendedFloatingActionButton) obj).H != 0 ? ((ExtendedFloatingActionButton) obj).H : -2);
    }

    @Override // tj.h
    public final int e() {
        return ((ExtendedFloatingActionButton) this.f65094c).A;
    }

    @Override // ik.e
    public final void f(ik.f fVar, File file, boolean z13) {
        ((Set) this.f65093b).add(file);
        if (z13) {
            return;
        }
        ik.b bVar = (ik.b) this.f65095d;
        String str = bVar.f72389b;
        String absolutePath = bVar.f72388a.getAbsolutePath();
        ZipEntry zipEntry = fVar.f72394b;
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder o13 = cb.o("NativeLibraryExtractor: split '", str, "' has native library '");
        a.a.B(o13, fVar.f72393a, "' that does not exist; extracting from '", absolutePath, "!");
        Log.i("SplitCompat", a.a.q(o13, name, "' to '", absolutePath2, "'"));
        ZipFile zipFile = (ZipFile) this.f65094c;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
            }
            throw th3;
        }
    }

    public final el.x g() {
        if (((ArrayList) this.f65093b) == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = (Integer) this.f65094c;
        if (num != null) {
            int intValue = num.intValue();
            Iterator it = ((ArrayList) this.f65093b).iterator();
            while (it.hasNext()) {
                if (((el.w) it.next()).f59548b == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        el.x xVar = new el.x((el.v) this.f65095d, Collections.unmodifiableList((ArrayList) this.f65093b), (Integer) this.f65094c);
        this.f65093b = null;
        return xVar;
    }

    public final fl.a h() {
        ll.j jVar;
        fl.d dVar = (fl.d) this.f65093b;
        if (dVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f62509a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((fl.d) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((fl.d) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new fl.a((fl.d) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    @Override // tj.h
    public final int i() {
        Object obj = this.f65094c;
        return ((ExtendedFloatingActionButton) obj).H == -1 ? ((tj.h) this.f65093b).i() : (((ExtendedFloatingActionButton) obj).H == 0 || ((ExtendedFloatingActionButton) obj).H == -2) ? ((tj.h) this.f65095d).i() : ((ExtendedFloatingActionButton) obj).H;
    }

    @Override // tj.h
    public final int j() {
        Object obj = this.f65094c;
        return ((ExtendedFloatingActionButton) obj).G == -1 ? ((tj.h) this.f65093b).j() : (((ExtendedFloatingActionButton) obj).G == 0 || ((ExtendedFloatingActionButton) obj).G == -2) ? ((tj.h) this.f65095d).j() : ((ExtendedFloatingActionButton) obj).G;
    }

    public final fl.h k() {
        ll.j jVar;
        fl.l lVar = (fl.l) this.f65093b;
        if (lVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lVar.f62534a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((fl.l) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((fl.l) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new fl.h((fl.l) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public final jl.g l() {
        jl.e eVar = (jl.e) this.f65093b;
        if (eVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f65095d;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        el.f.b(eCPoint, eVar.f76829b.f76792b.getCurve());
        if (((jl.e) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((jl.e) this.f65093b).a() && ((Integer) this.f65094c) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        return new jl.g((jl.e) this.f65093b, (ECPoint) this.f65095d, z(), (Integer) this.f65094c);
    }

    public final jl.x m() {
        if (((jl.v) this.f65093b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f65095d;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        jl.v vVar = (jl.v) this.f65093b;
        int i13 = vVar.f76906a;
        if (bitLength != i13) {
            throw new GeneralSecurityException(a.a.f("Got modulus size ", bitLength, ", but parameters requires modulus size ", i13));
        }
        if (vVar.a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((jl.v) this.f65093b).a() && ((Integer) this.f65094c) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        return new jl.x((jl.v) this.f65093b, (BigInteger) this.f65095d, z(), (Integer) this.f65094c);
    }

    public final jl.e0 n() {
        if (((jl.c0) this.f65093b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f65095d;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        jl.c0 c0Var = (jl.c0) this.f65093b;
        int i13 = c0Var.f76810a;
        if (bitLength != i13) {
            throw new GeneralSecurityException(a.a.f("Got modulus size ", bitLength, ", but parameters requires modulus size ", i13));
        }
        if (c0Var.a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((jl.c0) this.f65093b).a() && ((Integer) this.f65094c) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        return new jl.e0((jl.c0) this.f65093b, (BigInteger) this.f65095d, z(), (Integer) this.f65094c);
    }

    public final vk.m o() {
        ll.j jVar;
        vk.p pVar = (vk.p) this.f65093b;
        if (pVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (pVar.f126013a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((vk.p) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((vk.p) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new vk.m((vk.p) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public final vk.q p() {
        ll.j jVar;
        vk.t tVar = (vk.t) this.f65093b;
        if (tVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (tVar.f126043a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((vk.t) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((vk.t) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new vk.q((vk.t) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public final vk.u q() {
        ll.j jVar;
        vk.x xVar = (vk.x) this.f65093b;
        if (xVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (xVar.f126068a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((vk.x) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((vk.x) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new vk.u((vk.x) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public final zk.a r() {
        ll.j jVar;
        zk.f fVar = (zk.f) this.f65093b;
        if (fVar == null || (jVar = (ll.j) this.f65095d) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (fVar.f142074a != jVar.I()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((zk.f) this.f65093b).a() && ((Integer) this.f65094c) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (((zk.f) this.f65093b).a() || ((Integer) this.f65094c) == null) {
            return new zk.a((zk.f) this.f65093b, (ll.j) this.f65095d, z(), (Integer) this.f65094c);
        }
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    }

    public final com.pinterest.framework.multisection.datasource.pagedlist.g s() {
        com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s((oc.c) this.f65093b, new i1.j(this, 8), ep.d.f59867l, ep.d.f59866k, new z3.m(this, 11), null, null, null, 8160);
        int i13 = ep.l.f59885a[((ep.n) this.f65095d).ordinal()];
        if (i13 == 1) {
            sVar.o(1, new ep.c(12));
        } else if (i13 == 2) {
            sVar.o(3, new ep.c(13));
        }
        return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, (ep.k) this.f65094c, "", null);
    }

    public final void t(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f65093b;
        yl.g gVar = new yl.g(byteArrayOutputStream, map, (Map) this.f65095d, (vl.c) this.f65094c);
        if (obj == null) {
            return;
        }
        vl.c cVar = (vl.c) map.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, gVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public final String toString() {
        switch (this.f65092a) {
            case 1:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f65093b);
                sb3.append('{');
                m mVar = (m) ((m) this.f65094c).f65094c;
                String str = "";
                while (mVar != null) {
                    Object obj = mVar.f65095d;
                    sb3.append(str);
                    String str2 = (String) mVar.f65093b;
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb3.append(obj);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    mVar = (m) mVar.f65094c;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public final String u(long j13) {
        return ((qn.a) this.f65094c).b((Context) this.f65095d, String.valueOf(j13));
    }

    public final String v(String str) {
        return ((qn.a) this.f65094c).b((Context) this.f65095d, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[Catch: EncryptionException -> 0x0098, TRY_LEAVE, TryCatch #0 {EncryptionException -> 0x0098, blocks: (B:3:0x000d, B:6:0x0025, B:9:0x0045, B:28:0x004f, B:30:0x005b, B:33:0x0031, B:35:0x003d, B:38:0x0018), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wn.e x() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f65095d
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r11.f65093b
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "accessToken"
            r3 = 0
            java.lang.String r1 = r0.getString(r1, r3)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            if (r1 != 0) goto L18
            r9 = r3
            goto L25
        L18:
            java.lang.Object r4 = r11.f65094c     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            qn.a r4 = (qn.a) r4     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.Object r5 = r11.f65095d     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            android.content.Context r5 = (android.content.Context) r5     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.String r1 = r4.a(r5, r1)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            r9 = r1
        L25:
            java.lang.String r1 = "expiresIn"
            java.lang.String r1 = r0.getString(r1, r3)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            r4 = -1
            if (r1 != 0) goto L31
        L2f:
            r6 = r4
            goto L45
        L31:
            java.lang.Object r6 = r11.f65094c     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            qn.a r6 = (qn.a) r6     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.Object r7 = r11.f65095d     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            android.content.Context r7 = (android.content.Context) r7     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.String r1 = r6.a(r7, r1)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L2f com.linecorp.android.security.encryption.EncryptionException -> L98
            long r6 = r1.longValue()     // Catch: java.lang.NumberFormatException -> L2f com.linecorp.android.security.encryption.EncryptionException -> L98
        L45:
            java.lang.String r1 = "issuedClientTime"
            java.lang.String r1 = r0.getString(r1, r3)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            if (r1 != 0) goto L4f
        L4d:
            r1 = r4
            goto L63
        L4f:
            java.lang.Object r8 = r11.f65094c     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            qn.a r8 = (qn.a) r8     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.Object r10 = r11.f65095d     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            android.content.Context r10 = (android.content.Context) r10     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.String r1 = r8.a(r10, r1)     // Catch: com.linecorp.android.security.encryption.EncryptionException -> L98
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L4d com.linecorp.android.security.encryption.EncryptionException -> L98
            long r1 = r1.longValue()     // Catch: java.lang.NumberFormatException -> L4d com.linecorp.android.security.encryption.EncryptionException -> L98
        L63:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L97
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L97
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L72
            goto L97
        L72:
            java.lang.String r4 = "refreshToken"
            java.lang.String r0 = r0.getString(r4, r3)
            if (r0 != 0) goto L7b
            goto L87
        L7b:
            java.lang.Object r3 = r11.f65094c
            qn.a r3 = (qn.a) r3
            java.lang.Object r4 = r11.f65095d
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = r3.a(r4, r0)
        L87:
            if (r3 == 0) goto L8b
            r10 = r3
            goto L8e
        L8b:
            java.lang.String r0 = ""
            r10 = r0
        L8e:
            wn.e r0 = new wn.e
            r4 = r0
            r5 = r6
            r7 = r1
            r4.<init>(r5, r7, r9, r10)
            return r0
        L97:
            return r3
        L98:
            r0 = move-exception
            java.lang.Object r1 = r11.f65095d
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r3 = r11.f65093b
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.clear()
            r1.apply()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.m.x():wn.e");
    }

    public final ml.a z() {
        switch (this.f65092a) {
            case 10:
                vk.o oVar = ((vk.p) this.f65093b).f126016d;
                if (oVar == vk.o.f126007d) {
                    return el.i0.f59494a;
                }
                if (oVar == vk.o.f126006c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (oVar == vk.o.f126005b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((vk.p) this.f65093b).f126016d);
            case 11:
                vk.s sVar = ((vk.t) this.f65093b).f126046d;
                if (sVar == vk.s.f126037d) {
                    return el.i0.f59494a;
                }
                if (sVar == vk.s.f126036c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (sVar == vk.s.f126035b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((vk.t) this.f65093b).f126046d);
            case 12:
                vk.w wVar = ((vk.x) this.f65093b).f126069b;
                if (wVar == vk.w.f126066d) {
                    return el.i0.f59494a;
                }
                if (wVar == vk.w.f126065c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (wVar == vk.w.f126064b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((vk.x) this.f65093b).f126069b);
            case 13:
                zk.e eVar = ((zk.f) this.f65093b).f142075b;
                if (eVar == zk.e.f142072d) {
                    return el.i0.f59494a;
                }
                if (eVar == zk.e.f142071c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (eVar == zk.e.f142070b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((zk.f) this.f65093b).f142075b);
            case 14:
            case 15:
            default:
                jl.b0 b0Var = ((jl.c0) this.f65093b).f76812c;
                if (b0Var == jl.b0.f76804e) {
                    return el.i0.f59494a;
                }
                if (b0Var == jl.b0.f76803d || b0Var == jl.b0.f76802c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (b0Var == jl.b0.f76801b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + ((jl.c0) this.f65093b).f76812c);
            case 16:
                fl.c cVar = ((fl.d) this.f65093b).f62511c;
                if (cVar == fl.c.f62507e) {
                    return el.i0.f59494a;
                }
                if (cVar == fl.c.f62506d || cVar == fl.c.f62505c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (cVar == fl.c.f62504b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((fl.d) this.f65093b).f62511c);
            case 17:
                fl.k kVar = ((fl.l) this.f65093b).f62536c;
                if (kVar == fl.k.f62532e) {
                    return el.i0.f59494a;
                }
                if (kVar == fl.k.f62531d || kVar == fl.k.f62530c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (kVar == fl.k.f62529b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((fl.l) this.f65093b).f62536c);
            case 18:
                jl.d dVar = ((jl.e) this.f65093b).f76831d;
                if (dVar == jl.d.f76819e) {
                    return el.i0.f59494a;
                }
                if (dVar == jl.d.f76818d || dVar == jl.d.f76817c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (dVar == jl.d.f76816b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + ((jl.e) this.f65093b).f76831d);
            case 19:
                jl.u uVar = ((jl.v) this.f65093b).f76908c;
                if (uVar == jl.u.f76903e) {
                    return el.i0.f59494a;
                }
                if (uVar == jl.u.f76902d || uVar == jl.u.f76901c) {
                    return el.i0.a(((Integer) this.f65094c).intValue());
                }
                if (uVar == jl.u.f76900b) {
                    return el.i0.b(((Integer) this.f65094c).intValue());
                }
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + ((jl.v) this.f65093b).f76908c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(int i13) {
        this(new long[10], new long[10], new long[10], 14, 0);
        this.f65092a = i13;
        if (i13 == 14) {
            return;
        }
        if (i13 != 15) {
            this.f65093b = new com.google.android.gms.internal.measurement.c("", 0L, null);
            this.f65095d = new com.google.android.gms.internal.measurement.c("", 0L, null);
            this.f65094c = new ArrayList();
        } else {
            this.f65093b = new ArrayList();
            this.f65095d = el.v.f59543b;
            this.f65094c = null;
        }
    }

    public /* synthetic */ m(int i13, int i14) {
        this.f65092a = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(int i13, Context context, String str) {
        this(context.getApplicationContext(), str, wn.c.f130433a);
        this.f65092a = i13;
        if (i13 != 24) {
            return;
        }
        try {
            this.f65095d = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            this.f65093b = str;
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    public /* synthetic */ m(int i13, Object obj) {
        this.f65092a = i13;
        this.f65093b = null;
        this.f65095d = null;
        this.f65094c = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(com.google.android.gms.internal.measurement.x xVar) {
        this(14);
        this.f65092a = 14;
        w(this, xVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(d7.g gVar) {
        this(12, (Object) null);
        this.f65092a = 12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g gVar) {
        this(19, (Object) null);
        this.f65092a = 19;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(h hVar) {
        this(17, (Object) null);
        this.f65092a = 17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(i iVar) {
        this(16, (Object) null);
        this.f65092a = 16;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(j jVar) {
        this(20, (Object) null);
        this.f65092a = 20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(k kVar) {
        this(13, (Object) null);
        this.f65092a = 13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(l lVar) {
        this(18, (Object) null);
        this.f65092a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj) {
        this(11, (Object) null);
        this.f65092a = 11;
    }

    public /* synthetic */ m(Object obj, Object obj2, Serializable serializable, int i13) {
        this.f65092a = i13;
        this.f65095d = obj;
        this.f65093b = obj2;
        this.f65094c = serializable;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i13) {
        this.f65092a = i13;
        this.f65094c = obj;
        this.f65093b = obj2;
        this.f65095d = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f65092a = i13;
        this.f65093b = obj;
        this.f65095d = obj2;
        this.f65094c = obj3;
    }

    public m(HashSet hashSet, ik.b bVar, ZipFile zipFile) {
        this.f65092a = 7;
        this.f65093b = hashSet;
        this.f65095d = bVar;
        this.f65094c = zipFile;
    }

    public /* synthetic */ m(String str) {
        this.f65092a = 1;
        int i13 = 0;
        m mVar = new m(i13, i13);
        this.f65094c = mVar;
        this.f65095d = mVar;
        this.f65093b = str;
    }

    public m(com.google.android.gms.internal.measurement.c cVar) {
        this.f65092a = 2;
        this.f65093b = cVar;
        this.f65095d = (com.google.android.gms.internal.measurement.c) cVar.clone();
        this.f65094c = new ArrayList();
    }

    public m(Context context, lh0.g experiments, es.a adFormats) {
        this.f65092a = 28;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f65093b = context;
        this.f65095d = experiments;
        this.f65094c = adFormats;
    }

    public m(oc.c apolloClient, ep.n inviteContactRequestType) {
        this.f65092a = 26;
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(inviteContactRequestType, "inviteContactRequestType");
        this.f65093b = apolloClient;
        this.f65095d = inviteContactRequestType;
        this.f65094c = new ep.k(inviteContactRequestType);
    }

    public m(h12.a boardInviteApi, x92.b boardCollaboratorRemoteDataSource, g70.h boardNavigator) {
        this.f65092a = 25;
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(boardCollaboratorRemoteDataSource, "boardCollaboratorRemoteDataSource");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f65093b = boardInviteApi;
        this.f65095d = boardCollaboratorRemoteDataSource;
        this.f65094c = boardNavigator;
    }

    public m(Context context, String str, qn.a aVar) {
        this.f65092a = 23;
        this.f65095d = context;
        this.f65093b = a.a.j("com.linecorp.linesdk.accesstoken.", str);
        this.f65094c = aVar;
    }

    public m(Context context, pf.b bVar, ExecutorService executorService) {
        this.f65092a = 22;
        this.f65093b = executorService;
        this.f65095d = context;
        this.f65094c = bVar;
    }

    public m(m mVar) {
        this.f65092a = 14;
        this.f65093b = Arrays.copyOf((long[]) mVar.f65093b, 10);
        this.f65095d = Arrays.copyOf((long[]) mVar.f65095d, 10);
        this.f65094c = Arrays.copyOf((long[]) mVar.f65094c, 10);
    }
}
