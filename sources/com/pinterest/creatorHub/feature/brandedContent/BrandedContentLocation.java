package com.pinterest.creatorHub.feature.brandedContent;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import ed0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/pinterest/creatorHub/feature/brandedContent/BrandedContentLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "onScreenNavigation", "()V", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/creatorHub/feature/brandedContent/b", "BRANDED_CONTENT_AGREEMENT", "BRANDED_CONTENT_ENROLLED", "brandedContent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BrandedContentLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ BrandedContentLocation[] $VALUES;
    public static final BrandedContentLocation BRANDED_CONTENT_AGREEMENT = new BrandedContentLocation() { // from class: com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation.BRANDED_CONTENT_AGREEMENT

        /* renamed from: a, reason: collision with root package name */
        public final Class f44775a = ed0.c.class;

        @Override // com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45304a() {
            return this.f44775a;
        }
    };
    public static final BrandedContentLocation BRANDED_CONTENT_ENROLLED = new BrandedContentLocation() { // from class: com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation.BRANDED_CONTENT_ENROLLED

        /* renamed from: a, reason: collision with root package name */
        public final Class f44776a = k.class;

        @Override // com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45304a() {
            return this.f44776a;
        }
    };

    @NotNull
    public static final Parcelable.Creator<BrandedContentLocation> CREATOR;

    @NotNull
    public static final b Companion;

    private static final /* synthetic */ BrandedContentLocation[] $values() {
        return new BrandedContentLocation[]{BRANDED_CONTENT_AGREEMENT, BRANDED_CONTENT_ENROLLED};
    }

    static {
        BrandedContentLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
        CREATOR = new f1(16);
    }

    public /* synthetic */ BrandedContentLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static BrandedContentLocation valueOf(String str) {
        return (BrandedContentLocation) Enum.valueOf(BrandedContentLocation.class, str);
    }

    public static BrandedContentLocation[] values() {
        return (BrandedContentLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF46707b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF45304a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF50458b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45101d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF50459c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private BrandedContentLocation(String str, int i13) {
    }
}
