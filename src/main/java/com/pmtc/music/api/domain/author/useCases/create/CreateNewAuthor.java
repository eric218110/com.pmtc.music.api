package com.pmtc.music.api.domain.author.useCases.create;

import com.pmtc.music.api.domain.author.models.AuthorModel;
import com.pmtc.music.api.domain.author.protocols.http.dto.add.AddAuthorDTO;

public interface CreateNewAuthor {
    AuthorModel onCreateAuthor(AddAuthorDTO addAuthorDTO);
}
