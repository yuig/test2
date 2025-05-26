package dm2;

import java.util.LinkedHashMap;
import java.util.List;
import pn2.l1;

/* loaded from: classes2.dex */
public final class y implements am2.w {

    /* renamed from: a, reason: collision with root package name */
    public l1 f55542a;

    /* renamed from: b, reason: collision with root package name */
    public am2.m f55543b;

    /* renamed from: c, reason: collision with root package name */
    public am2.c0 f55544c;

    /* renamed from: d, reason: collision with root package name */
    public am2.q f55545d;

    /* renamed from: e, reason: collision with root package name */
    public am2.x f55546e;

    /* renamed from: f, reason: collision with root package name */
    public am2.c f55547f;

    /* renamed from: g, reason: collision with root package name */
    public List f55548g;

    /* renamed from: h, reason: collision with root package name */
    public final List f55549h;

    /* renamed from: i, reason: collision with root package name */
    public d f55550i;

    /* renamed from: j, reason: collision with root package name */
    public d f55551j;

    /* renamed from: k, reason: collision with root package name */
    public pn2.b0 f55552k;

    /* renamed from: l, reason: collision with root package name */
    public ym2.g f55553l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f55554m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f55555n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55556o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f55557p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f55558q;

    /* renamed from: r, reason: collision with root package name */
    public List f55559r;

    /* renamed from: s, reason: collision with root package name */
    public bm2.i f55560s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f55561t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f55562u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f55563v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f55564w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f55565x;

    public y(z zVar, l1 l1Var, am2.m mVar, am2.c0 c0Var, am2.q qVar, am2.c cVar, List list, List list2, d dVar, pn2.b0 b0Var) {
        if (l1Var == null) {
            q(0);
            throw null;
        }
        if (mVar == null) {
            q(1);
            throw null;
        }
        if (c0Var == null) {
            q(2);
            throw null;
        }
        if (qVar == null) {
            q(3);
            throw null;
        }
        if (cVar == null) {
            q(4);
            throw null;
        }
        if (list == null) {
            q(5);
            throw null;
        }
        if (list2 == null) {
            q(6);
            throw null;
        }
        if (b0Var == null) {
            q(7);
            throw null;
        }
        this.f55565x = zVar;
        this.f55546e = null;
        this.f55551j = zVar.f55571j;
        this.f55554m = true;
        this.f55555n = false;
        this.f55556o = false;
        this.f55557p = false;
        this.f55558q = zVar.f55581t;
        this.f55559r = null;
        this.f55560s = null;
        this.f55561t = zVar.f55582u;
        this.f55562u = new LinkedHashMap();
        this.f55563v = null;
        this.f55564w = false;
        this.f55542a = l1Var;
        this.f55543b = mVar;
        this.f55544c = c0Var;
        this.f55545d = qVar;
        this.f55547f = cVar;
        this.f55548g = list;
        this.f55549h = list2;
        this.f55550i = dVar;
        this.f55552k = b0Var;
        this.f55553l = null;
    }

    public static /* synthetic */ void q(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i14 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i13) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // am2.w
    public final am2.w a(kotlin.collections.q0 q0Var) {
        if (q0Var != null) {
            this.f55559r = q0Var;
            return this;
        }
        q(21);
        throw null;
    }

    @Override // am2.w
    public final am2.w b(List list) {
        if (list != null) {
            this.f55548g = list;
            return this;
        }
        q(19);
        throw null;
    }

    @Override // am2.w
    public final am2.x build() {
        return this.f55565x.w0(this);
    }

    @Override // am2.w
    public final am2.w c(bm2.i iVar) {
        if (iVar != null) {
            this.f55560s = iVar;
            return this;
        }
        q(35);
        throw null;
    }

    @Override // am2.w
    public final am2.w d() {
        this.f55561t = true;
        return this;
    }

    @Override // am2.w
    public final am2.w e() {
        this.f55554m = false;
        return this;
    }

    @Override // am2.w
    public final am2.w f(pn2.b0 b0Var) {
        if (b0Var != null) {
            this.f55552k = b0Var;
            return this;
        }
        q(23);
        throw null;
    }

    @Override // am2.w
    public final am2.w g() {
        this.f55558q = true;
        return this;
    }

    @Override // am2.w
    public final am2.w h(am2.c0 c0Var) {
        if (c0Var != null) {
            this.f55544c = c0Var;
            return this;
        }
        q(10);
        throw null;
    }

    @Override // am2.w
    public final am2.w i(am2.q qVar) {
        if (qVar != null) {
            this.f55545d = qVar;
            return this;
        }
        q(12);
        throw null;
    }

    @Override // am2.w
    public final am2.w j(am2.c cVar) {
        if (cVar != null) {
            this.f55547f = cVar;
            return this;
        }
        q(14);
        throw null;
    }

    @Override // am2.w
    public final am2.w k(am2.m mVar) {
        if (mVar != null) {
            this.f55543b = mVar;
            return this;
        }
        q(8);
        throw null;
    }

    @Override // am2.w
    public final am2.w l(d dVar) {
        this.f55551j = dVar;
        return this;
    }

    @Override // am2.w
    public final am2.w m() {
        this.f55556o = true;
        return this;
    }

    @Override // am2.w
    public final am2.w n() {
        this.f55562u.put(km2.g.H, Boolean.TRUE);
        return this;
    }

    @Override // am2.w
    public final am2.w o(ym2.g gVar) {
        if (gVar != null) {
            this.f55553l = gVar;
            return this;
        }
        q(17);
        throw null;
    }

    @Override // am2.w
    public final am2.w p() {
        this.f55555n = true;
        return this;
    }

    public final am2.w r(l1 l1Var) {
        if (l1Var != null) {
            this.f55542a = l1Var;
            return this;
        }
        q(37);
        throw null;
    }
}
