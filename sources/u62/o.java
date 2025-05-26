package u62;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120856i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f120857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i13) {
        super(0);
        this.f120856i = i13;
        this.f120857j = tVar;
    }

    public final String b() {
        int i13 = this.f120856i;
        t tVar = this.f120857j;
        switch (i13) {
            case 0:
                Uri uri = tVar.f120889n;
                if (uri != null) {
                    return a.c.g("createStickerModel(): size is empty for imageUri=", uri);
                }
                Intrinsics.r("initialImageUri");
                throw null;
            default:
                ve.h hVar = tVar.f120890o;
                if (hVar == null) {
                    Intrinsics.r("cutoutEditorInputType");
                    throw null;
                }
                return "Error creating cutout model: " + hVar;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f120856i) {
        }
        return b();
    }
}
