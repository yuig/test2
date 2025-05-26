package j22;

import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.d3;
import lh0.g2;
import lh0.n1;
import lh0.n2;

/* loaded from: classes2.dex */
public final class f implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f74516a;

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f74517b;

    /* renamed from: c, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f74518c;

    /* renamed from: d, reason: collision with root package name */
    public final ke0.a f74519d;

    /* renamed from: e, reason: collision with root package name */
    public final t f74520e;

    /* renamed from: f, reason: collision with root package name */
    public final d3 f74521f;

    public f(ModelDeserializerWithSaveAndMerge userDeserializer, ModelDeserializerWithSaveAndMerge pinDeserializer, ModelDeserializerWithSaveAndMerge dynamicStoryDeserializer, ke0.a filterEligibilityDeserializer, t userRepository) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        Intrinsics.checkNotNullParameter(filterEligibilityDeserializer, "filterEligibilityDeserializer");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f74516a = userDeserializer;
        this.f74517b = pinDeserializer;
        this.f74518c = dynamicStoryDeserializer;
        this.f74519d = filterEligibilityDeserializer;
        this.f74520e = userRepository;
        vb0.i iVar = d3.f83328b;
        if (d3.f83329c == null) {
            switch (iVar.f125465a) {
                case 12:
                    function0 = n1.f83438d;
                    break;
                case 17:
                    function0 = g2.f83372d;
                    break;
                default:
                    function0 = d3.f83330d;
                    break;
            }
            function0.invoke();
            iVar.g(n2.f83440j);
        }
        d3 d3Var = d3.f83329c;
        if (d3Var != null) {
            this.f74521f = d3Var;
        } else {
            Intrinsics.r("INSTANCE");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (((lh0.g1) r6).l("android_remove_skin_autocomplete") == false) goto L35;
     */
    @Override // rz.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(vd0.c r14) {
        /*
            r13 = this;
            java.lang.String r0 = "pinterestJsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed r0 = new com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed
            java.lang.String r1 = ""
            r0.<init>(r14, r1)
            java.lang.String r2 = "data"
            vd0.a r14 = r14.k(r2)
            int r2 = r14.d()
            if (r2 != 0) goto L1a
            goto Lde
        L1a:
            r2 = 0
            r0.g(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L27:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r14.next()
            vd0.c r3 = (vd0.c) r3
            br.d r11 = new br.d     // Catch: java.lang.Exception -> La4
            r11.<init>()     // Catch: java.lang.Exception -> La4
            com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge r6 = r13.f74516a     // Catch: java.lang.Exception -> La4
            com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge r7 = r13.f74517b     // Catch: java.lang.Exception -> La4
            com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge r8 = r13.f74518c     // Catch: java.lang.Exception -> La4
            ke0.a r9 = r13.f74519d     // Catch: java.lang.Exception -> La4
            dl1.t r10 = r13.f74520e     // Catch: java.lang.Exception -> La4
            r4 = r11
            r5 = r3
            r4.l(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La4
            com.pinterest.api.model.yw r4 = r11.h()     // Catch: java.lang.Exception -> La4
            r5 = 1
            if (r4 == 0) goto La6
            boolean[] r6 = r4.f44138e     // Catch: java.lang.Exception -> La4
            int r7 = r6.length     // Catch: java.lang.Exception -> La4
            r8 = 2
            if (r7 <= r8) goto L5a
            boolean r6 = r6[r8]     // Catch: java.lang.Exception -> La4
            if (r6 == 0) goto L5a
            r6 = r5
            goto L5b
        L5a:
            r6 = 0
        L5b:
            java.lang.String r7 = "enabled"
            lh0.d3 r8 = r13.f74521f
            if (r6 == 0) goto L7c
            r8.getClass()     // Catch: java.lang.Exception -> La4
            lh0.z3 r6 = lh0.a4.f83298b     // Catch: java.lang.Exception -> La4
            lh0.z0 r9 = r8.f83331a     // Catch: java.lang.Exception -> La4
            r10 = r9
            lh0.g1 r10 = (lh0.g1) r10     // Catch: java.lang.Exception -> La4
            java.lang.String r12 = "android_remove_hair_autocomplete"
            boolean r6 = r10.o(r12, r7, r6)     // Catch: java.lang.Exception -> La4
            if (r6 != 0) goto La0
            lh0.g1 r9 = (lh0.g1) r9     // Catch: java.lang.Exception -> La4
            boolean r6 = r9.l(r12)     // Catch: java.lang.Exception -> La4
            if (r6 == 0) goto L7c
            goto La0
        L7c:
            boolean[] r4 = r4.f44138e     // Catch: java.lang.Exception -> La4
            int r6 = r4.length     // Catch: java.lang.Exception -> La4
            r9 = 3
            if (r6 <= r9) goto La6
            boolean r4 = r4[r9]     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto La6
            r8.getClass()     // Catch: java.lang.Exception -> La4
            lh0.z3 r4 = lh0.a4.f83298b     // Catch: java.lang.Exception -> La4
            lh0.z0 r6 = r8.f83331a     // Catch: java.lang.Exception -> La4
            r8 = r6
            lh0.g1 r8 = (lh0.g1) r8     // Catch: java.lang.Exception -> La4
            java.lang.String r9 = "android_remove_skin_autocomplete"
            boolean r4 = r8.o(r9, r7, r4)     // Catch: java.lang.Exception -> La4
            if (r4 != 0) goto La0
            lh0.g1 r6 = (lh0.g1) r6     // Catch: java.lang.Exception -> La4
            boolean r4 = r6.l(r9)     // Catch: java.lang.Exception -> La4
            if (r4 == 0) goto La6
        La0:
            r11.n()     // Catch: java.lang.Exception -> La4
            goto La6
        La4:
            r3 = move-exception
            goto Ld2
        La6:
            java.lang.String r4 = "query"
            java.lang.String r4 = r3.o(r4, r1)     // Catch: java.lang.Exception -> La4
            kotlin.jvm.internal.Intrinsics.f(r4)     // Catch: java.lang.Exception -> La4
            boolean r6 = kotlin.text.z.j(r4)     // Catch: java.lang.Exception -> La4
            r6 = r6 ^ r5
            if (r6 == 0) goto Lb9
            r11.s(r4)     // Catch: java.lang.Exception -> La4
        Lb9:
            java.lang.String r4 = "theme"
            java.lang.String r3 = r3.o(r4, r1)     // Catch: java.lang.Exception -> La4
            kotlin.jvm.internal.Intrinsics.f(r3)     // Catch: java.lang.Exception -> La4
            boolean r4 = kotlin.text.z.j(r3)     // Catch: java.lang.Exception -> La4
            r4 = r4 ^ r5
            if (r4 == 0) goto Lcd
            r11.q(r3)     // Catch: java.lang.Exception -> La4
        Lcd:
            r2.add(r11)     // Catch: java.lang.Exception -> La4
            goto L27
        Ld2:
            java.util.HashSet r4 = tb0.h.f117076w
            tb0.h r4 = tb0.g.f117075a
            r4.p(r3)
            goto L27
        Ldb:
            r0.H(r2)
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j22.f.b(vd0.c):java.lang.Object");
    }
}
