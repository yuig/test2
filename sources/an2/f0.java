package an2;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 implements b0 {
    public static final /* synthetic */ rl2.u[] X;
    public final d0 A;
    public final d0 B;
    public final d0 C;
    public final d0 D;
    public final d0 E;
    public final d0 F;
    public final d0 G;
    public final d0 H;
    public final d0 I;

    /* renamed from: J, reason: collision with root package name */
    public final d0 f15770J;
    public final d0 K;
    public final d0 L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final d0 P;
    public final d0 Q;
    public final d0 R;
    public final d0 S;
    public final d0 T;
    public final d0 U;
    public final d0 V;
    public final d0 W;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15771a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f15772b = new d0(d.f15766a, this);

    /* renamed from: c, reason: collision with root package name */
    public final d0 f15773c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f15774d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f15775e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f15776f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f15777g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f15778h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f15779i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f15780j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f15781k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f15782l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f15783m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f15784n;

    /* renamed from: o, reason: collision with root package name */
    public final d0 f15785o;

    /* renamed from: p, reason: collision with root package name */
    public final d0 f15786p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f15787q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f15788r;

    /* renamed from: s, reason: collision with root package name */
    public final d0 f15789s;

    /* renamed from: t, reason: collision with root package name */
    public final d0 f15790t;

    /* renamed from: u, reason: collision with root package name */
    public final d0 f15791u;

    /* renamed from: v, reason: collision with root package name */
    public final d0 f15792v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f15793w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f15794x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f15795y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f15796z;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        X = new rl2.u[]{l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "withDefinedIn", "getWithDefinedIn()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "modifiers", "getModifiers()Ljava/util/Set;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "startFromName", "getStartFromName()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "debugMode", "getDebugMode()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "verbose", "getVerbose()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "unitReturnType", "getUnitReturnType()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "withoutReturnType", "getWithoutReturnType()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "enhancedTypes", "getEnhancedTypes()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderDefaultModality", "getRenderDefaultModality()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "receiverAfterName", "getReceiverAfterName()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), l0Var.e(new kotlin.jvm.internal.x(l0Var.b(f0.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public f0() {
        Boolean bool = Boolean.TRUE;
        this.f15773c = new d0(bool, this);
        this.f15774d = new d0(bool, this);
        this.f15775e = new d0(a0.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f15776f = new d0(bool2, this);
        this.f15777g = new d0(bool2, this);
        this.f15778h = new d0(bool2, this);
        this.f15779i = new d0(bool2, this);
        this.f15780j = new d0(bool2, this);
        this.f15781k = new d0(bool, this);
        this.f15782l = new d0(bool2, this);
        this.f15783m = new d0(bool2, this);
        this.f15784n = new d0(bool2, this);
        this.f15785o = new d0(bool, this);
        this.f15786p = new d0(bool, this);
        this.f15787q = new d0(bool2, this);
        this.f15788r = new d0(bool2, this);
        this.f15789s = new d0(bool2, this);
        this.f15790t = new d0(bool2, this);
        this.f15791u = new d0(bool2, this);
        this.f15792v = new d0(null, this);
        this.f15793w = new d0(bool2, this);
        this.f15794x = new d0(bool2, this);
        this.f15795y = new d0(e0.f15768i, this);
        this.f15796z = new d0(c0.f15765i, this);
        this.A = new d0(bool, this);
        this.B = new d0(i0.RENDER_OPEN, this);
        this.C = new d0(q.f15809a, this);
        this.D = new d0(n0.PLAIN, this);
        this.E = new d0(j0.ALL, this);
        this.F = new d0(bool2, this);
        this.G = new d0(bool2, this);
        this.H = new d0(k0.DEBUG, this);
        this.I = new d0(bool2, this);
        this.f15770J = new d0(bool2, this);
        this.K = new d0(s0.f80394a, this);
        this.L = new d0(g0.f15798a, this);
        this.M = new d0(null, this);
        this.N = new d0(a.NO_ARGUMENTS, this);
        this.O = new d0(bool2, this);
        this.P = new d0(bool, this);
        this.Q = new d0(bool, this);
        this.R = new d0(bool2, this);
        this.S = new d0(bool, this);
        this.T = new d0(bool, this);
        this.U = new d0(bool2, this);
        this.V = new d0(bool2, this);
        this.W = new d0(bool, this);
    }

    @Override // an2.b0
    public final void a() {
        this.F.d(this, X[30], Boolean.TRUE);
    }

    @Override // an2.b0
    public final void b() {
        this.G.d(this, X[31], Boolean.TRUE);
    }

    @Override // an2.b0
    public final void c(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<set-?>");
        this.D.d(this, X[28], n0Var);
    }

    @Override // an2.b0
    public final boolean d() {
        return ((Boolean) this.f15783m.c(this, X[11])).booleanValue();
    }

    @Override // an2.b0
    public final void e() {
        this.f15793w.d(this, X[21], Boolean.TRUE);
    }

    @Override // an2.b0
    public final void f() {
        this.f15776f.d(this, X[4], Boolean.TRUE);
    }

    @Override // an2.b0
    public final Set g() {
        return (Set) this.L.c(this, X[36]);
    }

    @Override // an2.b0
    public final boolean h() {
        return ((Boolean) this.f15778h.c(this, X[6])).booleanValue();
    }

    @Override // an2.b0
    public final void i() {
        this.f15794x.d(this, X[22], Boolean.TRUE);
    }

    @Override // an2.b0
    public final void j() {
        this.f15778h.d(this, X[6], Boolean.TRUE);
    }

    @Override // an2.b0
    public final void k(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f15775e.d(this, X[3], set);
    }

    @Override // an2.b0
    public final void l(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f15772b.d(this, X[0], eVar);
    }

    @Override // an2.b0
    public final void m(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.L.d(this, X[36], linkedHashSet);
    }

    @Override // an2.b0
    public final void n(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.E.d(this, X[29], j0Var);
    }

    @Override // an2.b0
    public final void o() {
        this.f15773c.d(this, X[1], Boolean.FALSE);
    }

    public final a p() {
        return (a) this.N.c(this, X[38]);
    }
}
