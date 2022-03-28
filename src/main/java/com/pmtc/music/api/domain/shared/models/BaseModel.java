package com.pmtc.music.api.domain.shared.models;

import java.util.Date;
import java.util.UUID;

public abstract class BaseModel {
    public UUID uuid;
    public Date createdAt;
    public Date updateAt;
}
