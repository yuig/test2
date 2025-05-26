package jo;

import e2.u;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class s extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f77205c = Pattern.compile("[~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?]");

    /* renamed from: d, reason: collision with root package name */
    public static final List f77206d = Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f77207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar) {
        super(uVar);
        Map unmodifiableMap = Collections.unmodifiableMap(uVar.f56907b);
        this.f77207b = new LinkedHashMap(unmodifiableMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[EDGE_INSN: B:41:0x00df->B:42:0x00df BREAK  A[LOOP:2: B:13:0x004e->B:38:0x00d9], SYNTHETIC] */
    @Override // jo.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jo.s.a(java.lang.CharSequence):java.util.ArrayList");
    }
}
