package com.pmtc.music.api.infra.database.repository.create;

import com.pmtc.music.api.domain.author.models.AuthorModel;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface AddAuthorRepository extends Repository<AuthorModel, UUID> {

}
