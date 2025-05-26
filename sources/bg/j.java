package bg;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f22774a;

    public j(i iVar) {
        this.f22774a = iVar;
    }

    public static StringBuilder b(g gVar, StringBuilder sb3, String str, int i13, boolean z13) {
        String sb4 = sb3.toString();
        l lVar = new l(i13, null, null, str, z13);
        if (sb4.length() > 0) {
            LinkedList linkedList = gVar.f22769a;
            int size = linkedList.size();
            if (size > 0) {
                cg.b bVar = (cg.b) ((a) linkedList.get(size - 1));
                if (bVar.f27667a == null) {
                    bVar.f27667a = sb4;
                } else {
                    bVar.f27667a = a.a.p(new StringBuilder(), bVar.f27667a, sb4);
                }
            } else {
                cg.l lVar2 = new cg.l(lVar, gVar.f22771c, null, null, null);
                if (lVar2.f27667a == null) {
                    lVar2.f27667a = sb4;
                } else {
                    lVar2.f27667a = a.a.p(new StringBuilder(), lVar2.f27667a, sb4);
                }
                linkedList.add(lVar2);
            }
        }
        return new StringBuilder();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0283  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cg.c a(java.io.Reader r33, java.lang.String r34, java.util.concurrent.atomic.AtomicInteger r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.j.a(java.io.Reader, java.lang.String, java.util.concurrent.atomic.AtomicInteger, java.lang.String, java.lang.String, java.lang.String, boolean):cg.c");
    }
}
