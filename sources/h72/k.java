package h72;

import android.graphics.Typeface;
import ao2.j0;
import c72.c0;
import do2.t2;
import do2.u2;
import do2.y1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.j2;
import r72.k2;
import r72.l2;
import r72.r1;

/* loaded from: classes4.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f67982r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f67983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f67984t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k2 f67985u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, k2 k2Var, bl2.c cVar) {
        super(2, cVar);
        this.f67984t = lVar;
        this.f67985u = k2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f67984t, this.f67985u, cVar);
        kVar.f67983s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f67982r;
        l lVar = this.f67984t;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f67983s = (j0) this.f67983s;
            this.f67982r = 1;
            obj = kotlin.jvm.internal.j.M(this, lVar.f67991f.f89707c, new f(lVar, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    ue.c.H(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        List list = (List) obj;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return Boolean.FALSE;
        }
        c0 c0Var = lVar.f67989d;
        k2 fontType = this.f67985u;
        String key = fontType.name();
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = c0Var.f26893a;
        Object obj3 = linkedHashMap.get(key);
        if (obj3 == null) {
            Typeface DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            obj3 = u2.a(DEFAULT);
            linkedHashMap.put(key, obj3);
        }
        if (!Intrinsics.d((Typeface) ((t2) ((y1) obj3)).getValue(), Typeface.DEFAULT)) {
            return Boolean.TRUE;
        }
        l2 l2Var = l2.f106537h;
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        switch (j2.f106510a[fontType.ordinal()]) {
            case 1:
                str = "AlexBrush-Regular.ttf";
                break;
            case 2:
                str = "AlfaSlabOne-Regular.ttf";
                break;
            case 3:
                str = "Amarante-Regular.ttf";
                break;
            case 4:
                str = "Anton-Regular.ttf";
                break;
            case 5:
                str = "Bangers-Regular.ttf";
                break;
            case 6:
                str = "BungeeShade-Regular.ttf";
                break;
            case 7:
                str = "ChakraPetch-Bold.ttf";
                break;
            case 8:
                str = "ChakraPetch-Regular.ttf";
                break;
            case 9:
                str = "CourierPrime-Bold.ttf";
                break;
            case 10:
                str = "CourierPrime-Italic.ttf";
                break;
            case 11:
            case 12:
                str = "CourierPrime-Regular.ttf";
                break;
            case 13:
                str = "Graphik-Bold-Italic.otf";
                break;
            case 14:
                str = "Graphik-XCond-Black.otf";
                break;
            case 15:
            case 16:
                str = "Grandstander-VariableFont_wght.ttf";
                break;
            case 17:
            case 18:
                str = "HeptaSlab-VariableFont_wght.ttf";
                break;
            case 19:
                str = "Lemon-Yellow-Sun-Extra-Bold.otf";
                break;
            case 20:
                str = "Janitor.ttf";
                break;
            case 21:
                str = "LexendPeta-Bold.ttf";
                break;
            case 22:
                str = "LuckiestGuy-Regular.ttf";
                break;
            case 23:
            case 24:
                str = "MartianMono-VariableFont_wdth,wght.ttf";
                break;
            case 25:
                str = "Meddon.ttf";
                break;
            case 26:
                str = "Mister-Firley.otf";
                break;
            case 27:
                str = "NewRocker-Regular.ttf";
                break;
            case 28:
                str = "OldStandardTT-Bold.ttf";
                break;
            case 29:
                str = "OldStandardTT-Italic.ttf";
                break;
            case 30:
                str = "OldStandardTT-Regular.ttf";
                break;
            case 31:
                str = "Oswald-VariableFont_wght.ttf";
                break;
            case 32:
                str = "PlayfairDisplay-Bold.ttf";
                break;
            case 33:
                str = "Publico-Banner-Ultra-Italic.otf";
                break;
            case 34:
                str = "Publico-Banner-Bold.otf";
                break;
            case 35:
            case 36:
                str = "Quicksand-VariableFont_wght.ttf";
                break;
            case 37:
                str = "RobotoSlab-Medium.ttf";
                break;
            case 38:
                str = "RubikBeastly-Regular.ttf";
                break;
            case 39:
                str = "RubikDistressed-Regular.ttf";
                break;
            case 40:
                str = "Sancreek-Regular.ttf";
                break;
            case 41:
                str = "ShadowsIntoLight-Regular.ttf";
                break;
            case 42:
                str = "Silkscreen-Regular.ttf";
                break;
            case 43:
            case 44:
                str = "Unbounded-VariableFont_wght.ttf";
                break;
            case 45:
                str = "UnifrakturMaguntia-Regular.ttf";
                break;
            case 46:
                str = "VT323-Regular.ttf";
                break;
            case 47:
                str = "Yellowtail-Regular.ttf";
                break;
            case 48:
            case 49:
            case 50:
                str = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (str == null) {
            return Boolean.FALSE;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (Intrinsics.d(((r1) obj2).f106644j, str)) {
                }
            } else {
                obj2 = null;
            }
        }
        r1 r1Var = (r1) obj2;
        if (r1Var == null) {
            return Boolean.FALSE;
        }
        this.f67983s = null;
        this.f67982r = 2;
        obj = kotlin.jvm.internal.j.M(this, lVar.f67991f.f89707c, new h(lVar, r1Var, null));
        return obj == aVar ? aVar : obj;
    }
}
