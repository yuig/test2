package androidx.media;

import a.a;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;

/* loaded from: classes3.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f18730a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f18731b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f18732c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18733d = -1;

    public final boolean equals(Object obj) {
        int i13;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f18731b != audioAttributesImplBase.f18731b) {
            return false;
        }
        int i14 = this.f18732c;
        int i15 = audioAttributesImplBase.f18732c;
        int i16 = audioAttributesImplBase.f18733d;
        if (i16 == -1) {
            int i17 = audioAttributesImplBase.f18730a;
            int i18 = AudioAttributesCompat.f18726b;
            if ((i15 & 1) != 1) {
                i13 = 4;
                if ((i15 & 4) != 4) {
                    switch (i17) {
                        case 2:
                            i13 = 0;
                            break;
                        case 3:
                            i13 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i13 = 5;
                            break;
                        case 6:
                            i13 = 2;
                            break;
                        case 11:
                            i13 = 10;
                            break;
                        case 12:
                        default:
                            i13 = 3;
                            break;
                        case 13:
                            i13 = 1;
                            break;
                    }
                } else {
                    i13 = 6;
                }
            } else {
                i13 = 7;
            }
        } else {
            i13 = i16;
        }
        if (i13 == 6) {
            i15 |= 4;
        } else if (i13 == 7) {
            i15 |= 1;
        }
        return i14 == (i15 & RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE) && this.f18730a == audioAttributesImplBase.f18730a && this.f18733d == i16;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18731b), Integer.valueOf(this.f18732c), Integer.valueOf(this.f18730a), Integer.valueOf(this.f18733d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("AudioAttributesCompat:");
        if (this.f18733d != -1) {
            sb3.append(" stream=");
            sb3.append(this.f18733d);
            sb3.append(" derived");
        }
        sb3.append(" usage=");
        int i13 = this.f18730a;
        int i14 = AudioAttributesCompat.f18726b;
        switch (i13) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = a.d("unknown usage ", i13);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb3.append(str);
        sb3.append(" content=");
        sb3.append(this.f18731b);
        sb3.append(" flags=0x");
        sb3.append(Integer.toHexString(this.f18732c).toUpperCase());
        return sb3.toString();
    }
}
