package com.pinterest.qrCodeLogin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/pinterest/qrCodeLogin/QrCodeLoginLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/qrCodeLogin/b0", "QR_CODE_LOGIN", "qrCodeLogin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class QrCodeLoginLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ QrCodeLoginLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<QrCodeLoginLocation> CREATOR;

    @NotNull
    public static final b0 Companion;
    public static final QrCodeLoginLocation QR_CODE_LOGIN = new QrCodeLoginLocation() { // from class: com.pinterest.qrCodeLogin.QrCodeLoginLocation.QR_CODE_LOGIN

        /* renamed from: a, reason: collision with root package name */
        public final Class f50294a = z.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50295b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f50296c = true;

        @Override // com.pinterest.qrCodeLogin.QrCodeLoginLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF50294a() {
            return this.f50294a;
        }

        @Override // com.pinterest.qrCodeLogin.QrCodeLoginLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF50295b() {
            return this.f50295b;
        }

        @Override // com.pinterest.qrCodeLogin.QrCodeLoginLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.qrCodeLogin.QrCodeLoginLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF50296c() {
            return this.f50296c;
        }
    };

    private static final /* synthetic */ QrCodeLoginLocation[] $values() {
        return new QrCodeLoginLocation[]{QR_CODE_LOGIN};
    }

    static {
        QrCodeLoginLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b0();
        CREATOR = new com.pinterest.feature.todaytab.a(8);
    }

    public /* synthetic */ QrCodeLoginLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static QrCodeLoginLocation valueOf(String str) {
        return (QrCodeLoginLocation) Enum.valueOf(QrCodeLoginLocation.class, str);
    }

    public static QrCodeLoginLocation[] values() {
        return (QrCodeLoginLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public com.pinterest.framework.screens.g getF48755b() {
        return com.pinterest.framework.screens.g.DEFAULT;
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
    public abstract /* synthetic */ Class getF50294a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF50295b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45085c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF50296c() {
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

    private QrCodeLoginLocation(String str, int i13) {
    }
}
